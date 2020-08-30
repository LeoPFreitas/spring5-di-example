package com.lfreitas.spring5diexample.controllers;

import com.lfreitas.spring5diexample.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayHello();
    }
}
