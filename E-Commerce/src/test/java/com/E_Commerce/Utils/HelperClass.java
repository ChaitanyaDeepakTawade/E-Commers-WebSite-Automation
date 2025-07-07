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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class HelperClass {
	
	private static HelperClass helperclass;
	protected WebDriver driver;
	public final static int TIMEOUT =5;
	protected Properties prop;
	DateTimeFormatter Date = DateTimeFormatter.ofPattern("ddmmyyyyHHmmss");
	String timestamp = LocalDateTime.now().format(Date);
	protected String uniqueEmail ="Ecomtest"+timestamp+"@gmail.com";
	
	

    @BeforeClass
    public void setUp() throws Exception {
        prop = new Properties();
        prop.load(new FileInputStream("src\\test\\ resources\\config.properties"));

        String browser = prop.getProperty("browser");
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
    }

  // @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}
