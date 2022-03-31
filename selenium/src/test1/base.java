package test1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public static WebDriver driver;
	public static Properties prop;

	public  base() throws IOException  {
		
		prop= new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\anike\\eclipse-workspace\\pom\\src\\config\\confg.properties");
		prop.load(ip);}
		
		public  void initialization() {
			String browsername= prop.getProperty("browser")	;
			if (browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\anike\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(prop.getProperty("url"));
	}
	

}}
