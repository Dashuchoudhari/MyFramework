package com.testBase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.registrationPageLayer.RegistrationPageForYahoo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClassForYahoo {
	public static WebDriver driver;
	public RegistrationPageForYahoo h;	
//	public UtilClass util;
	public WebDriverListener wdriver;
	public EventFiringWebDriver edriver;
	@BeforeMethod
	public void start()
	{
		String br="Chrome";
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please provide correct browser name");
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/account/create?.intl=us&specId=yidReg&done=https%3A%2F%2Fwww.yahoo.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
		
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
