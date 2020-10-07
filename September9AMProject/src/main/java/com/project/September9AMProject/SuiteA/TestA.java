package com.project.September9AMProject.SuiteA;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.project.September9AMProject.BaseClass.BaseTest;
import com.project.September9AMProject.BaseClass.Datautils;

public class TestA extends BaseTest
{
	
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> data) 
  {
	  System.out.println("iam f test");
	  
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
