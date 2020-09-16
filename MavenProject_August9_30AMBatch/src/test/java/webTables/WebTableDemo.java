package webTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver sources\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> tr_collecton = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("Number of Row  : " + tr_collecton.size());
		
		for(WebElement trElement : tr_collecton)
		{
			List<WebElement> td_collection = trElement.findElements(By.tagName("td"));
			for(WebElement tdElement : td_collection)
			{
				if(tdElement.getText().equals("Helen Bennett"))
				{
					System.out.println(tdElement.getText());
				}
				
			}
		}

	}

}
