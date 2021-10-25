package com.SFRWebSiteDemo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver ldriver;
	
	//Constructor
	public LoginPage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy (xpath = "//*[@id=\'CkC\']/div/div/a")
	WebElement acceptCookies;
	
	@FindBy (css = "label[for='eThE")
	WebElement loginBtn;
	
	@FindBy (css ="li[class='B D']")
	WebElement seConnecterBtn;
	
	public void setAcceptCookies() {
		acceptCookies.click();
	}
	
	public void loginBtnClick() {
		loginBtn.click();
	}
	
	public void seConnecterBtnClick() {
		seConnecterBtn.click();
	}
	

}
