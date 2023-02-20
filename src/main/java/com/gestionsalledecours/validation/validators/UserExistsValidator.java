package com.gestionsalledecours.validation.validators;

import com.gestionsalledecours.models.forms.ConnectionForm;
import com.gestionsalledecours.service.UserService;
import com.gestionsalledecours.validation.constraints.UserExists;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

@Component
public class UserExistsValidator implements ConstraintValidator<UserExists, ConnectionForm> {
    private final UserService userService;

    public UserExistsValidator(UserService userService){
        this.userService = userService;
    }

    @Override
    public boolean isValid(ConnectionForm form, ConstraintValidatorContext constraintValidatorContext) {
        return userService.userExists(form.getPassword(), form.getLogin());
    }
}
