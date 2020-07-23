package com.launcher;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class BaseTest 
{
	
	public static WebDriver driver;
	
	public static String projectPath=System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainProperty;
	public static Properties childProperty;
	public static Properties or;
	
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
		
		
		fis = new FileInputStream(projectPath + "//or.properties");
		or = new Properties();
		or.load(fis);
		
	}
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\July Drivers\\chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\DELL\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 12");
			option.addArguments("--disable-notifications");
			
			driver = new ChromeDriver(option);
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\July Drivers\\geckodriver.exe");
			
			ProfilesIni p = new ProfilesIni();
			FirefoxProfile profile = p.getProfile("JulyFFProfile");
			profile.setPreference("dom.webnotifications.enabled", false);
			
			FirefoxOptions option = new FirefoxOptions();
			option.setProfile(profile);
			
			driver = new FirefoxDriver(option);
		}
		
		driver.manage().window().maximize();
	}
	
	public static void navigateUrl(String url)
	{
		//driver.get(childProperty.getProperty(url));
		driver.navigate().to(childProperty.getProperty(url));
	}
	
	
	public static void clickElement(String locatorKey) 
	{
		getElement(locatorKey).click();
		//driver.findElement(By.className(locatorKey)).click();
	}

	public static void typeText(String locatorKey, String text) 
	{
		getElement(locatorKey).sendKeys(text);
		//driver.findElement(By.id(locatorKey)).sendKeys(text);
	}

	public static void selectOption(String locatorKey, String option) 
	{
		getElement(locatorKey).sendKeys(option);
		//driver.findElement(By.id(locatorKey)).sendKeys(option);
	}

	public static WebElement getElement(String locatorKey) 
	{
		WebElement element=null;
		
		if(locatorKey.endsWith("_id")) {
			element= driver.findElement(By.id(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_name")) {
			element= driver.findElement(By.name(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_class")) {
			element= driver.findElement(By.className(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_xpath")) {
			element= driver.findElement(By.xpath(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_linktext")) {
			element= driver.findElement(By.linkText(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_partiallink")) {
			element= driver.findElement(By.partialLinkText(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_css")) {
			element= driver.findElement(By.cssSelector(or.getProperty(locatorKey)));
		}
		
		
		return element;
	}

}
