package com.E_Commerce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.E_Commerce.Utils.HelperClass;

public class RegistrationPage{
	
	private By RegisterURL = By.xpath("//*[@href=\"/register\"]");
	private By Gender = By.id("gender-male");
	private By FirstName = By.id("FirstName");
	private By LastName = By.id("LastName");
	private By Email = By.id("Email");
	private By Password = By.id("Password");
	private By ConfirmPassword = By.id("ConfirmPassword");
	private By registerBtn = By.id("register-button");
	private By SucessMsg = By.className("result");
	
	protected By getRegisterURL() {
		return RegisterURL;
	}
	protected By getGender() {
		return Gender;
	}
	protected By getFirstName() {
		return FirstName;
	}
	protected By getLastName() {
		return LastName;
	}
	protected By getEmail() {
		return Email;
	}
	protected By getPassword() {
		return Password;
	}
	protected By getConfirmPassword() {
		return ConfirmPassword;
	}
	protected By getRegisterBtn() {
		return registerBtn;
	}
	protected By getSucessMsg() {
		return SucessMsg;
	}
	
	
	
	
	
	
	
}
