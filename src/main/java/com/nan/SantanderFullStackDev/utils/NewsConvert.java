package com.nan.SantanderFullStackDev.utils;

import java.util.ArrayList;
import java.util.List;

import com.nan.SantanderFullStackDev.controller.dto.NewsRequest;
import com.nan.SantanderFullStackDev.controller.dto.NewsResponse;
import com.nan.SantanderFullStackDev.model.News;

public class NewsConvert {
	
	public static News toEntity(NewsRequest newsRequest) {
		News news = new News();
		news.setIcon(newsRequest.getIcon());
		news.setDescription(newsRequest.getDescription());
		return news;
	}
	
	public static NewsResponse toResponse(News news) {
		NewsResponse newsResponse = new NewsResponse();
		newsResponse.setId(news.getId());
		newsResponse.setDescription(news.getDescription());
		newsResponse.setIcon(news.getIcon());
		return newsResponse;
	}
	
	public static List<NewsResponse> toResponseList(List<News> news){
		List<NewsResponse> newsResponses = new ArrayList<>();
		for(News news2: news) {
			NewsResponse newsResponse = NewsConvert.toResponse(news2);
			newsResponses.add(newsResponse);
		}
		return newsResponses;
	}
	
	public static List<News> toEntityList(List<NewsRequest> newsRequests){
		List<News> newsList = new ArrayList<>();
		for(NewsRequest news2: newsRequests) {
			News news3 = NewsConvert.toEntity(news2);
			newsList.add(news3);
		}
		return newsList;
	}

}
