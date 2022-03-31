package selenium;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.datatransfer.StringSelection;
public class fileuploadpopup {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws AWTException, InterruptedException {
		

System.setProperty("webdriver.chrome.driver", "C:\\Users\\anike\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("aniketranjan2142@gmail.com");
driver.findElement(By.id("pass")).sendKeys("aniket@007");	
	driver.findElement(By.name("login")).click();
	
	driver.findElement(By.xpath("//span[contains(text(),'Photo/video')]")).click();

	
	   driver.findElement(By.xpath("//div[@class='rq0escxv l9j0dhe7 du4w35lb j83agx80 cbu4d94t buofh1pr tgvbjcpo muag1w35 enqfppq2 taijpn5t']")).click();   
	   StringSelection s = new StringSelection("C:\\Users\\anike\\OneDrive\\Pictures\\Screenshots\\hj.png");
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
	   Robot f = new Robot();
		f.keyPress(KeyEvent.VK_CONTROL);
		f.keyPress(KeyEvent.VK_V);
		f.keyRelease(KeyEvent.VK_CONTROL);
		f.keyRelease(KeyEvent.VK_V);
		f.keyPress(KeyEvent.VK_ENTER);
		f.keyRelease(KeyEvent.VK_ENTER);
	
	}
	

}
