package com.lfreitas.spring5diexample.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayHello() {
        return "HelloWorld! - Setter";
    }
}
