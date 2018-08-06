package com.ezscrum.microservice.servicediscoverer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServicediscovererApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicediscovererApplication.class, args);
    }
}
