package fr.dovard.sushifeistback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Hello from sushi feist";
    }

    @GetMapping("/test")
    public String test() {
        return "from Test";
    }

}
