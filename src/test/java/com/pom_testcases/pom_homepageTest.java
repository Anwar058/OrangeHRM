package com.pom_testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pom.base.pom_Base;
import com.pom.pages.homePage;

public class pom_homepageTest extends pom_Base{

static homePage homepage;
	
	public pom_homepageTest(){
		super();
	}
	
	
	@BeforeClass
	public void setup(){
		browser_lo();
		homepage = new homePage();
	}
	
	@Test(priority =1)
	public void Home(){
		
		homepage.curr_title();
		
		String title = homepage.curr_title();
		Assert.assertEquals(title, "OrangeHRM");
	}
	
	

}