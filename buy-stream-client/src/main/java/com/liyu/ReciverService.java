package com.liyu;


import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding({MySink.class})
public class ReciverService {


    @StreamListener(MySink.INPUT)
    public void receive(Object o){
        System.out.println(o);
    }
}
