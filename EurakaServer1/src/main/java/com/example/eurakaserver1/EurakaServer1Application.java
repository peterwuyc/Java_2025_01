package com.example.eurakaserver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurakaServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurakaServer1Application.class, args);
    }

}
