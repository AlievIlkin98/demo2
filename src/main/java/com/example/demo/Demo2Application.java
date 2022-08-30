package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Path;
import java.util.Collections;
import java.util.Properties;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Demo2Application.class);
        springApplication.setDefaultProperties(Collections.singletonMap("server.port","8088"));
        springApplication.run(args);
    }

}
