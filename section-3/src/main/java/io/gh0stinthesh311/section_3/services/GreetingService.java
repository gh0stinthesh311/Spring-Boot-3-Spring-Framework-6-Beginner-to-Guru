package io.gh0stinthesh311.section_3.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public interface GreetingService {
    String sayGreeting();
}
