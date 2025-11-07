package com.presupuesto_app.service;

import com.presupuesto_app.repository.UserRepository;
import com.presupuesto_app.security.JwtUtil;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Map;

@Service
public class AuthService {
    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public AuthService(UserRepository userRepository, JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
    }

    public Mono<String> login(String username, String password) {
        return userRepository.findByUsername(username)
            .filter(user -> passwordEncoder.matches(password, user.getPassword()))
            .map(user -> jwtUtil.generateToken(user.getUsername(),
                Map.of(
                    "role", user.getRole(),
                    "userId", user.getId()
                )))
            .switchIfEmpty(Mono.error( new RuntimeException("Invalid credentials")));
    }
}
