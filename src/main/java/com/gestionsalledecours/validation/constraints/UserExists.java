package com.gestionsalledecours.validation.constraints;

import com.gestionsalledecours.validation.validators.UserExistsValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UserExistsValidator.class)
public @interface UserExists {

    String message() default "user not found";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };


}
