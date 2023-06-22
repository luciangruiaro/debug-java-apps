package com.example.demo;

public class DebugExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " is even.");
            } else {
                System.out.println(numbers[i] + " is odd.");
            }
        }


        final int x = 10;
        int y = 0;
        try {
            int result = x / y;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        String[] names = {"Robo", "Konrad", "Ales", "Lukas"};
        for (String name : names) {
            if (name.startsWith("L")) {
                System.out.println(name + " starts with 'L'.");
            } else {
                System.out.println(name + " does not start with 'L'.");
            }
        }

        calculate((a, b) -> a * b, 5, 3);
    }

    public static void calculate(Calculator calculator, int a, int b) {
        int result = calculator.calculate(a, b);
        System.out.println("Result: " + result);
    }

    interface Calculator {
        int calculate(int a, int b);
    }

}
