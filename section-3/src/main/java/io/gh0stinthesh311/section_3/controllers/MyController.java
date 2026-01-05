package io.gh0stinthesh311.section_3.controllers;

import io.gh0stinthesh311.section_3.services.GreetingService;
import io.gh0stinthesh311.section_3.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("Inside controller");
        return greetingService.sayGreeting();
    }
}
