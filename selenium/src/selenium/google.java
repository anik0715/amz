package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	@SuppressWarnings({ "deprecation", "unused" })
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anike\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 driver.get("https://www.google.com/");
 driver.findElement(By.name("q")).sendKeys("test");

List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
	System.out.println(list.size());
			
			for(int i = 0;i<=list.size();i++)
			{
				if (list.get(i).getText().contains("speed"));
					 list.get(i).click();
					 break;
			}
			
			
			
	}

}
