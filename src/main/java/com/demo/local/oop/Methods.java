package com.demo.local.oop;

/**
 * Demonstrates:
 * - Interface implementation via anonymous class (in Somewhere.java)
 * - Inheritance with overridden methods
 * - Debugging runtime object type and call resolution
 */
public class Methods {

    public static void main(String[] args) {
        // 🔍 STEP-INTO ENTRY POINT
        // Step into getObject() to see the real class behind the Interf reference
        Interf obj = Somewhere.getObject();

        // 🔍 STEP INTO METHOD
        // Uncomment this to step into the 'foo()' method and observe polymorphism
        System.out.println(obj.foo());

        // 🛑 SET BREAKPOINT HERE
        // Place a breakpoint here to inspect:
        // - Runtime class of 'obj'
        // - Method resolution: which implementation of 'bar()' is called
        //  obj.getClass().getName()
        System.out.println(obj.bar());
    }

    /**
     * Interface with two methods to be implemented.
     */
    public interface Interf {
        String foo();

        String bar();
    }

    /**
     * Base class with default implementations.
     */
    public static class Clazz1 {
        public String foo() {
            return "foo";
        }

        public String bar() {
            return "bar";
        }
    }

    /**
     * Extends Clazz1 and overrides only 'bar()'.
     */
    public static class Clazz2 extends Clazz1 {
        @Override
        public String bar() {
            return "Clazz 2";
        }
    }

    /**
     * Extends Clazz2 and overrides only 'foo()'.
     */
    public static class Clazz3 extends Clazz2 {
        @Override
        public String foo() {
            System.out.println("Called foo");
            return "Clazz 3";
        }
    }

    public static class Clazz3Adapter extends Clazz3 implements Interf {
        @Override
        public String foo() {
            return super.foo();
        }

        @Override
        public String bar() {
            return super.bar();
        }
    }

}
