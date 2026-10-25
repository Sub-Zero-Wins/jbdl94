package com.digLib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digLib.DTOs.LoginDTO;
import com.digLib.DTOs.UserRegisterRequest;
import com.digLib.entities.User;
import com.digLib.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> register(
            @RequestBody @Valid UserRegisterRequest request) {

        userService.register(request);
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(
            @RequestBody @Valid LoginDTO loginDTO) {

        User user = userService.login(
                loginDTO.getEmail(),
                loginDTO.getPassword());

        return ResponseEntity.ok(
                "User login successful " + user.getUsername());
    }

    @GetMapping("/{id}")
    @PreAuthorize("isAuthenticated()")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }
}