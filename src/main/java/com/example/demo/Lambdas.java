package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class Lambdas {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("Original numbers: " + numbers);

        numbers.stream()
                .map(n -> n * 2) // Set a breakpoint on this line
                .filter(n -> n > 5) // Set a breakpoint on this line
                .forEach(System.out::println); // Set a breakpoint on this line
    }
}

