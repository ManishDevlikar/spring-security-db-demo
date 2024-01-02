package com.cwm.springsecuritydb.services.imple;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cwm.springsecuritydb.dto.SignUpRequest;
import com.cwm.springsecuritydb.entities.Role;
import com.cwm.springsecuritydb.entities.User;
import com.cwm.springsecuritydb.repository.UserRepository;
import com.cwm.springsecuritydb.services.AuthenticationService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
	private final UserRepository userRepository;

	private final PasswordEncoder passwordEncoder;

	public User signup(SignUpRequest signUpRequest) {
		User user = new User();
		user.setEmail(signUpRequest.getEmail());
		user.setFirstname(signUpRequest.getFirstname());
		user.setLastname(signUpRequest.getLastname());
		user.setRole(Role.USER);
		user.setPassword(passwordEncoder.encode(signUpRequest.getPassword()));

		return userRepository.save(user);
	}
}
