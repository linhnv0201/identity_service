package com.vulinh.identity_service.controller;

import com.vulinh.identity_service.dto.request.UserCreationRequest;
import com.vulinh.identity_service.dto.request.UserUpdateRequest;
import com.vulinh.identity_service.entity.User;
import com.vulinh.identity_service.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping()
    User addUser(@RequestBody @Valid UserCreationRequest request) {
       return userService.createUser(request);
    }

    @GetMapping()
    List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}")
    User getUser(@PathVariable String userId) {
        return userService.getUserById(userId);
    }

    @PutMapping("/{userId}")
    User updateUser(@PathVariable String userId, @RequestBody UserUpdateRequest user) {
        return userService.updateUser(userId, user);
    }

    @DeleteMapping("/{userId}")
    String deleteUser(@PathVariable String userId) {
        userService.deleteUser(userId);
        return "da xoa";
    }
}
