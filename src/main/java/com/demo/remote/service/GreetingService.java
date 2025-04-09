package com.demo.remote.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Service for generating greetings with OOP and Functional styles.
 * Ideal for remote debugging: you can place breakpoints inside each method.
 */
@Service
public class GreetingService {

    /**
     * OOP-style logic: resolves greeting from a specific type of greeter.
     */
    public int generateGreeting(String name) {
        return 6;
    }

    /**
     * Functional-style logic: transforms a list of names into greetings using streams.
     */
    public List<String> generateBatchGreetings(List<String> names) {
        return names.stream().map(n -> {
                    String greeting = "Hi " + n + "!"; // 🛑 Set breakpoint here
                    return greeting;
                })
//                .peek(g -> System.out.println("[After map] " + g))


                .collect(Collectors.toList());
    }

    // === OOP hierarchy ===

    interface Greeter {
        String greet(String name);
    }

    static class FriendlyGreeter implements Greeter {
        public String greet(String name) {
            return "Hey " + name + ", how's it going?";
        }
    }

    static class FormalGreeter implements Greeter {
        public String greet(String name) {
            return "Good day, " + name + ".";
        }
    }
}
