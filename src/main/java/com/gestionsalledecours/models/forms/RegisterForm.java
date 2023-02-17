package com.gestionsalledecours.models.forms;

import com.gestionsalledecours.models.entities.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data

public class RegisterForm {

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String login;

    @NotBlank
    @Size(min = 6)
    private String password;

    @NotBlank
    private String confirm;

    @NotBlank
    private String lastName;

    @NotBlank
    private String firstName;

    @NotBlank
    private Role role;
}
