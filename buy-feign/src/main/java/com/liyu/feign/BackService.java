package com.liyu.feign;


import org.springframework.stereotype.Component;

/**
 * 请求熔断
 */
@Component
public class BackService  implements  UserClient{
    @Override
    public String getUri() {
        return "";
    }
}
