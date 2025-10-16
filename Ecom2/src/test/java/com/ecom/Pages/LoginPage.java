package com.ecom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private By UserID = By.name("Email");
    private By Password = By.name("Password");
    private By LoginURL = By.linkText("Log in");
    private By LoginBtn = By.xpath("//input[@value='Log in']");
    
    
    protected By getUserID() {
		return UserID;
	}
    protected By getPassword() {
		return Password;
	}
    protected By getLoginURL() {
		return LoginURL;
	}
    protected By getLoginBtn() {
		return LoginBtn;
	}
	
}
