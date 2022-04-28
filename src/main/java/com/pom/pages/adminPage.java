package com.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.base.pom_Base;

public class adminPage extends pom_Base {

	@FindBy(xpath = "//ul[@id='mainMenuFirstLevelUnorderedList']") WebElement admin_panel;
	@FindBy(xpath = "//a[@id='welcome']") WebElement welcome_panel;
	@FindBy(xpath = "//input[@id='btnLogin']") WebElement sign_in;
	
	
	//constructor, from here the class will be iniliatize
	public adminPage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean ad_panel() {
		return admin_panel.isDisplayed();
		
	}
	
	public boolean wel_panel() {
		 return welcome_panel.isDisplayed();
		
	}
		
	
}
