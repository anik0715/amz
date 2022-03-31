package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.testutil;





public class base {
public static WebDriver driver;
public static Properties prop;


public   base() throws IOException  {
	
	prop= new Properties();
	FileInputStream ip = new FileInputStream("C:\\Users\\anike\\git\\amz\\pom\\src\\config\\confg.properties");
	prop.load(ip);
	}


@SuppressWarnings("deprecation")
public  void initialization() {
String browsername= prop.getProperty("browser")	;
if (browsername.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\anike\\Downloads\\chromedriver_win32\\chromedriver.exe");
 driver = new ChromeDriver();
 driver.get(prop.getProperty("url"));

driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
;

}




}}