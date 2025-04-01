package com.demo.local.oop;

import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates inheritance and polymorphism for filtered debugging.
 */
public class Human {
    private final String name;
    int age = 0;

    public Human(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        List<Human> all = Arrays.asList(new Man("Martin"), new Woman("Ella"), new Man("Elvis"), new Man("Lisa") //
                // Debug tip: this is not a Woman
        );

        // 🧠 Use instance filters (debug only if obj is Woman)
        for (int i = 0; i < 20; i++) {
            for (Human obj : all) {
                obj.inc(); // Place conditional breakpoint: obj instanceof Woman
            }
        }
    }

    protected void inc() {
        age++; // 🔍 Observe how many times this is called per object
    }

    public static class Man extends Human {
        private String eyeColor;

        public Man(String name) {
            super(name);
        }
    }

    public static class Woman extends Human {
        private String eyeColor;

        public Woman(String name) {
            super(name);
        }
    }
}
