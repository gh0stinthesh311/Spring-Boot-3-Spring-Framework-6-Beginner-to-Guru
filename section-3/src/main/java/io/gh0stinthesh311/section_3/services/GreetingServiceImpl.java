package io.gh0stinthesh311.section_3.services;

import org.springframework.context.annotation.Bean;


public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from Greeting service";
    }
}
