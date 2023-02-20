package com.gestionsalledecours.service.Impl;

import com.gestionsalledecours.models.entities.User;
import com.gestionsalledecours.models.forms.RegisterForm;
import com.gestionsalledecours.repository.UserRepository;
import com.gestionsalledecours.service.UserService;
import com.gestionsalledecours.service.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper){
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public void register(RegisterForm form) {
        User user = userMapper.toEntity(form);
    }

    @Override
    public boolean checkEmailNotTaken(String email) {
        return !userRepository.existsByEmail(email);
    }

    @Override
    public boolean userExists(String password, String login) {
        return userRepository.existsByLoginAndPassword(login, password);
    }
}
