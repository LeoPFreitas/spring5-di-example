package com.lfreitas.spring5diexample.controllers;

import com.lfreitas.spring5diexample.services.GreetingService;

public class SetterInjectionController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayHello();
    }
}
