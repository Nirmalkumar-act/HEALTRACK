package com.healtrack.hmsbackend.service;

import com.healtrack.hmsbackend.model.User;
import java.util.Optional;

public interface AuthService {
    String register(User user);
    Optional<User> login(User user);
}
