package com.malamute.sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:META-INF/spring/camel-context.xml")
public class SpringCamelSandboxApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringCamelSandboxApp.class, args);
    }

}