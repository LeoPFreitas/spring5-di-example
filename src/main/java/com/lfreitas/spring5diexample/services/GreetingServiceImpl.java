package com.lfreitas.spring5diexample.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "HelloWorld!";
    }
}
