package com.E_Commerce.tests;

import org.testng.annotations.Test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;


import com.E_Commerce.Actions.RegistrationPageAction;
import com.E_Commerce.Pages.RegistrationPage;
import com.E_Commerce.Utils.ExcelUtils;
import com.E_Commerce.Utils.HelperClass;
import com.E_Commerce.Utils.Log;

public class RegistrationPageTest extends HelperClass{
	
  RegistrationPageAction  RegisterPage ;
	Logger log;
  
  @DataProvider
  public Object[][] RegistrationData() throws IOException{
	  String FilePath = "src\\test\\resources\\RegistrationData.xlsx";
	  String SheetName = "Sheet1";
	  return ExcelUtils.getExcelData(FilePath, SheetName);
	  
  }
  
  
  @Test(dataProvider = "RegistrationData")
  public void Register(String Gender, String FirstName, String LastName, String Email, String Password, String ConfirmPassword) {

	  log = LogManager.getLogger(RegistrationPageTest.class);
	  log.info("Registration start.....!");
	  RegisterPage = new RegistrationPageAction(driver); 
	  RegisterPage.Register(Gender, FirstName, LastName, uniqueEmail , Password, ConfirmPassword);
  
  }
}
