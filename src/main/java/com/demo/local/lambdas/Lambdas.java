package com.demo.local.lambdas;

import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates how lambda expressions and streams work.
 * Use IntelliJ's stream chain debugger to inspect each transformation.
 */
public class Lambdas {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Original numbers: " + numbers);

        // 🧠 Use "Trace Current Stream Chain" in IntelliJ (Ultimate)
        numbers.stream().map(n -> n * 2)         // Breakpoint here: map transformation
                .filter(n -> n > 5)      // Breakpoint here: filter condition
                .forEach(System.out::println); // Final result output
    }
}
