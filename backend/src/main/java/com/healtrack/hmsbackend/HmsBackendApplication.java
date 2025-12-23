package com.healtrack.hmsbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.healtrack.hmsbackend")
public class HmsBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(HmsBackendApplication.class, args);
    }
}
