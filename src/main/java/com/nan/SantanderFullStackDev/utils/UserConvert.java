package com.nan.SantanderFullStackDev.utils;

import java.util.ArrayList;
import java.util.List;

import com.nan.SantanderFullStackDev.controller.dto.UserRequest;
import com.nan.SantanderFullStackDev.controller.dto.UserResponse;
import com.nan.SantanderFullStackDev.model.User;

public class UserConvert {
	
	public static User toEntity(UserRequest userRequest) {
		User user = new User();
		user.setAccount(AccountConvert.toEntity(userRequest.getAccount()));
		user.setCard(CardConvert.toEntity(userRequest.getCard()));
		user.setName(userRequest.getName());
		user.setFeatures(FeatureConvert.toEntityList(userRequest.getFeatures()));
		user.setNews(NewsConvert.toEntityList(userRequest.getNews()));
		return user;
	}
	
	public static UserResponse toResponse(User user) {
		UserResponse userResponse = new UserResponse();
		userResponse.setId(user.getId());
		userResponse.setAccount(AccountConvert.toResponse(user.getAccount()));
		userResponse.setCard(CardConvert.toResponse(user.getCard()));
		userResponse.setName(user.getName());
		userResponse.setFeatures(FeatureConvert.toResponseList(user.getFeatures()));
		userResponse.setNews(NewsConvert.toResponseList(user.getNews()));
		return userResponse;
	}
	
	public static List<UserResponse> toResponseList(List<User> users){
		List<UserResponse> userResponses = new ArrayList<>();
		for(User user: users) {
			UserResponse userResponse = UserConvert.toResponse(user);
			userResponses.add(userResponse);
		}
		return userResponses;
	}

}
