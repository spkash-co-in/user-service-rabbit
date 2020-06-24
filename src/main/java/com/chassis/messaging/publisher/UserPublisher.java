package com.chassis.messaging.publisher;

import com.chassis.model.User;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@EnableBinding(UserPublisherInterface.class)
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UserPublisher {
    private UserPublisherInterface userPublisherInterface;
    public Object[] publishCustomer(User user) {
        Message<User> message = MessageBuilder.withPayload(user).build();
        userPublisherInterface.publishUser().send(message);
        return message.getHeaders().entrySet().toArray();
    }
}
