package com.javagentlemen.youaresenior.controller;

import com.javagentlemen.youaresenior.entity.User;
import com.javagentlemen.youaresenior.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @PutMapping
    public void create() {
        userRepository.save(new User());
    }
}
