package test;


import base.base;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.homepage;
import pages.login;

public class loginpagetest extends base {
	login log;
	homepage home;
public	loginpagetest() throws IOException {
	super();
	}
@BeforeMethod

public void setup() throws IOException {
	initialization();
	log =new login();
	home= new homepage();
	
}

@Test
public void tittletest() {
String tittle=	log.tittletest();
Assert.assertEquals(tittle, driver.getTitle());
}
@Test
public void logotest()
{}	
@AfterMethod
public void teardown() {
	driver.quit();
}}