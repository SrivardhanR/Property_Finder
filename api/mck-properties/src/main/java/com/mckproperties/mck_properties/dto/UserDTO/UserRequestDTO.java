package com.mckproperties.mck_properties.dto.UserDTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserRequestDTO {

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String username;

    @NotNull
    private String password;
}
