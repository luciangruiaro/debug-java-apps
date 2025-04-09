package com.demo.local.oop;

/**
 * Returns an anonymous implementation of the Methods.Interf interface.
 * Good for debugging anonymous classes and inspecting runtime type.
 */
public class Somewhere {

    public static Methods.Interf getObject() {
        boolean useAnon = false;

        if (useAnon) {
            // 🔍 Demo: Anonymous class
            return new Methods.Interf() {
                @Override
                public String foo() {
                    return "foo from anonymous";
                }

                @Override
                public String bar() {
                    return "bar from anonymous";
                }
            };
        } else {
            // 🔍 Demo: Concrete class that inherits logic
            return new Methods.Clazz3Adapter();
        }
    }

}
