package com.demo.jdebugging;

import java.io.IOException;

public class InfiniteLoop {
    public static void main(String args[]) throws IOException {
        while (true) {
            int input = System.in.read();
            System.out.println("Input: " + input);
            if (filter(input)) {
                process(input);
            }
        }
    }

    private static void process(int arg) {
        if (Math.max(arg, 75) % 2 == 0) {
            System.out.println("! YAY !");
        }
    }

    private static boolean filter(int input) {
        return input != '\n' && input != 'a';
    }

}
