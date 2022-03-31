package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriotexecutor  {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anike\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.guru99.com/execute-javascript-selenium-webdriver.html");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement corejava = driver.findElement(By.cssSelector("body.post-template-default.single.single-post.postid-1052.single-format-standard.wp-custom-logo.wp-embed-responsive.footer-on-bottom.animate-body-popup.link-style-standard.has-sidebar.has-sticky-sidebar-widget.content-title-style-normal.content-width-normal.content-style-unboxed.content-vertical-padding-hide.non-transparent-header.mobile-non-transparent-header.hide-focus-outline:nth-child(2) div.site:nth-child(2) header.site-header:nth-child(2) div.site-header-wrap div.site-header-inner-wrap div.site-header-upper-wrap div.site-header-upper-inner-wrap div.site-main-header-wrap.site-header-row-container.site-header-focus-item.site-header-row-layout-standard div.site-header-row-container-inner div.site-container div.site-main-header-inner-wrap.site-header-row.site-header-row-has-sides.site-header-row-no-center div.site-header-main-section-right.site-header-section.site-header-section-right div.site-header-item.site-header-focus-item.site-header-item-main-navigation.header-navigation-layout-stretch-false.header-navigation-layout-fill-stretch-false:nth-child(1) nav.main-navigation.header-navigation.nav--toggle-sub.header-navigation-style-standard.header-navigation-dropdown-animation-none div.primary-menu-container.header-menu-container ul.menu li.menu-item.menu-item-type-custom.menu-item-object-custom.menu-item-3172:nth-child(1) > a:nth-child(1)"));//
		WebElement test = driver.findElement(By.xpath("//a[contains(text(),'Report a Bug')]"));

	
			JavascriptExecutor f = (JavascriptExecutor)driver;
		//f.executeScript("alert('welcome');");
		//f.executeScript("arguments[0].click();", corejava);
		//corejava.click();
	//String t =f.executeScript("return document.domain;").toString();
//	System.out.println(t);
	f.executeScript("window.location='https://www.youtube.com/watch?v=Dpx1Q62QpFU&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=14'");
			
//f.executeScript("arguments[0].scrollIntoView(true);", test);
//f.executeScript("arguments[0].style.border='3px dotted blue'", test);
	
	}
}