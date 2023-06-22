package com.demo.jdebugging;

public class Methods {
    public static void main(String[] args) {
        Interf obj = Somewhere.getObject();
//        System.out.println(obj.foo());
        System.out.println(obj.bar());
    }

    public interface Interf {
        String foo();

        String bar();
    }

    public static class Clazz3 extends Clazz2 {
        @Override
        public String foo() {
            System.out.println("Called foo");
            return "Clazz 3";
        }
    }

    public static class Clazz2 extends Clazz1 {
        @Override
        public String bar() {
            return "Clazz 2";
        }
    }

    public static class Clazz1 {
        public String foo() {
            return "foo";
        }

        public String bar() {
            return "bar";
        }
    }
}
