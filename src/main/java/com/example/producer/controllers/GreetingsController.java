package com.example.producer.controllers;

import com.example.producer.dtos.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingsController {

    @GetMapping("/hello")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(name, "Hello my dear");
    }

    @GetMapping("/goodbye")
    public Greeting bye(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(name, "Bye mr");
    }

}
