package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthServices;
import com.api.base.userServices;
import com.api.models.request.loginRequest;
import com.api.models.response.loginResponse;
import com.api.models.response.userProfileResponse;

import io.restassured.response.Response;

public class getUserProfileTest {

	@Test
	public void getuserprofile() {

		loginRequest loginRequest = new loginRequest("uday1234", "uday12345");
		AuthServices authService = new AuthServices();
		Response response = authService.login(loginRequest);
		loginResponse loginResponse = response.as(loginResponse.class);
		
		System.out.println(loginResponse.getToken());

		userServices userService = new userServices();
		response = userService.getUserProfile(loginResponse.getToken());

		userProfileResponse userProfileResponse = response.as(userProfileResponse.class);

		System.out.println(response.asPrettyString());
		
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(userProfileResponse.getId(), "1");
		Assert.assertEquals(userProfileResponse.getUsername(), "uday1234");
		Assert.assertEquals(userProfileResponse.getEmail(), "disha77@gmail.com");

	}
}
