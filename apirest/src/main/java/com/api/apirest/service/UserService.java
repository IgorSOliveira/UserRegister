package com.api.apirest.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.api.apirest.dto.UserDto;
import com.api.apirest.entity.User;
import com.api.apirest.repository.UserRepository;

@Service
public class UserService {
	
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public UUID createUser(UserDto UserDto) {
		//Converter de DTO -> Entity
		var user = new User(UUID.randomUUID(),  UserDto.username(), UserDto.email(),  UserDto.password());
		
		var usuarioSalvo = userRepository.save(user);
		
		return usuarioSalvo.getID();
	}
	
	 public Optional<User> getUserById(String userId) {

	        return userRepository.findById(UUID.fromString(userId));
	    }
	
	 
}
