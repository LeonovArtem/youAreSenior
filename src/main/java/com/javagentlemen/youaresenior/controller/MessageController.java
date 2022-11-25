package com.javagentlemen.youaresenior.controller;

import com.javagentlemen.youaresenior.entity.User;
import com.javagentlemen.youaresenior.service.NotificationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
public class MessageController {
    @Autowired
    NotificationResolver notificationResolver;

    @GetMapping
    public void send() {
        var user1 = new User(1);
        var user2 = new User(2);
        var notification1 = notificationResolver.resolveByUser(user1);
        var notification2 = notificationResolver.resolveByUser(user2);

        notification1.sendMessage();
        notification2.sendMessage();
    }
}
