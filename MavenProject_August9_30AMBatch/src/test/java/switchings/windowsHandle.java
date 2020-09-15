package switchings;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsHandle 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver sources\\chromedriver_win32 (2)\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  //driver.get("http://www.hdfcbank.com/");
		  driver.get("https://www.sc.com/in/bank-with-us/online-banking-login/");
		  System.out.println(driver.getTitle());
		  String parentWindow = driver.getWindowHandle();
		  System.out.println("Parent Windowid :" + parentWindow);
		  
		  driver.findElement(By.xpath("//a[@title='Apply Now']")).click();
		  
		 Set<String> multiWindows = driver.getWindowHandles();
		 Iterator<String> itr = multiWindows.iterator();
		 while(itr.hasNext())
		 {
			 String currrentWindow = itr.next();
			 System.out.println("Window id's :" + currrentWindow);
			 if(!currrentWindow.equals(parentWindow))
			 {
				 driver.switchTo().window(currrentWindow);
			 }
		 }
		 
		 String childwindowTitle = driver.getTitle();
		 System.out.println("ChildWindow Title :" + childwindowTitle);
		 //driver.findElement(By.id("cities")).sendKeys("Baroda");
		 
		 driver.close();
		 
		driver.switchTo().window(parentWindow);
		System.out.println("Parent window title :" +driver.getTitle());
		 
	}
}
