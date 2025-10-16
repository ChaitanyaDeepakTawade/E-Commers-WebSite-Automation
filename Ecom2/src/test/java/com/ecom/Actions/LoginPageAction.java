package com.ecom.Actions;

import org.openqa.selenium.WebDriver;

import com.ecom.Pages.LoginPage;

public class LoginPageAction extends LoginPage {
	
	private WebDriver driver ;
	
	
	public LoginPageAction(WebDriver driver){
		this.driver = driver;
	}
	
	
	public void login(String UserID, String Password) {
		driver.findElement(getLoginURL()).click();
        driver.findElement(getUserID()).sendKeys(UserID);
        driver.findElement(getPassword()).sendKeys(Password);
        driver.findElement(getLoginBtn()).click();
    }
	
	

}
