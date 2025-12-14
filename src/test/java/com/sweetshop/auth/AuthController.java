package com.sweetshop.auth;

import com.sweetshop.user.User;
import com.sweetshop.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Map<String, String> body) {

        User user = new User();
        user.setEmail(body.get("email"));
        user.setPassword(body.get("password")); // plain for now (TDD)

        userRepository.save(user);

        return ResponseEntity.ok().build();
    }
}
