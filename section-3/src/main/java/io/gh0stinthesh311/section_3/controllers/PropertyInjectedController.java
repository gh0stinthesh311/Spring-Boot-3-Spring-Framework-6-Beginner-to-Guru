package io.gh0stinthesh311.section_3.controllers;

import io.gh0stinthesh311.section_3.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
