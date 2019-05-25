package com.liyu.buyzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class BuyZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuyZuulApplication.class, args);
    }

}
