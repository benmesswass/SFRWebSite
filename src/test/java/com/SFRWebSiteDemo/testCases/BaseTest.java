package com.SFRWebSiteDemo.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.SFRWebSiteDemo.utilities.*;

public class BaseTest {

	ReadConfig readconfig=new ReadConfig();

	public String baseURL= readconfig.getApplicationURL();
	public String homeAdress = readconfig.gethomeAdress();
	public String city = readconfig.getCity();
	public String chromepath = readconfig.getChromePath();
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void setup()
	{			
				System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
				driver=new ChromeDriver();
	}	
		
}
