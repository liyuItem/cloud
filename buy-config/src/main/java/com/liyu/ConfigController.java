package com.liyu;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {



    @GetMapping("/uri")
    public String getUri() throws InterruptedException {
        System.out.println("服务2");
        return "liyu1";
    }
}
