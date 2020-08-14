package com.selenium.MavenProject_August9_30AMBatch;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest 
{
	
	public static WebDriver driver;
	
	public static String projectPath=System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainProperty;
	public static Properties childProperty;
	public static Properties or;
	public static ExtentReports report;
	public static ExtentTest test;
	public static String filePath;
	
	
	static
	{
		Date dt = new Date();
		filePath = dt.toString().replace(':', '_').replace(' ', '_');
	}
	
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
		
		fis = new FileInputStream(projectPath + "//log4jconfig.properties");
		PropertyConfigurator.configure(fis);
		
		report = ExtentManager.getInsatnce();
		
	}
	
	public static void launch(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\JulyDrivers\\chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\DELL\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 12");
			option.addArguments("--disable-notifications");
			
			driver = new ChromeDriver(option);
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\JulyDrivers\\geckodriver.exe");
			
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
	
	
	// ***************************  Verifications  ***********************
	
	public static boolean verifyLink(String expectedLink) 
	{
		String actualLink = driver.findElement(By.linkText("New Releases")).getAttribute("innerHTML");
		if(actualLink.equals(expectedLink))
			return true;
		else
			return false;
	}
	
	
	
	// *******************************  Reportings   *********************
	
	public static void reportSucess(String successMsg) 
	{
		test.log(LogStatus.PASS, successMsg);
	}

	public static void reportFailure(String failureMsg) throws Exception 
	{
		test.log(LogStatus.FAIL, failureMsg);
		takesScreenshot();
	}

	public static void takesScreenshot() throws Exception 
	{
		Date dt=new Date();
		System.out.println(dt);
		String dateFormat=dt.toString().replace(":", "_").replace(" ", "_")+".png";		
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrFile, new File(projectPath+"\\failurescreenshots\\"+dateFormat));
		
		test.log(LogStatus.INFO, "Screenshot --->" +test.addScreenCapture(projectPath+"\\failurescreenshots\\"+dateFormat));
		
	}
	

}
