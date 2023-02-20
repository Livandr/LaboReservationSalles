package com.gestionsalledecours.models.dto;

import com.gestionsalledecours.models.entities.Role;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDTO {
    private long id;
    private String email;
    private String login;
    private String password;
    private String lastname;
    private String firstname;
    private String phone;
    private Role role;
}
