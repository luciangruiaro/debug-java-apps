package com.example.demo;

public class Somewhere {
    public static Methods.Interf getObject() {
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
