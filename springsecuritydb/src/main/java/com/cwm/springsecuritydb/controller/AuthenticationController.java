package com.cwm.springsecuritydb.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cwm.springsecuritydb.dto.JwtAuthenticationResponse;
import com.cwm.springsecuritydb.dto.SignInRequest;
import com.cwm.springsecuritydb.dto.SignUpRequest;
import com.cwm.springsecuritydb.entities.User;
import com.cwm.springsecuritydb.services.AuthenticationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthenticationController {
	private final AuthenticationService authenticationService;

	@PostMapping("/signup")
	public ResponseEntity<User> signup(@RequestBody SignUpRequest signUpRequest) {
		return ResponseEntity.ok(authenticationService.signup(signUpRequest));
	}

	@PostMapping("/signin")
	public ResponseEntity<JwtAuthenticationResponse> signin(@RequestBody SignInRequest signInRequest) {
		return ResponseEntity.ok(authenticationService.signin(signInRequest));
	}
}
