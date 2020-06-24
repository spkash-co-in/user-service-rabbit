package com.chassis.web.rest;

import com.chassis.model.User;
import com.chassis.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@AllArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class UserController {
    private UserService userService;
    @PostMapping("/message")
    public Object[] publishCustomer(@RequestBody User user) {
        return userService.publishCustomer(user);
    }
}
