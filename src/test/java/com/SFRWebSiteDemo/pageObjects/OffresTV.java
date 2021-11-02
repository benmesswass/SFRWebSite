package com.SFRWebSiteDemo.pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OffresTV {
	
WebDriver ldriver;
	
	//Constructor
	public OffresTV(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy (css = "li[class='PAR ho hf']")
	WebElement offresBoxbtn;
	
	@FindBy (xpath = "//*[@id=\'CkC\']/div/div/a")
	WebElement acceptCookies;
	
	@FindBy (xpath = "//ul[@class='MM3']/li[1]/ul/li[5]")
	WebElement offresBoxTVbtn;
	
	@FindBy (xpath = "//section[@class='box-tv']/p/a")
	WebElement elegibility;
	
	@FindBy (xpath = "//*[@id=\"Adresse\"]/div/div[1]/input")
	WebElement adressElegibility;
	
	@FindBy (xpath ="//div[@class='bl_submit']")
	WebElement testerBtn;
	
	@FindBy (xpath ="//a[@class='btn toAdd']")
	WebElement testerMonElegibiliteBtn;
	
	
		public void setAcceptCookies() {
		acceptCookies.click();
	}
	
	public void setOffresBoxbtn(WebDriver driver) throws InterruptedException {
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        acceptCookies.click();
        actions.moveToElement(offresBoxbtn).build().perform();
        Thread.sleep(2000);
        offresBoxTVbtn.click();
	}
	
	public void setElegibility(WebDriver driver, String homeAdress, String city) throws InterruptedException {
		Thread.sleep(2000);
		elegibility.click();
		Thread.sleep(2000);
		adressElegibility.click();
		adressElegibility.sendKeys(homeAdress);
		Thread.sleep(2000);
		int nbreSuggestions = driver.findElements(By.xpath("//div[@class='suggestions-container is-visible']/ul/li")).size();
		for (int i=1; i<nbreSuggestions+1; i++) {
			//WebElement adressToBeSelected = driver.findElement(By.xpath("//div[@class='suggestions-container is-visible']/ul/li["+i+"]"));
			WebElement adressToBeSelected = driver.findElement(By.xpath("//*[@id=\'Adresse\']/div/div[2]/ul/li["+i+"]"));
			System.out.println(adressToBeSelected.getText()); 
			if (adressToBeSelected.getText().contains(city)) {
				System.out.println(adressToBeSelected.getText()); 
				adressToBeSelected.click();
				break;
			}
		}
		testerBtn.click();	
		
		Thread.sleep(5000);
		testerMonElegibiliteBtn.click();

		}
	}

	/*
	public void chooseAdress() {
		for (WebElement sugg:suggestedAdresses) {
			System.out.println(sugg);
			/*
			 if (sugg.getText().contains("nanterre")) {
				sugg.click();
			}
	
	*/

