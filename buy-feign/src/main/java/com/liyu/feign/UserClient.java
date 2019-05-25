package com.liyu.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;



@FeignClient(value = "user-service",fallback = BackService.class)
public interface UserClient {

    @RequestMapping("/uri")
    String getUri();
}
