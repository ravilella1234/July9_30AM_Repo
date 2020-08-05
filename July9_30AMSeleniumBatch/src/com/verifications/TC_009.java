package com.verifications;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import com.launcher.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC_009 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.startTest("TC_009");
		test.log(LogStatus.INFO, "Initilizing Properties files.....");
		
		launch("chromebrowser");
		test.log(LogStatus.INFO, "Opened the browser :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to url :- " + childProperty.getProperty("amazonurl"));

		String actualLink = driver.findElement(By.linkText("New Releases")).getAttribute("innerHTML");
		String expectedLink = "New Release";
		
		SoftAssert s = new SoftAssert();
		//s.assertEquals(actualLink, expectedLink);
		s.assertTrue(actualLink.equals(expectedLink), "Both links are not equal..");
		
		s.assertTrue(false, "err1");
		
		s.assertTrue(true, "err2");
		
		s.assertTrue(false, "err3");
		
		driver.findElement(By.linkText("New Releases")).click();
		
		s.assertAll();

	}

}
