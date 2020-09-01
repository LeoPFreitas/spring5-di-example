package com.lfreitas.spring5diexample;

import com.lfreitas.spring5diexample.controllers.ConstructorInjectedController;
import com.lfreitas.spring5diexample.controllers.MyController;
import com.lfreitas.spring5diexample.controllers.PropertyInjectedController;
import com.lfreitas.spring5diexample.controllers.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5DiExampleApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring5DiExampleApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);

        System.out.println("--- Property ---");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean(
                "propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("--- Setter ---");
        SetterInjectionController setterInjectionController = (SetterInjectionController) ctx.getBean(
                "setterInjectionController");
        System.out.println(setterInjectionController.getGreeting());

        System.out.println("--- Constructor ---");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean(
                "constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

    }

}
