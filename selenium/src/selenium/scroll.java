package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anike\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
driver.manage().window().maximize();

		
		
		
	JavascriptExecutor j = (JavascriptExecutor) driver;
	driver.get("https://www.makemytrip.com/");
	WebElement e = driver.findElement(By.xpath("//input [@class='topbarInputBox footerInput']"));
	j.executeScript("arguments[0].scrollIntoView()", e);
	
	
	}

}
