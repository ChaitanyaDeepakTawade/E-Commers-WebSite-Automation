package com.ecom.Actions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.ecom.Pages.RegistrationPage;

public class RegistrationPageAction extends RegistrationPage {
	
	WebDriver driver;
	
    public RegistrationPageAction(WebDriver driver) {
		this.driver = driver;
		
	}

     public void Register(String Gender, String FirstName, String LastName, String Email, String Password, String ConfirmPassword){
        
 		driver.findElement(getRegisterURL()).click();
 		driver.findElement(getGender()).click();
 		driver.findElement(getFirstName()).sendKeys(FirstName);
 		driver.findElement(getLastName()).sendKeys(LastName);
 		driver.findElement(getEmail()).sendKeys(Email);
 		driver.findElement(getPassword()).sendKeys(Password);
 		driver.findElement(getConfirmPassword()).sendKeys(ConfirmPassword);
 		driver.findElement(getRegisterBtn()).click();
 	}
     
     public void RegisterMsgValidation() {
    	 
    	String registerSucessMsg = driver.findElement(getSucessMsg()).getText();    
        Assert.assertEquals(registerSucessMsg,"Sucess");
     }

}
