package com.E_Commerce.Utils;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class HelperClass {
	
	
	private static HelperClass helperclass;
	protected static WebDriver driver;
	public final static int TIMEOUT =5;
	protected Properties prop;
	DateTimeFormatter Date = DateTimeFormatter.ofPattern("ddmmyyyyHHmmss");
	String timestamp = LocalDateTime.now().format(Date);
	protected String uniqueEmail ="Ecomtest"+timestamp+"@gmail.com";
	
	@Parameters("browser")
    @BeforeClass
    public void setUp(String browser) throws Exception {
        prop = new Properties();
        prop.load(new FileInputStream("src\\test\\ resources\\config.properties"));

        //String browser = prop.getProperty("browser");
        
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("edge")) {
        	driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
    }
   
    public static WebDriver getDriver() {
    	
    	return driver;
    }
  // @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}
