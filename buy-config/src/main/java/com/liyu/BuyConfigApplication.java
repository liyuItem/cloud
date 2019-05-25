package com.liyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BuyConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuyConfigApplication.class, args);
    }

}
