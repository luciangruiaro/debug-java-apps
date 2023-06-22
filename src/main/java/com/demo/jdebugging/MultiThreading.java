package com.demo.jdebugging;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultiThreading {

    static List<Integer> work() throws InterruptedException {
        final List<Integer> list = new ArrayList<>();
        Thread thread = new Thread(() -> {
            try {
                addIfAbsent(list, 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        addIfAbsent(list, 10);
        thread.join();
        System.out.println("Elements: " + list);
        return list;
    }

    private static void addIfAbsent(List<Integer> list, int i) throws InterruptedException {
        if (!list.contains(i)) {
          Thread.sleep(new Random().nextInt(100));
            list.add(i);
        }
    }



    @Test
    void main() throws InterruptedException {
        Assertions.assertSame(1, work().size());
    }


}
