package com.cwm.springsecuritydb.services;

import com.cwm.springsecuritydb.dto.SignUpRequest;
import com.cwm.springsecuritydb.entities.User;

public interface AuthenticationService {
	User signup(SignUpRequest signUpRequest);

}
