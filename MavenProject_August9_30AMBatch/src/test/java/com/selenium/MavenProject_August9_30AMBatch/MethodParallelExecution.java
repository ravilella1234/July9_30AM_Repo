package com.selenium.MavenProject_August9_30AMBatch;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class MethodParallelExecution 
{
	
  
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("iam beforeMethod");
  }

  @Test
  public void test1()
  {
	  System.out.println("Iam test1");
  }
  
  @Test
  public void test2()
  {
	  System.out.println("Iam test2");
  }
  
  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("Iam afterMethod");
  }

}
