package com.liyu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BuyServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuyServerApplication.class, args);
    }
}
