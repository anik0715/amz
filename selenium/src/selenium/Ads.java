package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ads {

	public static void main(String[] args) throws IOException {
	Properties prop =new Properties();
FileInputStream ip = new FileInputStream("C:\\Users\\anike\\eclipse-workspace\\selenium\\name.properties");
prop.load(ip);
System.out.println(prop.getProperty("name"));

System.setProperty("webdriver.chrome.driver", "C:\\Users\\anike\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	String url = prop.getProperty("url");
	driver.get(url);
	}

}
