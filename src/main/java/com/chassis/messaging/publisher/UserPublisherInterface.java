package com.chassis.messaging.publisher;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface UserPublisherInterface {
    @Output("UserChannel")
    MessageChannel publishUser();
}
