package com.launcher;

import org.apache.log4j.Logger;

public class TC_003 extends BaseTest
{

	private static final Logger log = Logger.getLogger(TC_003.class);
	
	
	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("Initilizing Properties files.....");
		
		launch("chromebrowser");
		log.info("Opened the browser :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigated to url :- " + childProperty.getProperty("amazonurl"));
		
		selectOption("amazondropdown_name","Books");
		log.info("Selected the option Books By using the locator :- " + or.getProperty("amazondropdown_name"));
		
		typeText("amazonsearchtext_xpath","Harry Potter");
		log.info("Entered the test Harry Potter By using the locator :- " + or.getProperty("amazonsearchtext_xpath"));
		
		clickElement("amazonsearchbutton_class");
		log.info("Clicked on Search button By using locator :- " + or.getProperty("amazonsearchbutton_class"));
		
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Harry Potter");
		
		//driver.findElement(By.className("nav-input")).click();

	}

	

}
