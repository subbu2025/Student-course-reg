package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient


@SpringBootApplication
// Ensuring all components are scanned
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
