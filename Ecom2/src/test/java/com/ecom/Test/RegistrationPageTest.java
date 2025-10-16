package com.ecom.Test;

import org.testng.annotations.Test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;


import com.ecom.Actions.RegistrationPageAction;
import com.ecom.Pages.RegistrationPage;
import com.ecom.Utils.ExcelUtils;
import com.ecom.Utils.HelperClass;
import com.ecom.Utils.Log;

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
