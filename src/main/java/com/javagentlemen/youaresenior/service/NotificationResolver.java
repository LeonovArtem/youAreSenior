package com.javagentlemen.youaresenior.service;

import com.javagentlemen.youaresenior.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// todo: List<Notification> notifications - нужно сказать что так можно делать. Заинжектить несколько сервисов с одним интерфесом.
// Еще пример можно тут посмотреть
// https://gitlab.dats.tech/a.leonov/trigger-campaign/-/blob/master/src/main/java/com/mostbet/triggerCampaign/operation/conditionParam/check/ParamCheckFactory.java
public class NotificationResolver {
    @Autowired
    List<Notification> notifications;

    public Notification resolveByUser(User user) {
        if (user.getId() % 2 == 0) {
            return notifications.get(0);
        } else {
            return notifications.get(1);
        }
    }
}
