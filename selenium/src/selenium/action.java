package selenium;

import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anike\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
driver.get("https://www.browserstack.com/");
Actions action = new Actions(driver); 
WebElement element = driver.findElement(By.cssSelector("#free-trial-link-anchor"));
WebElement f= driver.findElement(By.xpath("//button[@id='developers-menu-toggle']"));
//action.moveToElement(element).build().perform();
action.moveToElement(f).build().perform();	

	

	
	
	}

}
