package com.nan.SantanderFullStackDev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nan.SantanderFullStackDev.model.Card;
import com.nan.SantanderFullStackDev.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	boolean existsByAccountNumber(String accountNumber);
	

}
