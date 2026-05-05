package com.api.base;

import io.restassured.response.Response;

public class AuthServices extends BaseService {

	private static final String BASE_PATH = "/api/auth/";
	private static final String LOGIN_ENDPOINT = "login";
	private static final String SIGNUP_ENDPOINT = "signup";
	private static final String FORGOT_PASSWORD = "forgot-password";

	public Response login(Object payload) {
		return postRequest(payload, BASE_PATH + LOGIN_ENDPOINT);
	}
	
	public Response signup(Object payload) {
		return postRequest(payload, BASE_PATH + SIGNUP_ENDPOINT);
	}
	
	public Response forgotpassowrd(String payload) {
		return postRequest(payload, BASE_PATH + FORGOT_PASSWORD);
	}
	
}
