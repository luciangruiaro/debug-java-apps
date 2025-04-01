package com.demo.local.basics;

/**
 * Demonstrates basic Java debugging scenarios:
 * - Conditional logic
 * - Exception handling
 * - Lambda functions
 * This class is intended for live debugging practice in IntelliJ.
 */
public class DebugExample {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Breakpoint here to inspect iteration over numbers
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        }

        // Example of exception handling and division by zero
        final int numerator = 10;
        int denominator = 0;
        try {
            int result = numerator / denominator; // Place breakpoint to inspect division
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage()); // Debug here to inspect caught error
        }

        // String filtering demo
        String[] names = {"Robo", "Konrad", "Ales", "Lukas"};
        for (String name : names) {
            if (name.startsWith("L")) {
                System.out.println(name + " starts with 'L'.");
            } else {
                System.out.println(name + " does not start with 'L'.");
            }
        }

        // Demonstrate lambda function
        calculate((a, b) -> a * b, 5, 3); // Step into this lambda to debug
    }

    /**
     * Demonstrates higher-order function usage for arithmetic operations.
     *
     * @param calculator Lambda or functional interface to perform calculation
     * @param a          First operand
     * @param b          Second operand
     */
    public static void calculate(Calculator calculator, int a, int b) {
        int result = calculator.calculate(a, b);
        System.out.println("Lambda result: " + result);
    }

    @FunctionalInterface
    interface Calculator {
        int calculate(int a, int b);
    }
}
