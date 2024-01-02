package com.cwm.springsecuritydb.services;

import com.cwm.springsecuritydb.dto.JwtAuthenticationResponse;
import com.cwm.springsecuritydb.dto.RefreshTokenRequest;
import com.cwm.springsecuritydb.dto.SignInRequest;
import com.cwm.springsecuritydb.dto.SignUpRequest;
import com.cwm.springsecuritydb.entities.User;

public interface AuthenticationService {
	User signup(SignUpRequest signUpRequest);

	public JwtAuthenticationResponse signin(SignInRequest signInRequest);

	public JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
