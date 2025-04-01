package com.demo.local.oop;

/**
 * Returns an anonymous implementation of the Methods.Interf interface.
 * Good for debugging anonymous classes and inspecting runtime type.
 */
public class Somewhere {

    public static Methods.Interf getObject() {
        // 🧠 Place breakpoint here to explore anonymous class instantiation
        return new Methods.Interf() {
            @Override
            public String foo() {
                return "foo has been called";
            }

            @Override
            public String bar() {
                return "bar has been called";
            }
        };
    }
}
