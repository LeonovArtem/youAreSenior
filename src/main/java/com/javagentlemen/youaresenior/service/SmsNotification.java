package com.javagentlemen.youaresenior.service;

import org.springframework.stereotype.Service;

@Service
public class SmsNotification implements Notification{
    @Override
    public void sendMessage() {
        System.out.println("sms");
    }
}
