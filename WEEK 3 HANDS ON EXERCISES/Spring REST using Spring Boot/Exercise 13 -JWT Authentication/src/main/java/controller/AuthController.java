package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.AuthRequest;
import com.cognizant.springlearn.security.JwtUtil;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class AuthController {

    private final JwtUtil jwtUtil = new JwtUtil();

    @PostMapping("/authenticate")
    public Map<String, String> authenticate(@RequestBody AuthRequest request) {

        if ("user".equals(request.getUsername()) &&
                "pwd".equals(request.getPassword())) {

            String token = jwtUtil.generateToken(request.getUsername());

            return Map.of("token", token);
        }

        throw new RuntimeException("Invalid Username or Password");
    }
}