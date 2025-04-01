package com.demo.local.oop;

/**
 * Demonstrates:
 * - Interface implementation via anonymous class
 * - Inheritance with overridden methods
 */
public class Methods {

    public static void main(String[] args) {
        // 🔍 Step into getObject() from Somewhere.java
        Interf obj = Somewhere.getObject();

        // Uncomment to step into foo() as well
        // System.out.println(obj.foo());

        // 🛑 Breakpoint here to inspect actual class of obj
        System.out.println(obj.bar());
    }

    public interface Interf {
        String foo();

        String bar();
    }

    public static class Clazz1 {
        public String foo() {
            return "foo";
        }

        public String bar() {
            return "bar";
        }
    }

    public static class Clazz2 extends Clazz1 {
        @Override
        public String bar() {
            return "Clazz 2";
        }
    }

    public static class Clazz3 extends Clazz2 {
        @Override
        public String foo() {
            System.out.println("Called foo");
            return "Clazz 3";
        }
    }
}
