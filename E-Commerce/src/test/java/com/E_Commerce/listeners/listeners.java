package com.E_Commerce.listeners;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

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

public class listeners implements ITestListener {
	
    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test Suite Started: " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentTestManager.endTest();
    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTestManager.startTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentTestManager.getTest().log(Status.PASS, "Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
    	
        ExtentTestManager.getTest().log(Status.FAIL, "Test Failed: " + result.getThrowable());
        String base64 = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.BASE64);
        ExtentTestManager.getTest().fail("Screenshot:",MediaEntityBuilder.createScreenCaptureFromBase64String(base64).build());

    }

	@Override
    public void onTestSkipped(ITestResult result) {
        ExtentTestManager.getTest().log(Status.SKIP, "Test Skipped");
    }
    
 
}
