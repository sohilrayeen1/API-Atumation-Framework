package com.api.base;

import static io.restassured.RestAssured.given;

import com.api.utilities.loggingFilter;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {

// Base URI, Constructor
// Creating Request
// Handling the Response

	private static final String BASEURL = "http://64.227.160.186:8080/";
	private RequestSpecification requestSpecification;

//Filter
	static {
		RestAssured.filters(new loggingFilter());
	}

	public BaseService() {
		requestSpecification = given().baseUri(BASEURL);
	}

	protected Response postRequest(Object payload, String endpoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
	}

	protected Response getRequest(String endpoint) {
		return requestSpecification.get(endpoint);
	}

	protected Response putRequest(Object payload, String endpoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).put(endpoint);
	}

	protected void setToken(String token) {
		requestSpecification.header("Authorization", "Bearer " + token);
	}
}
