package com.verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_005 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\JulyDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		
		//String actualLink = driver.findElement(By.linkText("New Releases")).getText();
		String actualLink = driver.findElement(By.linkText("New Releases")).getAttribute("href");
		String expectedLink = "New Release";
		
		System.out.println("Actual Link : " + actualLink);
		System.out.println("Expected Link : " + expectedLink);
		
		//if(actualLink.equals(expectedLink))
		//if(actualLink.equalsIgnoreCase(expectedLink))
		if(actualLink.contains(expectedLink))
			System.out.println("Both links are equal...");
		else
			System.out.println("Both links are not equal....");

	}

}
