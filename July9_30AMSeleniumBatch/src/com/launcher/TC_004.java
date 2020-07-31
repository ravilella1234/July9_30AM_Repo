package com.launcher;

import com.relevantcodes.extentreports.LogStatus;

public class TC_004 extends BaseTest
{

		
	public static void main(String[] args) throws Exception 
	{
	
		init();
		test = report.startTest("TC_004");
		test.log(LogStatus.INFO, "Initilizing Properties files.....");
		
		launch("chromebrowser");
		test.log(LogStatus.INFO, "Opened the browser :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to url :- " + childProperty.getProperty("amazonurl"));
		
		selectOption("amazondropdown_name","Books");
		test.log(LogStatus.FAIL, "Selected the option Books By using the locator :- " + or.getProperty("amazondropdown_name"));
		
		typeText("amazonsearchtext_xpath","Harry Potter");
		test.log(LogStatus.SKIP, "Entered the test Harry Potter By using the locator :- " + or.getProperty("amazonsearchtext_xpath"));
				
		clickElement("amazonsearchbutton_class");
		test.log(LogStatus.PASS, "Clicked on Search button By using locator :- " + or.getProperty("amazonsearchbutton_class"));
	
		report.endTest(test);
		report.flush();

	}

	

}
