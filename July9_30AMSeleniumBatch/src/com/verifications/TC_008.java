package com.verifications;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.launcher.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC_008 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.startTest("TC_008");
		test.log(LogStatus.INFO, "Initilizing Properties files.....");
		
		launch("chromebrowser");
		test.log(LogStatus.INFO, "Opened the browser :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to url :- " + childProperty.getProperty("amazonurl"));

		String actualLink = driver.findElement(By.linkText("New Releases")).getAttribute("innerHTML");
		String expectedLink = "New Release";
		
		//Assert.assertEquals(actualLink, expectedLink);
		Assert.assertTrue(actualLink.equals(expectedLink), "Both links are not equal");
		
		driver.findElement(By.linkText("New Releases")).click();

	}

}
