package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anike\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.rediff.com/");
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.className("signinbtn")).click();
		Alert d =driver.switchTo().alert();
		System.out.println(d.getText());
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		d.accept();;
	}

}
