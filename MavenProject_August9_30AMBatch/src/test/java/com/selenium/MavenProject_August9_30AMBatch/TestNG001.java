package com.selenium.MavenProject_August9_30AMBatch;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG001 
{
  @Test(priority = 1)
  public void f() 
  {
	  System.out.println("f");
  }
  
  @Test(priority = 2,enabled = false)
  public void z() 
  {
	  System.out.println("z");
  }
  
  @Test(priority = 3)
  public void a() 
  {
	  System.out.println("a");
  }
  
  @BeforeMethod
  public void startProcess() 
  {
	  System.out.println("startProcess");
  }

  @AfterMethod
  public void endProcess() 
  {
	  System.out.println("endProcess");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("beforeClass");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("afterClass");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("beforeTest");
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("afterTest");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("beforeSuite");
  }

  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("afterSuite");
  }

}
