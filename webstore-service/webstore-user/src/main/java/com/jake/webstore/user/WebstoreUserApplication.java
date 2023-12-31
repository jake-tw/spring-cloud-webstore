package com.jake.webstore.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.jake.webstore")
public class WebstoreUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebstoreUserApplication.class, args);
    }

}
