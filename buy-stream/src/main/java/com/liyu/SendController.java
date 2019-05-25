package com.liyu;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendController {

    @Autowired
    SendService sendService;

    @GetMapping("/api/send/{msg}")
    public void sendMsg(@PathVariable(value = "msg") String msg) {
        sendService.sendMsg(msg);
    }
}
