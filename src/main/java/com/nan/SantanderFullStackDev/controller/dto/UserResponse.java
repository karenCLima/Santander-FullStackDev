package com.nan.SantanderFullStackDev.controller.dto;

import java.util.List;

import com.nan.SantanderFullStackDev.model.Account;
import com.nan.SantanderFullStackDev.model.Card;
import com.nan.SantanderFullStackDev.model.Feature;
import com.nan.SantanderFullStackDev.model.News;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserResponse {
	
	private Long id;
	private String name;
	private AccountResponse account;
	private CardResponse card;
	private List<FeatureResponse> features;
	private List<NewsResponse> news;

}
