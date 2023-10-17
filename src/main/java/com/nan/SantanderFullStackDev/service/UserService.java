package com.nan.SantanderFullStackDev.service;

import java.util.List;


import com.nan.SantanderFullStackDev.controller.dto.UserRequest;
import com.nan.SantanderFullStackDev.controller.dto.UserResponse;
import com.nan.SantanderFullStackDev.model.User;


public interface UserService {
	
	UserResponse findById(Long id);

    UserResponse create(UserRequest userRequest);
    
    List<UserResponse> findAllUsers();
    
    void deleteUser(Long id);
    
    UserResponse updateUser(UserRequest userRequest, Long id); 

}
