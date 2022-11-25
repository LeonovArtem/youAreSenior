package com.javagentlemen.youaresenior.repository;

import com.javagentlemen.youaresenior.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public final class UserRepository {
    private final EntityManager em;

    @Transactional
    public void save(User user) {
        em.persist(user);
        em.flush();
    }
}
