package com.azure.dependencyinjectionexamples;

import com.azure.dependencyinjectionexamples.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionExamplesApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionExamplesApplication.class, args);
        MyController myController = ctx.getBean("myController", MyController.class);

        String greeting = myController.sayHello();
        System.out.println(greeting);
    }

}
