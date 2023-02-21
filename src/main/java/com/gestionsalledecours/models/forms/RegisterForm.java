package com.gestionsalledecours.models.forms;

import com.gestionsalledecours.models.entities.Role;
import com.gestionsalledecours.validation.constraints.EmailNotTaken;
import com.gestionsalledecours.validation.constraints.PasswordConfirmed;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@PasswordConfirmed
public class RegisterForm {

    @NotBlank(message = "enter your email adress")
    @Email
    @EmailNotTaken
    private String email;

    @NotBlank (message = "enter a login")
    private String login;

    @NotBlank(message = "enter a password")
    @Size(min = 6)
    private String password;

    @NotBlank(message = "confirm your password")
    private String passwordConfirmed;

    @NotBlank (message = "enter your lastname")
    private String lastName;

    @NotBlank (message = "enter your firstname")
    private String firstName;

    @NotBlank (message = "select a role")
    private Role role;
}
