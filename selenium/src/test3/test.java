package test3;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import test1.base;
import test2.logpage;



public class test extends base{
	
public static logpage log;



public  test() throws IOException {
	super();
	
}
@BeforeMethod
public void setup() throws IOException {
	initialization();
	log =new logpage();
}

@Test(priority =  1)
public void tittletest() {
String tittle=	log.tittletest();
Assert.assertEquals(tittle, driver.getTitle());
}
@Test
public void logotestt() {
	assertEquals(log.logotest(), true);
}

@AfterMethod
public void teardown() {
	driver.quit();
}



}
