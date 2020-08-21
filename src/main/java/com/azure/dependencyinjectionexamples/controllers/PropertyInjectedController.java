package com.azure.dependencyinjectionexamples.controllers;

import com.azure.dependencyinjectionexamples.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
