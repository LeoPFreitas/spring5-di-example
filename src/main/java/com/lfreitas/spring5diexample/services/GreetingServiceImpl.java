package com.lfreitas.spring5diexample.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "HelloWorld!";
    }
}
