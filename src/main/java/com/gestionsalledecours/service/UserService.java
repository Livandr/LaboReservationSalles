package com.gestionsalledecours.service;

import com.gestionsalledecours.models.forms.RegisterForm;

public interface UserService {

    void register(RegisterForm form);
    boolean checkEmailNotTaken(String email);
    boolean userExists(String password, String login);
}
