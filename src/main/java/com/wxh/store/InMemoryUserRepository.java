package com.wxh.store;


import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class InMemoryUserRepository implements UserRepository {
    private final Map<String, User> users = new HashMap<>();

    @Override
    public User findByEmail(String email) {
        return users.getOrDefault(email, null);
    }

    @Override
    public void save(User user) {
        System.out.println("Saving user: " + user);
        users.put(user.getEmail(), user);
    }
}
