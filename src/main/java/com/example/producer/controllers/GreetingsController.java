package com.example.jms.controllers;

import com.example.jms.dtos.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingsController {
    private static final String helloTemplate = "Hello, %s!";
    private static final String goodbyeTemplate = "Bye, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(helloTemplate, name));
    }

    @GetMapping("/goodbye")
    public Greeting bye(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(goodbyeTemplate, name));
    }


}
