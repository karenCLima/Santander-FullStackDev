package com.nan.SantanderFullStackDev.service.impl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nan.SantanderFullStackDev.controller.dto.UserRequest;
import com.nan.SantanderFullStackDev.controller.dto.UserResponse;
import com.nan.SantanderFullStackDev.model.User;
import com.nan.SantanderFullStackDev.repository.UserRepository;
import com.nan.SantanderFullStackDev.service.UserService;
import com.nan.SantanderFullStackDev.utils.AccountConvert;
import com.nan.SantanderFullStackDev.utils.CardConvert;
import com.nan.SantanderFullStackDev.utils.FeatureConvert;
import com.nan.SantanderFullStackDev.utils.NewsConvert;
import com.nan.SantanderFullStackDev.utils.UserConvert;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	@Transactional
	public UserResponse findById(Long id) {
		User user = userRepository.findById(id).orElseThrow(NoSuchElementException::new);
		return UserConvert.toResponse(user) ;
	}

	@Override
	@Transactional
	public UserResponse create(UserRequest userRequest) {
		if(userRepository.existsByAccountNumber(userRequest.getAccount().getNumber())) {
			throw new IllegalArgumentException("This Account number already exists.");
		}
		User userCreated = UserConvert.toEntity(userRequest);
		return UserConvert.toResponse(userRepository.save(userCreated));
	}

	@Override
	@Transactional
	public List<UserResponse> findAllUsers() {
		List<User> users = userRepository.findAll();
		return UserConvert.toResponseList(users);
	}

	@Override
	@Transactional
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
		
	}

	@Override
	@Transactional
	public UserResponse updateUser(UserRequest userRequest, Long id) {
		Optional<User> userOptional = userRepository.findById(id);

		    if (!userOptional.isPresent()) {
		        throw new IllegalArgumentException("User with ID " + id + " not found");
		    }
		User existingUser = userOptional.get();
		existingUser.setName(userRequest.getName());
	    existingUser.setAccount(AccountConvert.toEntity(userRequest.getAccount()));
	    existingUser.setCard(CardConvert.toEntity(userRequest.getCard()));
	    existingUser.setFeatures(FeatureConvert.toEntityList(userRequest.getFeatures()));
	    existingUser.setNews(NewsConvert.toEntityList(userRequest.getNews()));
		return UserConvert.toResponse(userRepository.save(existingUser));
	}

}
