package com.azure.dependencyinjectionexamples.services;

import com.azure.dependencyinjectionexamples.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! - Setter";
    }
}
