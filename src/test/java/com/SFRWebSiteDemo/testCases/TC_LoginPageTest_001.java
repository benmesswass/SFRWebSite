package com.SFRWebSiteDemo.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.SFRWebSiteDemo.pageObjects.LoginPage;

public class TC_LoginPageTest_001 extends BaseTest{

	@Test
	public void loginPageTest() throws InterruptedException {
		driver.get(baseURL);
		LoginPage lg = new LoginPage(driver);
		Thread.sleep(2000);
		lg.setAcceptCookies();
		lg.loginBtnClick();
		Thread.sleep(2000);
		lg.seConnecterBtnClick();
		}
}
