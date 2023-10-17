package com.nan.SantanderFullStackDev.controller.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AccountResponse {
	
	private Long id;
	private String number;
	private String agency;
	private BigDecimal balance;
	private BigDecimal limit;

}
