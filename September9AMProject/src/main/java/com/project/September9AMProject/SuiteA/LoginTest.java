package com.project.September9AMProject.SuiteA;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.project.September9AMProject.BaseClass.BaseTest;
import com.project.September9AMProject.BaseClass.Datautils;

public class LoginTest extends BaseTest
{

	
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> data) 
  {
	  System.out.println("iam f test...");
	  
	  if(data.get("Runmode").equals("N"))
		  throw new SkipException("Runmode is set to No....");
		
	  ds.executeKeywords(xls, testcaseName, data);
  }
  
  @DataProvider
  public Object[][] getData() throws Exception
  {
	String sheetName = "Data";
	//String testcaseName = "LoginTest";
	
	return Datautils.getTestData(xls, sheetName, testcaseName);
  }
  

}
