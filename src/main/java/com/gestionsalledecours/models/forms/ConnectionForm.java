package com.gestionsalledecours.models.forms;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data

public class ConnectionForm {
    @NotBlank(message = "enter your login")
    private String login;

    @NotBlank(message = "enter your password")
    private String password;
}
