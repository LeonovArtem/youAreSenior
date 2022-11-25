package com.javagentlemen.youaresenior.repository;

import com.javagentlemen.youaresenior.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
/**
 * с final - работать не будет. Получим ошибку во время компиляции (Could not generate CGLIB subclass..)
  */
public class UserRepository {
    private final EntityManager em;

    @Transactional
    public void save(User user) {
        saveInMethod(user);
    }

    public void saveInMethod(User user) {
        em.persist(user);
        em.flush();
    }
}
