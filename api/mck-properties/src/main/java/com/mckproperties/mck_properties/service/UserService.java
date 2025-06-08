package com.mckproperties.mck_properties.service;

import com.mckproperties.mck_properties.dto.UserDTO.UserRequestDTO;
import com.mckproperties.mck_properties.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mckproperties.mck_properties.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User createUser(UserRequestDTO userRequestDTO){
        User user = new User();
        user.setEmail(userRequestDTO.getEmail());
        user.setUsername(userRequestDTO.getUsername());
        user.setPassword(userRequestDTO.getPassword());
        user.setAvatar("");
        return userRepository.save(user);
    }


}
