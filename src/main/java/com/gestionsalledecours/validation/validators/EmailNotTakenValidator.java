package com.gestionsalledecours.validation.validators;

import com.gestionsalledecours.service.UserService;
import com.gestionsalledecours.validation.constraints.EmailNotTaken;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

@Component
public class EmailNotTakenValidator implements ConstraintValidator<EmailNotTaken, String> {

    private final UserService userService;

    public EmailNotTakenValidator(UserService userService){
        this.userService = userService;
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return userService.checkEmailNotTaken(email);
    }
}
