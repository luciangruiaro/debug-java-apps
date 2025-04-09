package com.demo.remote.controller;

import com.demo.remote.service.GreetingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    private final GreetingService service;

    public HelloController(GreetingService service) {
        this.service = service;
    }

    @PostMapping("/hello")
    public int hello(@RequestParam(defaultValue = "world") String name) {
        return service.generateGreeting(name); // 🔍 Debug into this
    }

    @PostMapping("/hello/batch")
    public List<String> helloMany(@RequestBody List<String> names) {
        return service.generateBatchGreetings(names); // 🧠 Debug stream processing
    }
}
