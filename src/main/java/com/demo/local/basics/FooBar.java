package com.demo.local.basics;

/**
 * Basic class to demonstrate how stack trace grows with multiple method calls.
 */
public class FooBar {

    public static void main(String[] args) {
        foo(); // 🧠 Step into and then into bar()
    }

    public static void foo() {
        System.out.println("foo");
        bar(); // Trace into call stack here
    }

    public static void bar() {
        System.out.println("bar");
    }
}
