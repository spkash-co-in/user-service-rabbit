package com.chassis.service;

import com.chassis.messaging.publisher.UserPublisher;
import com.chassis.model.User;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
@Service
public class UserService {
    private UserPublisher userPublisher;
    public Object[] publishCustomer(User user) {
        return userPublisher.publishCustomer(user);
    }
}
