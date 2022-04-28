package com.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.base.pom_Base;

public class admin_panelPage extends pom_Base {
	
	@FindBy(xpath = "(//b[normalize-space()='Admin'])[1]") WebElement admin_panel;
	@FindBy(xpath = "//input[@id='searchBtn']") WebElement search_but;
	@FindBy(xpath = "//input[@id='resetBtn']") WebElement reset_but;
	@FindBy(xpath = "//input[@id='btnAdd']") WebElement add_but;
	@FindBy(xpath = "(//input[@id='btnDelete'])[1]") WebElement dlt_but;
	
	//constructor, from here the class will be iniliatize
	public admin_panelPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String admin_panel_click() throws InterruptedException {
		Thread.sleep(3);
		//wait(10);
		admin_panel.click();
		return driver.getCurrentUrl();
	
	}
	
	public boolean sea_but() {
		return search_but.isDisplayed();
		
	}
	
	public boolean res_but() {
		return reset_but.isDisplayed();
		
	}
	
	public boolean ad_but() {
		return add_but.isDisplayed();
		
	}
	
	public boolean del_but() {
		return dlt_but.isDisplayed();
		
	}

}
