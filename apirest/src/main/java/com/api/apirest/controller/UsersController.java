package com.api.apirest.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import com.api.apirest.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.apirest.dto.UserDto;
import com.api.apirest.service.UserService;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	private final UserService userService;
	
	public UsersController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody UserDto userDto){
		var userId = userService.createUser(userDto);
		
		return ResponseEntity.created(URI.create("/users/" + userId.toString())).build();
	}
	
    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable("userId") String userId) {
        var user = userService.getUserById(userId);

        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
	@GetMapping
	public ResponseEntity<List<User>> createUser(@PathVariable("Id") String Id){
		//
		return null
	}
	
}
