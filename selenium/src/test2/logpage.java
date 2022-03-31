package test2;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test1.base;


public class  logpage extends base{
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name = "pass")
	WebElement pass;
	
	@FindBy(xpath = "//a[@id='u_0_2_/P']")
	WebElement createacc;
	
	@FindBy(xpath = "//a[@rel='dialog']")
	WebElement lang;
	
	@FindBy(xpath = "//a[@class='_8esh']")
	WebElement createpage;
	
	@FindBy(xpath = "//img[@class='fb_logo _8ilh img']")

	WebElement logo;
	
	@FindBy(xpath = "//button[@name='login']")
	WebElement logbtn;


public logpage () throws IOException {
      PageFactory.initElements(driver, this);
}


public String tittletest() {
	return	driver.getTitle();
	}
public boolean logotest() {
	return logo.isDisplayed();
}

}

