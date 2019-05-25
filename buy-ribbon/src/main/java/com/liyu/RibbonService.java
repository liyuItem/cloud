package com.liyu;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.command.AsyncResult;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 异步编程
     *
     * @return
     * @throws ExecutionException
     * @throws InterruptedException
     */
    @HystrixCommand(fallbackMethod = "hello")
    public String ss() throws ExecutionException, InterruptedException {
        long curr=System.currentTimeMillis();
        Future<String> future = new AsyncResult<String>() {
            @Override
            public String invoke() {
                System.out.println("进行中");
                return restTemplate.getForObject("http://user-service/uri", String.class);
            }

            @Override
            public String get() {
                return invoke();
            }
        };
        System.out.println("dasd");
        long curr1=System.currentTimeMillis();
        System.out.println(System.currentTimeMillis()-curr);
        System.out.println(System.currentTimeMillis()-curr1);
        return "11";
    }

    public String hello() {
        return "error";
    }


}
