package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anike\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		driver.findElement(By.xpath("//span[@class='ng-tns-c59-10 ui-calendar']")).click();
		
	
		String fg=driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c59-10 ng-star-inserted']")).getText();
		String gf =driver.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c59-10 ng-star-inserted']")).getText();
		 
		while(!(fg.equals("May")&& gf.equals("2022"))) {
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all ng-tns-c59-10 ng-star-inserted']")).click();
			fg=driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c59-10 ng-star-inserted']")).getText();
		 gf =driver.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c59-10 ng-star-inserted']")).getText();
			 
		}
		driver.findElement(By.xpath("//a[contains(text(),'19')]")).click();
		
		
		}
		
		
	
	
}