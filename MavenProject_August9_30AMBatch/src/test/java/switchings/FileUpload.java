package switchings;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FileUpload {
 
WebDriver driver;	

  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver sources\\chromedriver_win32 (2)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://transfer.pcloud.com/");
  }
  
  
  @Test
  public void fileupload() throws IOException, InterruptedException 
  {
	  driver.findElement(By.xpath("//span[contains(text(),'Click here to add files')]")).click();
	  Thread.sleep(3000);
	  
	  
	  //Runtime.getRuntime().exec("D:\\uploadupdated.exe");
	  Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop\\fileupload.exe");
  }

  @AfterMethod
  public void afterMethod()
  {
	  //driver.quit();
  }

}
