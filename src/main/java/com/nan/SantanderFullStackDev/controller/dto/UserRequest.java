package com.nan.SantanderFullStackDev.controller.dto;

import java.util.List;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
	
	private String name;
	private AccountRequest account;
	private CardRequest card;
	private List<FeatureRequest> features;
	private List<NewsRequest> news;

}
