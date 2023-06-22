package com.demo.jdebugging;

import java.util.Random;

public class FieldBreakpoint {
    public static int var = new Random().nextInt(400);
    private String message = "Hello, world!";

    public static void main(String[] args) {
        FieldBreakpoint example = new FieldBreakpoint();
        example.setMessage("New message"); // Set a breakpoint on this line
        var = 25;
        example.printMessage(); // Set a breakpoint on this line
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
    }
}
