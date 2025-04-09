package com.demo.local.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Demonstrates a race condition using two threads attempting to add to a shared list.
 * Shows how to use thread debugging and breakpoints in parallel flows.
 */
public class MultiThreading {

    public static void main(String[] args) throws InterruptedException {
        work();
    }


    /**
     * Launches two threads attempting to add the same element to a shared list.
     */
    static List<Integer> work() throws InterruptedException {
        final List<Integer> list = new ArrayList<>(); // CopyOnWriteArrayList Collections.synchronizedList


//        thread.start(); // 🔍 Watch this thread's execution in Debugger
//        alist, 10); // 🔍 Main thread also calls it
        list.add(new Random().nextInt(10));

//        thread.join();

        System.out.println("Elements: " + list);
        return list;
    }

    /**
     * Adds an element to the list only if it's not already present.
     * Introduces randomness to cause potential race condition.
     * private static synchronized void addIfAbsent()
     */

}
