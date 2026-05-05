package com.api.base;

import com.api.models.request.updateUserRequest;

import io.restassured.response.Response;

public class userServices extends BaseService {

	private static final String BASE_PATH = "/api/users/";
	private static final String USER_ENDPOINT = "profile";

	public userServices() {
		super();
	}

	public Response getUserProfile(String token) {
		setToken(token);
		return getRequest(BASE_PATH + USER_ENDPOINT);
	}

	public Response updateUser(String token, updateUserRequest payload) {
		setToken(token);
		return putRequest(payload, BASE_PATH + USER_ENDPOINT);
	}

	
}
