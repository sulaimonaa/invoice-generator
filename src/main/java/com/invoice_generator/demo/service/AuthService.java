package com.invoice_generator.demo.service;

import com.invoice_generator.demo.LoginDTO;
import com.invoice_generator.demo.RegisterDTO;
import com.invoice_generator.demo.dto.*;

public interface AuthService {

    AuthResponse register(RegisterDTO request);

    AuthResponse login(LoginDTO request);
}