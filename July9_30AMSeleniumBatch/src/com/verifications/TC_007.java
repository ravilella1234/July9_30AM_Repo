package com.verifications;

import com.launcher.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC_007 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.startTest("TC_007");
		test.log(LogStatus.INFO, "Initilizing Properties files.....");
		
		launch("chromebrowser");
		test.log(LogStatus.INFO, "Opened the browser :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to url :- " + childProperty.getProperty("amazonurl"));

		String expectedLink = "New Release";		
		if(!verifyLink(expectedLink))
			reportFailure("Both links are not equal....");
		else
			reportSucess("Both links are equal....");
		
		report.endTest(test);
		report.flush();

	}

	

	

}
