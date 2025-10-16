package com.ecom.Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
        	  // Generate timestamp
            String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
            String reportPath = System.getProperty("user.dir") + "/test-output/ExtentReports/" + timestamp + "/ExtentReport.html";

            // Create Spark Reporter with dynamic path
            ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);

           
            extent = new ExtentReports();
            extent.attachReporter(spark);
        }
        return extent;
    }
}

