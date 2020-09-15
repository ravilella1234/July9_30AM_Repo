package actions;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseOperations 
{

	WebDriver driver;
	Actions a ;
	
	
	@BeforeMethod
	
	public void setup() throws MalformedURLException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver sources\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	
	
	@Test (priority =0,enabled = false)
	public void MoveToelement() throws InterruptedException
	{	
		//moveToElement(WebElement target)
		
		driver.get("https://www.snapdeal.com");
		a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id='sdHeader']/div[4]/div[2]/div/div[3]/div[3]/div/span[1]"))).perform();
		driver.findElement(By.xpath("//*[@id='sdHeader']/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[1]/ul/li[1]/a")).click();
		Thread.sleep(3000);
	}
	
	
	
	
	@Test (priority =1,enabled = false)
	public void dragAnddrop() throws InterruptedException
	{
		
		//dragAndDrop(WebElement source, WebElement target)
				driver.get("http://jqueryui.com/droppable/");
				driver.switchTo().frame(0);
				WebElement drag = driver.findElement(By.id("draggable"));
				WebElement drop = driver.findElement(By.id("droppable"));
				
				a= new Actions(driver);
				//a.dragAndDrop(drag, drop).perform();
				a.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
				Thread.sleep(4000);
	}
		
	
	@Test (priority =3,enabled = false)
	public void resizeMethod() throws InterruptedException
	{
		driver.get("http://jqueryui.com/resizable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement drag = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		a = new Actions(driver);
		a.moveToElement(drag, 100, 200).build();
		//a.clickAndHold(drag).moveByOffset(100, 200).release(drag).build().perform();
		Thread.sleep(4000);
	}
	
	
		
	@Test (priority =4,enabled = false)
	public void rightClickMethod() throws InterruptedException
	{
		driver.get("http://jqueryui.com/");
		
		WebElement drag = driver.findElement(By.xpath(".//*[@id='sidebar']/aside[1]/ul/li[4]/a"));
		a = new Actions(driver);		
		a.contextClick(drag).perform();
		Thread.sleep(8000);
	}
	
	
	
	
	@Test (priority =5,enabled = false)
	public void slider() throws InterruptedException
	{
		//a.dragAndDropBy(WebElement source, int xOffset, int yOffset)
				driver.get("http://jqueryui.com/slider/");
				driver.switchTo().frame(0);
				WebElement drag = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
				a = new Actions(driver);
				//a.moveToElement(drag, 200, 0).perform();
				a.clickAndHold(drag).moveByOffset(200, 0).release(drag).build().perform();
				Thread.sleep(4000);			
	}
	
	
	
	
	@Test (priority =6,enabled = false)
	public void Browserslider() throws InterruptedException
	{
		
		//Browser Scroll Method
		driver.get("http://www.seleniumhq.org/download/");	
		
		for(int i=0;i<10;i++)
		{
			((RemoteWebDriver)driver).executeScript("window.scrollBy(0,200)");
			Thread.sleep(2000);
		}
	}
	
	
	
	@Test(priority =7)
	public void autoSuggestion() throws InterruptedException
	{
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("hadoop tutorial");
		//driver.findElement(By.name("btnK")).click();
		String val = driver.findElement(By.name("q")).getAttribute("value");
		
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='erkvQe']/li/div/div[2]/div/span"));
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getText().equals(val))
			{
				list.get(i).click();
				return;
			}
			list = driver.findElements(By.xpath("//ul[@class='erkvQe']/li/div/div/span"));
		}
	}
	
	
	/*@Test
	public void selectAll()
	{
		
		driver.action.key_down(:control)
        .send_keys("a")
        .key_up(:control)
        .perform
	}*/
	
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
	
}
