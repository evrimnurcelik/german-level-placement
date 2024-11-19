package com.german.placement_test.controller;

import com.german.placement_test.dto.UserDto;
import com.german.placement_test.model.User;
import com.german.placement_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/register")
    public User register(@RequestBody UserDto userDto) {
        User user = new User(); // Create a new User object
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
      
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody UserDto user) {
        return userService.findByUsername(user.getUsername());
    }
}
