package com.E_Commerce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

    private By UserID = By.name("Email");
    private By Password = By.name("Password");
    private By LoginURL = By.linkText("Log in");
    private By LoginBtn = By.xpath("//input[@value='Log in']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


	public void login(String UserID, String Password) {
		driver.findElement(LoginURL).click();
        driver.findElement(this.UserID).sendKeys(UserID);
        driver.findElement(this.Password).sendKeys(Password);
        driver.findElement(LoginBtn).click();
    }
}
