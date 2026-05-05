package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthServices;

import io.restassured.response.Response;

public class forgotPasswordTest {

	@Test
	
	public void forgotpasswordtest() {
		
		AuthServices authService = new AuthServices();
		
		String payload = "{ \"email\": \"sohilrayeen03@gmail.com\" }";
		Response response = authService.forgotpassowrd(payload);
		
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
}
