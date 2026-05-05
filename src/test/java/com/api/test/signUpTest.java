package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthServices;
import com.api.models.request.signUpRequest;

import io.restassured.response.Response;

public class signUpTest {

	@Test(description = "Verify if SignUp Api is working....")
	public void signuptest() {

		signUpRequest signUpRequest = new signUpRequest("aamirr", "aamir1234", "sohilrayeen03@gmail.com", "Aamirr", "Sohill",
				"7415687885");

		AuthServices authService = new AuthServices();
		Response response = authService.signup(signUpRequest);

		System.out.println("status Code :" + response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200, "Status code is not 200");

	}
}
