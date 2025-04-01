package com.demo.local.advanced;

import java.util.Random;

/**
 * Demonstrates field access/modification breakpoints in IntelliJ.
 */
public class FieldBreakpoint {

    // Static field to watch with a field breakpoint
    public static int var = new Random().nextInt(400);

    // Instance field that we update through a setter
    private String message = "Hello, world!";

    public static void main(String[] args) {
        FieldBreakpoint example = new FieldBreakpoint();

        // 🔍 Set field modification/watchpoint on `message`
        example.setMessage("New message");

        // 🔍 Set field modification/watchpoint on `var`
        var = 25;

        // 🔍 Breakpoint here to observe the current message
        example.printMessage();
    }

    public void setMessage(String message) {
        // 🐞 Use method breakpoint to step into setter logic
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Message: " + message);
    }
}
