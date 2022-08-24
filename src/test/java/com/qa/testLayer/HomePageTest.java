package com.qa.testLayer;



import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.qa.pageLayer.HomePage;
import com.qa.testBase.TestBase;

public class HomePageTest extends TestBase{
	
	
	@Test
	public void verifySamsungGalaxyS6() throws InterruptedException
	{
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("C:\\Users\\CSS\\eclipse-workspace\\myFramework\\test-output");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.flush();
		
		
		h.clickOnPhones();
		h.clickOnSamsungGalaxyS6();
		util.ClickOn_addToCart();
		Thread.sleep(2000);
		util.getTextFromAlert();
		util.Alert_accept();
	}
	
	@Test
	public void verifyNokiaLumia1520() throws InterruptedException
	{
		h.clickOnPhones();
		h.clickOnNokiaLumia1520();
		util.ClickOn_addToCart();
		Thread.sleep(2000);
		util.getTextFromAlert();
		util.Alert_accept();
	}
	
	@Test
	public void verifyNexus6() throws InterruptedException
	{
		h.clickOnPhones();
		h.clickOnNexus6();
		util.ClickOn_addToCart();
		Thread.sleep(2000);
		util.getTextFromAlert();
		util.Alert_accept();
	}

}