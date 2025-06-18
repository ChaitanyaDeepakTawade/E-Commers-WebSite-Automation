package com.E_Commerce.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.E_Commerce.Pages.RegistrationPage;
import com.E_Commerce.Utils.ExcelUtils;
import com.E_Commerce.Utils.HelperClass;

public class RegistrationPageTest extends HelperClass{
  
  @DataProvider
  public Object[][] RegistrationData() throws IOException{
	  String FilePath = "src\\test\\ resources\\RegistrationData.xlsX";
	  String SheetName = "Sheet1";
	  
	  return ExcelUtils.getExcelData(FilePath, SheetName);
	  
  }
  
  
  @Test(dataProvider = "RegistrationData")
  public void Register(String Gender, String FirstName, String LastName, String Email, String Password, String ConfirmPassword) {
	  RegistrationPage Register = new RegistrationPage(driver); 
	  
	  Register.Register(Gender, FirstName, LastName, Email, Password, ConfirmPassword);
  
  }
}
