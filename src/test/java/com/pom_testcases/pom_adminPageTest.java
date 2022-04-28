package com.pom_testcases;

import java.sql.Driver;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pom.base.pom_Base;
import com.pom.pages.adminPage;
import com.pom.pages.homePage;

public class pom_adminPageTest extends pom_Base{
	
static adminPage adminpage;

	
	public pom_adminPageTest(){
		super();
	}
	@BeforeClass
	public void setup(){
		// browser_lo();
		adminpage = new adminPage();
	}
	
	@Test(priority = 5)
	public void Home(){
		
		
		
		Assert.assertTrue(adminpage.ad_panel());

	}
	
	@Test(priority = 6)
	public void welcome(){
		
		
		
		Assert.assertTrue(adminpage.wel_panel());

	}
	
	

}
