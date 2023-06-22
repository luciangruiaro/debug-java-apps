package com.demo.jdebugging;

import java.util.ArrayList;
import java.util.List;

public class LambdasLists {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> doubledNumbers = new ArrayList<>();
        List<Integer> filteredNumbers = new ArrayList<>();

        numbers.stream().map(n -> n * 2).forEach(doubledNumbers::add);

        doubledNumbers.stream()
                .filter(n -> n > 5) // Set a breakpoint on this line
                .forEach(filteredNumbers::add); // Set a breakpoint on this line

        System.out.println("Original numbers: " + numbers);
        System.out.println("Doubled numbers: " + doubledNumbers);
        System.out.println("Filtered numbers: " + filteredNumbers);
    }
}

