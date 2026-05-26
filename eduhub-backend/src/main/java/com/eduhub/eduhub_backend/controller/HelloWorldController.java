package com.eduhub.eduhub_backend.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
    private final Environment environment;
    @Value("${spring.application.name}")
    private String appName;
    public HelloWorldController(Environment environment) {
        this.environment = environment;
    }
    @GetMapping("Hello-world")
    public String helloWorld(){
        return "Hello World";}
        @GetMapping("/env")
                private String getEnviromentVariable(){
        String port = environment.getProperty("server.port");
        return "App Name:" +appName+", Port:"+ port;



        }

}