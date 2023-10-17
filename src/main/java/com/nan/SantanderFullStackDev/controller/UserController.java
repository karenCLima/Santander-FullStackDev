package com.nan.SantanderFullStackDev.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nan.SantanderFullStackDev.controller.dto.UserRequest;
import com.nan.SantanderFullStackDev.controller.dto.UserResponse;
import com.nan.SantanderFullStackDev.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public ResponseEntity<List<UserResponse>> getAll(){
		return ResponseEntity.ok(userService.findAllUsers());
	}
	
	@PostMapping
	public ResponseEntity<UserResponse> save(@RequestBody UserRequest userRequest){
		UserResponse userResponse = userService.create(userRequest);
		return ResponseEntity.created(URI.create("/user/"+userResponse.getId())).body(userResponse);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UserResponse> getById(@PathVariable Long id){
		return ResponseEntity.ok(userService.findById(id));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		userService.deleteUser(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<UserResponse> update(@RequestBody UserRequest userRequest, @PathVariable Long id){
		return ResponseEntity.ok(userService.updateUser(userRequest, id));
	}
}
