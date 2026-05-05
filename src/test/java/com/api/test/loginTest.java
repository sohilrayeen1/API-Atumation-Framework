package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthServices;
import com.api.models.request.loginRequest;
import com.api.models.response.loginResponse;

import io.restassured.response.Response;

@Listeners(com.api.listners.myTestListner.class)
public class loginTest {

	@Test(description = "Verify if Login Api is working....")
	public void logintest() {

		loginRequest loginRequest = new loginRequest("uday1234", "uday12345");
		AuthServices authService = new AuthServices();
		Response response = authService.login(loginRequest);

//		System.out.println(response.asPrettyString());
		System.out.println("Status Code: " + response.getStatusCode());

		loginResponse loginResponse = response.as(loginResponse.class);

		System.out.println(loginResponse.getToken());
		System.out.println(loginResponse.getEmail());
		System.out.println(loginResponse.getUsername());
	
		System.out.println(loginResponse.getToken());
		Assert.assertEquals(response.getStatusCode(), 200, "Status code is not 200");
		Assert.assertEquals(loginResponse.getId(), "1", "ID is not 1");
	}
}
