package com.nan.SantanderFullStackDev.utils;

import com.nan.SantanderFullStackDev.controller.dto.CardRequest;
import com.nan.SantanderFullStackDev.controller.dto.CardResponse;
import com.nan.SantanderFullStackDev.model.Card;

public class CardConvert {
	
	public static Card toEntity(CardRequest cardRequest) {
		Card card = new Card();
		card.setId(cardRequest.getId());
		card.setLimit(cardRequest.getLimit());
		card.setNumber(cardRequest.getNumber());
		return card;
	}
	
	public static CardResponse toResponse(Card card) {
		CardResponse cardResponse = new CardResponse();
		cardResponse.setId(card.getId());
		cardResponse.setLimit(card.getLimit());
		cardResponse.setNumber(card.getNumber());
		return cardResponse;
	}

}
