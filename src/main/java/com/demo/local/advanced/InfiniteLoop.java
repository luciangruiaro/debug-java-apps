package com.demo.local.advanced;

import java.io.IOException;

/**
 * Simulates a real-time system using an infinite loop to process input.
 * Used for live breakpoint and hot-swap demos.
 */
public class InfiniteLoop {
    public static void main(String[] args) throws IOException {
        while (true) {
            int input = System.in.read(); // 🛑 Breakpoint here to read input live
            System.out.println("Input: " + input);

            // 🔍 Use condition breakpoint: input != '\n' && input != 'a'
            if (filter(input)) {
                process(input);
            }
        }
    }

    private static void process(int arg) {
        // 🧠 Break here to check branching
        if (Math.max(arg, 75) % 2 == 0) {
            System.out.println("! YAY !");
        }
    }

    private static boolean filter(int input) {
        return input != '\n' && input != 'a';
    }
}
