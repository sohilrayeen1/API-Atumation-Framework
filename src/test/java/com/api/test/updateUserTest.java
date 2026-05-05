package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthServices;
import com.api.base.userServices;

import com.api.models.request.loginRequest;
import com.api.models.request.updateUserRequest;
import com.api.models.response.loginResponse;
import com.api.models.response.userProfileResponse;

import io.restassured.response.Response;

public class updateUserTest {

	@Test
	public void updateUser() {
		
		
		AuthServices authService = new AuthServices();
		Response response = authService.login(new loginRequest("uday1234","uday12345"));
		
		loginResponse loginResponse = 	response.as(loginResponse.class);
		
		System.out.println(response.asPrettyString());
		System.out.println("--------------------------------------------");
		
		userServices userService = new userServices();
		response = userService.getUserProfile(loginResponse.getToken());
		
		System.out.println(response.asPrettyString());
		System.out.println(loginResponse.getToken());
		System.out.println("--------------------------------------------");
		
		userProfileResponse userprofileresponse	= response.as(userProfileResponse.class);
//		Assert.assertEquals(userprofileresponse.getUsername(), "uday1234");
		
		
		updateUserRequest updateUserRequest = new updateUserRequest
		        .Builder()
		        .firstName("Rahul")
		        .lastName("Sharma")
		        .email("rahul.sharma03@gmail.com")
		        .mobileNumber("9345678922")
		        .id("1")
		        .username("profile_edit03")
		        .build();
				
		response = userService.updateUser(loginResponse.getToken(),updateUserRequest);
		
		System.out.println(response.asPrettyString());
		System.out.println("--------------------------------------------");
		
		System.out.println(response.getStatusCode());
	}
	
}
