package com.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.base.pom_Base;

public class homePage extends pom_Base {
	@FindBy(xpath = "//span[normalize-space()='Username']") WebElement user_name;
	@FindBy(xpath = "//span[normalize-space()='Password']") WebElement pass_word;
	@FindBy(xpath = "//input[@id='btnLogin']") WebElement sign_in;
	
	
	//constructor, from here the class will be iniliatize
	public homePage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public String curr_title(){
		return driver.getTitle();
	}
	
	public void name_(String name){
		user_name.sendKeys(name);	
	}

	public void pass(String pass) {
		pass_word.sendKeys(pass);
	}
	
	public void login() {
		sign_in.click();
	}


}
