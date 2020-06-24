package com.chassis.messaging.consumer;

import com.chassis.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@EnableBinding(UserConsumerInterface.class)
public class UserConsumer {
    @StreamListener(target = "UserChannel")
    public void consume(User user) {
        log.info("Consume user : {}", user);
    }
}
