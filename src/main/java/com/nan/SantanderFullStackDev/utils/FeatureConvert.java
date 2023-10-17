package com.nan.SantanderFullStackDev.utils;

import java.util.ArrayList;
import java.util.List;

import com.nan.SantanderFullStackDev.controller.dto.FeatureRequest;
import com.nan.SantanderFullStackDev.controller.dto.FeatureResponse;
import com.nan.SantanderFullStackDev.model.Feature;

public class FeatureConvert {
	
	public static Feature toEntity(FeatureRequest featureRequest) {
		Feature feature = new Feature();
		feature.setIcon(featureRequest.getIcon());
		feature.setDescription(featureRequest.getDescription());
		return feature;
	}
	
	public static FeatureResponse toResponse(Feature feature) {
		FeatureResponse featureResponse = new FeatureResponse();
		featureResponse.setId(feature.getId());
		featureResponse.setDescription(feature.getDescription());
		featureResponse.setIcon(feature.getIcon());
		return featureResponse;
	}
	
	public static List<FeatureResponse> toResponseList(List<Feature> features){
		List<FeatureResponse> featureResponses = new ArrayList<>();
		for(Feature feature: features) {
			FeatureResponse featureResponse = FeatureConvert.toResponse(feature);
			featureResponses.add(featureResponse);
		}
		return featureResponses;
	}
	
	public static List<Feature> toEntityList(List<FeatureRequest> featureRequests){
		List<Feature> features = new ArrayList<>();
		for(FeatureRequest featureRequest: featureRequests) {
			Feature feature = FeatureConvert.toEntity(featureRequest);
			features.add(feature);
		}
		return features;
	}
	

}
