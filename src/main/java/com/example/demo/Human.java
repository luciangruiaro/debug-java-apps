package com.example.demo;

import java.util.Arrays;
import java.util.List;


public class Human {
    int age = 0;
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        List<Human> all = Arrays.asList(
                new Man("Martin"),
                new Woman("Ella"),
                new Man("Elvis"),
                new Man("Lisa")
        );
        for (int i = 0; i < 20; i++) {
            for (Human obj : all) {
                obj.inc();
            }
        }
    }

    private void inc() {
        // debug with filters
        age++;
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
