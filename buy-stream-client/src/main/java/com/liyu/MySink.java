package com.liyu;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MySink {

    String INPUT = "myInput";

    @Input("myInput")
    SubscribableChannel myInput();
}
