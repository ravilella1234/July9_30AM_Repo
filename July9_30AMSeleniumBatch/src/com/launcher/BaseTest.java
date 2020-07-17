package com.launcher;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	
	public static WebDriver driver;
	
	public static String projectPath=System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainProperty;
	public static Properties childProperty;
	
	public static void init() throws Exception
	{
		fis = new FileInputStream(projectPath + "//data.properties");
		p = new Properties();
		p.load(fis);
		
		
		fis = new FileInputStream(projectPath + "//environment.properties");
		mainProperty = new Properties();
		mainProperty.load(fis);
		System.out.println(mainProperty.getProperty("env"));
		String e = mainProperty.getProperty("env");
		
		
		fis = new FileInputStream(projectPath + "//"+e+".properties");
		childProperty = new Properties();
		childProperty.load(fis);
		System.out.println(childProperty.getProperty("amazonurl"));
		
	}
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium Ravilella\\SeleniumWebdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium Ravilella\\SeleniumWebdrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
	
	public static void navigateUrl(String url)
	{
		//driver.get(childProperty.getProperty(url));
		driver.navigate().to(childProperty.getProperty(url));
	}

}
