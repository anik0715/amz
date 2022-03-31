package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
public class gg {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\anike\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://java2blog.com/system-out-println-shortcut-eclipse/");
	Dimension i =driver.manage().window().getSize();
	System.out.println(i);
	Robot g = new Robot();
	g.mouseMove(1000,1000);
	
	}

}
