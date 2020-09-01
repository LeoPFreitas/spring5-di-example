package com.lfreitas.spring5diexample.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World - from the PRIMARY Been";
    }
}
