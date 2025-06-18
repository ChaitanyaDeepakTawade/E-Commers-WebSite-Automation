package com.E_Commerce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.E_Commerce.Utils.HelperClass;

public class RegistrationPage{

	WebDriver driver;
	
	private By RegisterURL = By.linkText("Register");
	private By Gender = By.id("gender-male");
	private By FirstName = By.id("FirstName");
	private By LastName = By.id("LastName");
	private By Email = By.id("Email");
	private By Password = By.id("Password");
	private By ConfirmPassword = By.id("ConfirmPassword");
	private By registerBtn = By.id("register-button");
	
	public RegistrationPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void Register(String Gender, String FirstName, String LastName, String Email, String Password, String ConfirmPassword){
		
		driver.findElement(this.RegisterURL).click();
		driver.findElement(this.Gender).click();
		driver.findElement(this.FirstName).sendKeys(FirstName);
		driver.findElement(this.LastName).sendKeys(LastName);
		driver.findElement(this.Email).sendKeys(Email);
		driver.findElement(this.Password).sendKeys(Password);
		driver.findElement(this.ConfirmPassword).sendKeys(ConfirmPassword);
		driver.findElement(registerBtn).click();
		
	}
	
	
}
