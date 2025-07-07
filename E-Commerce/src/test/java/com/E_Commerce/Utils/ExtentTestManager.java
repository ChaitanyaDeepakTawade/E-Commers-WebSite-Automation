package com.E_Commerce.Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import java.util.HashMap;
import java.util.Map;

public class ExtentTestManager {
    private static Map<Integer, ExtentTest> testMap = new HashMap<>();
    private static ExtentReports extent = ExtentManager.getInstance();

    public static ExtentTest getTest() {
        return testMap.get((int) Thread.currentThread().getId());
    }

    public static ExtentTest startTest(String testName) {
        ExtentTest test = extent.createTest(testName);
        testMap.put((int) Thread.currentThread().getId(), test);
        return test;
    }

    public static void endTest() {
        extent.flush();
    }
}
