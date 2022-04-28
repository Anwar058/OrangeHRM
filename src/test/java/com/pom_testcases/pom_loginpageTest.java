package com.pom_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pom.base.pom_Base;
import com.pom.pages.LoginPage;
import com.pom.pages.homePage;

public class pom_loginpageTest extends pom_Base {

static LoginPage loginpage;
	public pom_loginpageTest(){
		super();
	}
	

@BeforeClass
	public void setup(){
		//browser_lo();
		loginpage = new LoginPage();
	}
	
	@Test (priority = 2)
	public void signin() throws InterruptedException {
		Thread.sleep(2000);
		loginpage.name_(prop.getProperty("username"));
		loginpage.pass(prop.getProperty("pasword"));
		loginpage.login();
	}
	
	@Test (priority = 2)
	public void url_verificaiton() {
		loginpage.current_url();
		String url = loginpage.current_url();
		Assert.assertTrue(url.contains("dashboard"));
		
	}
	
	@Test (priority = 3)
	public void admin_tab_verificaiton() {
		loginpage.current_url();
		String url = loginpage.current_url();
		Assert.assertTrue(url.contains("dashboard"));
		
	}
	
	
}
