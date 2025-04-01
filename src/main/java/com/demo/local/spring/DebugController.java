package com.demo.local.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST Controller with logic for live debugging.
 * Test using: GET /debug?value=7
 */
@RestController
public class DebugController {

    @GetMapping("/debug")
    public String debugExample(@RequestParam int value) {
        // 🧠 Add conditional breakpoint: value > 10
        int result = computeSomething(value);
        return "Computed value: " + result;
    }

    private int computeSomething(int input) {
        // Simulated bug: division by zero if input is 0
        int base = 10;
        int risky = input - 7; // Try with input = 7

        int result = base / risky;
        return result * 2;
    }
}
