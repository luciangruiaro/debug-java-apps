package com.demo.local.lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates lambda operations with side effects (storing intermediate results).
 * Helps visualize stream transformations during debugging.
 */
public class LambdasLists {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> doubledNumbers = new ArrayList<>();
        List<Integer> filteredNumbers = new ArrayList<>();

        // 🛑 Step over or into stream, observe effects in debugger
        numbers.stream()
                .map(n -> n * 2)
                .forEach(doubledNumbers::add);

        doubledNumbers.stream()
                .filter(n -> n > 5) // 🧠 Conditional breakpoint: n > 5
                .forEach(filteredNumbers::add);

        System.out.println("Original numbers: " + numbers);
        System.out.println("Doubled numbers: " + doubledNumbers);
        System.out.println("Filtered numbers: " + filteredNumbers);
    }
}
