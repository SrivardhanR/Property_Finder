package com.mckproperties.mck_properties.controller;

import com.mckproperties.mck_properties.dto.UserDTO.UserRequestDTO;
import com.mckproperties.mck_properties.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mckproperties.mck_properties.service.UserService;

@RestController
@RequestMapping("/api/auth")
public  class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> createUser(@RequestBody UserRequestDTO userRequestDTO){
        try{
            User user = userService.createUser(userRequestDTO);
            return ResponseEntity.ok("User registered successfully with ID: " + user.getId());
        }catch(RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
