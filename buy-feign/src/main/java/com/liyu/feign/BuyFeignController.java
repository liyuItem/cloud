package com.liyu.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuyFeignController {

    @Autowired
    UserClient userClient;

    @GetMapping("/uri")
    public String getUri(){
        return userClient.getUri();
    }
}
