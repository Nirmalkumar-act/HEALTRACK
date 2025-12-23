package com.healtrack.hmsbackend.service;

import com.healtrack.hmsbackend.model.User;

public interface AuthService {

    User register(User user);

    User login(String email, String password);
}
