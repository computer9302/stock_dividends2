package com.dayone.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/signup")
    public ResponseEntity<?> signup(){

        return null;
    }

    @PostMapping("/signin")
    public ResponseEntity<?> signin(){

        return null;
    }
}
