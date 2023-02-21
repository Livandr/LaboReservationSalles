package com.gestionsalledecours.validation.validators;

import com.gestionsalledecours.models.forms.RegisterForm;
import com.gestionsalledecours.validation.constraints.PasswordConfirmed;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordConfirmedValidator implements ConstraintValidator<PasswordConfirmed, RegisterForm> {

    @Override
    public boolean isValid(RegisterForm form, ConstraintValidatorContext constraintValidatorContext) {
        return form.getPassword().equals(form.getPasswordConfirmed());
    }
}
