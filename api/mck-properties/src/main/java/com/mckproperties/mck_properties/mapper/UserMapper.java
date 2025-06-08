package com.mckproperties.mck_properties.mapper;

import com.mckproperties.mck_properties.dto.UserDTO.UpdateAvatarDTO;
import com.mckproperties.mck_properties.dto.UserDTO.UserRequestDTO;
import com.mckproperties.mck_properties.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public void userRequestDTOtoUser(User user , UserRequestDTO userRequestDTO){
        user.setEmail(userRequestDTO.getEmail());
        user.setUsername(userRequestDTO.getUsername());
        user.setPassword(userRequestDTO.getPassword());
    }

    public void updateAvatar(User user , UpdateAvatarDTO updateAvatarDTO){
        user.setAvatar(updateAvatarDTO.getAvatar());
    }
}
