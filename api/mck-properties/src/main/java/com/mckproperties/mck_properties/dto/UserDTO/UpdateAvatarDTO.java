package com.mckproperties.mck_properties.dto.UserDTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdateAvatarDTO {

    @NotBlank
    private String avatar;
}
