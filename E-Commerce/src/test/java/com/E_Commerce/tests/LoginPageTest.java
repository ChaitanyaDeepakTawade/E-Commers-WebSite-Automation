package com.E_Commerce.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.E_Commerce.Pages.LoginPage;
import com.E_Commerce.Utils.HelperClass;


public class LoginPageTest extends HelperClass {
	protected Properties prop;
	
	
	@Test
    public void login() throws FileNotFoundException, IOException {
		
		LoginPage Login = new LoginPage(driver);
		
		prop = new Properties();
	    prop.load(new FileInputStream("src\\test\\ resources\\config.properties"));
       
		Login.login( uniqueEmail ,prop.getProperty("Password") );

        String title = driver.getTitle();
        
        Assert.assertTrue(title.contains("Demo Web Shop. Login"), "Title doesn't contain ChatGPT");
    }
}
