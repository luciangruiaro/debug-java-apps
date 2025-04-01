package com.demo.local.advanced;

/**
 * Simulates a preparation and execution cycle.
 * Used to explore method overloading and loop iterations.
 */
public class Dependent {

    public static void main(String[] args) {
        prepare();        // 🔍 Step into long loop
        doGreatThings();  // 🔍 Step into second loop
    }

    private static void doGreatThings() {
        for (int i = 0; i < 15; i++) {
            doThings(i); // You can compare with doThings(i, "great things");
        }
    }

    private static void prepare() {
        for (int i = 0; i < 10000; i++) {
            doThings(i); // 🔍 Add watchpoint on 'i' or pause after 100 iterations
        }
    }

    private static void doThings(int i, String source) {
        int a = i;
        String output = source + " i = " + a;
        System.out.println(output);
    }

    private static void doThings(int i) {
        System.out.println("i = " + i); // Basic output; use step over
    }
}
