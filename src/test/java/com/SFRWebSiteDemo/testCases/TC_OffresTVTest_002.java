package com.SFRWebSiteDemo.testCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.SFRWebSiteDemo.pageObjects.OffresTV;

public class TC_OffresTVTest_002 extends BaseTest {
	
	@Test
	public void offresTVTest() throws InterruptedException, IOException {
		driver.get(baseURL);
		OffresTV oTV = new OffresTV(driver);
		oTV.setOffresBoxbtn(driver);
		oTV.setElegibility(driver, homeAdress, city);
		//captureScreen(driver, "loginTest");
	}
}
