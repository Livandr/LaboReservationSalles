package com.gestionsalledecours.service.mapper;

import com.gestionsalledecours.models.entities.User;
import com.gestionsalledecours.models.forms.RegisterForm;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {
    public User toEntity(RegisterForm form){
        if(form == null)
            return null;

        User user = new User();

        user.setLastname(form.getLastName());
        user.setFirstname(form.getFirstName());
        user.setRole(form.getRole());
        user.setEmail(form.getEmail());
        user.setLogin(form.getLogin());
        user.setPassword(form.getPassword());
        return user;
    }
}
