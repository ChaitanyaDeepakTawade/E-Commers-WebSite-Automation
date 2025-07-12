package com.E_Commerce.Utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	
	 private int retryCount = 0;
	 private final int maxRetryCount = 2; // retry failed test up to 2 times
	 
	@Override
	public boolean retry(ITestResult result) {
		 if (retryCount < maxRetryCount) {
	            retryCount++;
	            return true;  // retry test
	        }
	        return false; // don't retry 
	
	}
	    

}
