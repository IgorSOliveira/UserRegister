package com.api.apirest.service;

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
	
	//Transformar o UserDto em uma variavel "user"
	public UUID createUser(UserDto UserDto) {
		var user = new User(UUID.randomUUID(),  UserDto.username(), UserDto.email(),  UserDto.password());
		
		var usuarioSalvo = userRepository.save(user);
		
		return usuarioSalvo.getID();
	}
	
}
