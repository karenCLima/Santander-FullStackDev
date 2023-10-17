package com.nan.SantanderFullStackDev.controller.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountRequest {
	
	private String number;
	private String agency;
	private BigDecimal balance;
	private BigDecimal limit;

}
