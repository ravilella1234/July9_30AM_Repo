package com.selenium.MavenProject_August9_30AMBatch;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Class1
{
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("beforemethod : Class1");
  }
  
  @Test
  public void f() 
  {
	  System.out.println("testmethod : Class1");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("aftermethod : Class1");
  }

}
