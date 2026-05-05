package com.api.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class loggingFilter implements Filter {

	private static final Logger logger = LogManager.getLogger(loggingFilter.class);

	@Override
	public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec,
			FilterContext ctx) {

		logRequest(requestSpec);
		Response response = ctx.next(requestSpec, responseSpec); // Request is going to Execute
		logResponse(response);

		return response;
	}

	public void logRequest(FilterableRequestSpecification requestSpec) {
		logger.info("BASE URI:" + requestSpec.getBaseUri());
		logger.info("request Header :" + requestSpec.getHeaders());
		logger.info("request Payload :" + requestSpec.getBody());
	}

	public void logResponse(Response response) {
		logger.info("Status Code :" + response.getStatusCode());
		logger.info(" Request Header :" + response.headers());
		logger.info("response Payload :" + response.getBody().prettyPrint());

	}

}
