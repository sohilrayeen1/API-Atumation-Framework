package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthServices;
import com.api.models.request.signUpRequestBuilder;
import com.api.utilities.fakeData;

import io.restassured.response.Response;
@Listeners(com.api.listners.myTestListner.class)
public class signUpTestBuilder {

	@Test(description = "Verify that a user can sign up successfully with valid details")
	public void signUpTest() {

		fakeData fakedata = new fakeData();
		fakedata.fakedata();

		signUpRequestBuilder signuprequestbuilder = signUpRequestBuilder
				.builder()
				.email(fakedata.email)
				.userName(fakedata.username)
				.firstName(fakedata.firstName)
				.lastName(fakedata.lastName)
				.mobileNumber(fakedata.mobileNumber)
				.password(fakedata.password)
				.build();

		AuthServices authService = new AuthServices();
		Response response = authService.signup(signuprequestbuilder);

		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200, "User registered successfully!");

		
		Assert.assertEquals(response.asString(),"User registered successfully!");
		
	}
}
