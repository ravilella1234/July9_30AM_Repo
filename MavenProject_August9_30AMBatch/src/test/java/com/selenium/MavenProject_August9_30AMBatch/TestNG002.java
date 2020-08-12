package com.selenium.MavenProject_August9_30AMBatch;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNG002 extends BaseTest
{
 
  
  @BeforeMethod
  public void startProcess() throws Exception 
  {
	    init();
		test = report.startTest("TC_004");
		test.log(LogStatus.INFO, "Initilizing Properties files.....");
		
		launch("chromebrowser");
		test.log(LogStatus.INFO, "Opened the browser :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to url :- " + childProperty.getProperty("amazonurl"));
	  
  }
  
  @Test
  public void amazon() 
  {
	  	selectOption("amazondropdown_name","Books");
		test.log(LogStatus.FAIL, "Selected the option Books By using the locator :- " + or.getProperty("amazondropdown_name"));
		
		typeText("amazonsearchtext_xpath","Harry Potter");
		test.log(LogStatus.SKIP, "Entered the test Harry Potter By using the locator :- " + or.getProperty("amazonsearchtext_xpath"));
				
		clickElement("amazonsearchbutton_class");
		test.log(LogStatus.PASS, "Clicked on Search button By using locator :- " + or.getProperty("amazonsearchbutton_class"));
  }

  @AfterMethod
  public void endProcess() 
  {
	  driver.quit();
	  
	  report.endTest(test);
	  report.flush();
  }

}
