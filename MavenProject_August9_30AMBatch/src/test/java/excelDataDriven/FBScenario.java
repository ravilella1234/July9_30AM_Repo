package excelDataDriven;

import org.testng.annotations.Test;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class FBScenario 
{
	WebDriver driver;
	
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> data)  
  {
	  System.setProperty("webdriver.chrome.driver", "D:/drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	
		driver.findElement(By.id("email")).sendKeys(data.get("UserName"));
		driver.findElement(By.id("pass")).sendKeys(data.get("UserPassword"));
  }

  @DataProvider
  public Object[][] getData() throws Exception 
  {
	  ExcelAPI e = new ExcelAPI("C:/Users/DELL/Desktop/suitex.xlsx");
	  String sheetName = "data";
	  String testcaseName = "LoginTest";
	  return Datautils.getTestData(e, sheetName, testcaseName);	
  }
}
