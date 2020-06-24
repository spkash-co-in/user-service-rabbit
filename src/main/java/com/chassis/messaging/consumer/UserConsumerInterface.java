package com.chassis.messaging.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface UserConsumerInterface {
    @Input("UserChannel")
    SubscribableChannel consumeMessage();
}
