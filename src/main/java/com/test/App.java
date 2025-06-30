package com.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class App {
    Logger logger = LoggerFactory.getLogger(App.class);

    @GetMapping("/ping")
    public String message() {
        logger.info("CI/CD app started successfully..");
        return "CI/CD Application Deployed successfully in ..";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}