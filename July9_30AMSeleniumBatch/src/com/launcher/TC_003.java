package com.launcher;

public class TC_003 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
		
		navigateUrl("amazonurl");
		
		selectOption("amazondropdown_name","Books");
		
		typeText("amazonsearchtext_xpath","Harry Potter");
		
		clickElement("amazonsearchbutton_class");
		
		
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Harry Potter");
		
		//driver.findElement(By.className("nav-input")).click();

	}

	

}
