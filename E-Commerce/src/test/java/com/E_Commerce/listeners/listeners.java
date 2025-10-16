package com.E_Commerce.listeners;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.E_Commerce.Utils.ExtentTestManager;
import com.E_Commerce.Utils.HelperClass;
import com.E_Commerce.Utils.Log;

public class listeners implements ITestListener {
	
	private static final Logger logger = (Logger) LogManager.getLogger(listeners.class);
	
    @Override
    public void onStart(ITestContext context) {
    	
    	logger.info("Test Suite Started: " + context.getName());
    	
    }

    @Override
    public void onFinish(ITestContext context) {
      	logger.info("Test Suite Finished: " + context.getName());
   
        ExtentTestManager.endTest();
    }

    @Override
    public void onTestStart(ITestResult result) {
    	
    	logger.info("Test Started: " + result.getMethod().getMethodName());
        ExtentTestManager.startTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
    
    	
    	logger.info("Test Passed: " + result.getMethod().getMethodName());
        
    	ExtentTestManager.getTest().log(Status.PASS, "Test Passed");
        
    }

    @Override
    public void onTestFailure(ITestResult result) {
    
    	logger.error("Test Failed: " + result.getMethod().getMethodName(), result.getThrowable());
    	
        ExtentTestManager.getTest().log(Status.FAIL, "Test Failed: " + result.getThrowable());
        String base64 = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.BASE64);
        ExtentTestManager.getTest().fail("Screenshot:",MediaEntityBuilder.createScreenCaptureFromBase64String(base64).build());

    }

	@Override
    public void onTestSkipped(ITestResult result) {
        ExtentTestManager.getTest().log(Status.SKIP, "Test Skipped");
    }
    
 
}
