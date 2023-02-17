package com.gestionsalledecours.service.Impl;

import com.gestionsalledecours.repository.UserRepository;
import com.gestionsalledecours.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public boolean checkEmailNotTaken(String email) {
        return !userRepository.existsByEmail(email);
    }
}
