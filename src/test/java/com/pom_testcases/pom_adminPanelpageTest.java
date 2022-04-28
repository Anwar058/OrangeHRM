package com.pom_testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pom.base.pom_Base;
import com.pom.pages.adminPage;
import com.pom.pages.admin_panelPage;

public class pom_adminPanelpageTest extends pom_Base {
	
static admin_panelPage adminpanelpage;

	
	public pom_adminPanelpageTest(){
		super();
	}
	@BeforeClass
	public void setup(){
		// browser_lo();
		adminpanelpage = new admin_panelPage();
	}
	
	@Test
	public void adm() throws InterruptedException {
		adminpanelpage.admin_panel_click();
		String url = adminpanelpage.admin_panel_click();
		Assert.assertTrue(url.contains("admin/viewSystemUsers"));
		
	}
	
	@Test(priority = 7)
	public void sea_bt(){
		
		Assert.assertTrue(adminpanelpage.sea_but());

	}
	
	@Test(priority = 8)
	public void res_bt(){
		
		Assert.assertTrue(adminpanelpage.res_but());


	}
	
	
	@Test(priority = 9)
	public void ad_bt(){
		
		Assert.assertTrue(adminpanelpage.ad_but());

	}
	
	@Test(priority = 10)
	public void dlt_bt(){
		
		Assert.assertTrue(adminpanelpage.del_but());


	}

}
