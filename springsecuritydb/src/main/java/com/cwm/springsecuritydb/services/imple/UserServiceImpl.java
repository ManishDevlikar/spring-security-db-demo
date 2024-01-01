package com.cwm.springsecuritydb.services.imple;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cwm.springsecuritydb.repository.UserRepository;
import com.cwm.springsecuritydb.services.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	private final UserRepository userRepository;

	public UserDetailsService userDetailsService() {
		return new UserDetailsService() {

			@Override
			public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

				return userRepository.findByEmail(username)
						.orElseThrow(() -> new UsernameNotFoundException("user not found"));
			}
		};
	}
}
