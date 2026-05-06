package com.ftweb.pf.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftweb.pf.JwtUtil;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
	
	private final JwtUtil jwtUtil;
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Map<String, String> request) {
		String username = request.get("username");
		String password = request.get("password");
		
		// 固定のID・パスワード認証（本来DB認証）
		if ("ftweb".equals(username) && "ftweb".equals(password)) {
			String token = jwtUtil.generateToken(username);
			return ResponseEntity.ok(Map.of("token", token));
		}
		
		return ResponseEntity.status(401).body(Map.of("error", "Invalid credentials"));
	}

}
