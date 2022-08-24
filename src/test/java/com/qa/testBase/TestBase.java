package com.qa.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.pageLayer.HomePage;
import com.qa.utilities.UtilClass;
import com.qa.utilities.WebDriverListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public HomePage h;	
	public UtilClass util;
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
		
		driver.get("https://demoblaze.com/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		wdriver = new WebDriverListener();
		edriver= new EventFiringWebDriver(driver);    //all the records track by this class
		edriver.register(wdriver);             // this class register all records
		driver= edriver;
		
		h =new HomePage();
		util = new UtilClass();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
