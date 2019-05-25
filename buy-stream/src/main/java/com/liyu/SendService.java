package com.liyu;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;


@EnableBinding(Source.class)
public class SendService {

    @Autowired
    Source source;

    public void sendMsg(){
        source.output().send(MessageBuilder.withPayload("sss").build());
    }

}
