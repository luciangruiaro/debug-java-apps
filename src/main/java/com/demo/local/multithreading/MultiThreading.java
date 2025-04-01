package com.demo.local.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Demonstrates a race condition using two threads attempting to add to a shared list.
 * Shows how to use thread debugging and breakpoints in parallel flows.
 */
public class MultiThreading {

    /**
     * Launches two threads attempting to add the same element to a shared list.
     */
    static List<Integer> work() throws InterruptedException {
        final List<Integer> list = new ArrayList<>();

        Thread thread = new Thread(() -> {
            try {
                addIfAbsent(list, 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start(); // 🔍 Watch this thread's execution in Debugger
        addIfAbsent(list, 10); // 🔍 Main thread also calls it

        thread.join();

        System.out.println("Elements: " + list);
        return list;
    }

    /**
     * Adds an element to the list only if it's not already present.
     * Introduces randomness to cause potential race condition.
     */
    private static void addIfAbsent(List<Integer> list, int i) throws InterruptedException {
        if (!list.contains(i)) {
            Thread.sleep(new Random().nextInt(100)); // 🐢 Random delay to simulate race
            list.add(i); // 🛑 Breakpoint here to check concurrent access
        }
    }

}
