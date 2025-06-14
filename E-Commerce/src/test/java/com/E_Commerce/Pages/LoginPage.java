package com.E_Commerce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

    private By UserID = By.name("Email");
    private By Password = By.name("Password");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


	public void login(String UserID, String Password) {
        driver.findElement(this.UserID).sendKeys(UserID);
        driver.findElement(this.Password).sendKeys(Password);
    }
}
