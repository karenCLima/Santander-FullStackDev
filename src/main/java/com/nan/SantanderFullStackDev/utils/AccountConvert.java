package com.nan.SantanderFullStackDev.utils;

import java.util.ArrayList;
import java.util.List;

import com.nan.SantanderFullStackDev.controller.dto.AccountRequest;
import com.nan.SantanderFullStackDev.controller.dto.AccountResponse;
import com.nan.SantanderFullStackDev.controller.dto.UserRequest;
import com.nan.SantanderFullStackDev.controller.dto.UserResponse;
import com.nan.SantanderFullStackDev.model.Account;
import com.nan.SantanderFullStackDev.model.User;

public class AccountConvert {
	
	public static Account toEntity(AccountRequest accountRequest) {
		Account account = new Account();
		account.setId(accountRequest.getId());
		account.setAgency(accountRequest.getAgency());
		account.setBalance(accountRequest.getBalance());
		account.setLimit(accountRequest.getLimit());
		account.setNumber(accountRequest.getNumber());
		return account;
	}
	
	public static AccountResponse toResponse(Account account) {
		AccountResponse accountResponse = new AccountResponse();
		accountResponse.setId(account.getId());
		accountResponse.setAgency(account.getAgency());
		accountResponse.setBalance(account.getBalance());
		accountResponse.setLimit(account.getLimit());
		accountResponse.setNumber(account.getNumber());
		return accountResponse;
	}
	
	

}
