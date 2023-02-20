package com.gestionsalledecours.models.forms;

import com.gestionsalledecours.models.entities.Role;
import com.gestionsalledecours.validation.constraints.EmailNotTaken;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
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
    @Pattern( regexp = "^^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{4,}$",
            message = "your password must contain atleast 1 uppercase, 1 lowercase, 1 special character and 1 digit")
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
