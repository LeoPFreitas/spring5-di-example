package com.lfreitas.spring5diexample.controllers;

import com.lfreitas.spring5diexample.services.GreetingService;
import com.lfreitas.spring5diexample.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectionControllerTest {
    SetterInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectionController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}