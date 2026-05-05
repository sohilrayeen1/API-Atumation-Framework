package com.api.listners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class myTestListner implements ITestListener {

	public static final Logger logger = LogManager.getLogger(myTestListner.class);

	public void onStart(ITestContext context) {
		logger.info("This Suit Started*****");
	}

	public void onTestStart(ITestResult result) {
		logger.info("Test Execution Started*****");
		logger.info("Start****" + result.getMethod().getClass());

	}

	public void onTestSuccess(ITestResult result) {
		logger.info("Test Got Passed*****");
		logger.info(result.getMethod().getClass());
		logger.info("Description***" + result.getMethod().getDescription());
	}

	public void onTestFailure(ITestResult result) {
		logger.error("Test Got Failed*****");
		logger.info("Failed-Test****"+result.getMethod().getClass());
	}

	public void onFinish(ITestContext context) {
		logger.info("This Suit Completed*****");
	}

	public void onTestSkipped(ITestResult result) {
		logger.info("Test got Skipped*****");
		logger.info(result.getMethod().getClass());
	}

}
