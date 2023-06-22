package com.example.demo;

public class Dependent {

    public static void main(String[] args) {
        prepare();
        doGreatThings();
    }

    private static void doGreatThings() {
        for (int i = 0; i < 15; i++) {
//            doThings(i, "great things");
            doThings(i);
        }
    }

    private static void prepare() {
        for (int i = 0; i < 10000; i++) {
//            doThings(i, "prepare");
            doThings(i);
        }
    }

    private static void doThings(int i, String source) {
        int a = i;
        String output = source + " i = " + a;
        System.out.println(output);
    }

    private static void doThings(int i) {
        System.out.println("i = " + i);
    }
}
