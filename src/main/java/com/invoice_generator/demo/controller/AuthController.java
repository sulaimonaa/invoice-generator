package com.invoice_generator.demo.controller;

import com.invoice_generator.demo.LoginDTO;
import com.invoice_generator.demo.RegisterDTO;
import com.invoice_generator.demo.dto.*;
import com.invoice_generator.demo.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public AuthResponse register(
            @RequestBody RegisterDTO request) {

        return authService.register(request);
    }

    @PostMapping("/login")
    public AuthResponse login(
            @RequestBody LoginDTO request) {

        return authService.login(request);
    }
}