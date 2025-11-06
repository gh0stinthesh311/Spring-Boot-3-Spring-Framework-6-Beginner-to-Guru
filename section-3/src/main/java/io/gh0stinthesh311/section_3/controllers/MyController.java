package io.gh0stinthesh311.section_3.controllers;

import io.gh0stinthesh311.section_3.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String sayHello() {
        System.out.println("Inside controller");
        return "hi";
    }
}
