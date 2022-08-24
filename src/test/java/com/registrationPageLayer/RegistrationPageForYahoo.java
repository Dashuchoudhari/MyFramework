package com.registrationPageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.testBase.baseClassForYahoo;

public class RegistrationPageForYahoo extends baseClassForYahoo {

	
	
WebDriver driver;
	
	public void RegistrationPage(WebDriver rdriver)
	{
		
		PageFactory.initElements(rdriver, this);
	}
	
	public void InputFistName() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"usernamereg-firstName\"]")).sendKeys("Dasharath");
		
		
		Thread.sleep(4000);
	}
	public void InputLastName() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\\\"usernamereg-lastName\\\"]")).sendKeys("Choudhari");
		Thread.sleep(4000);
	}
	
	public void NewYahooEmail() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\\\"usernamereg-userId\\\"]")).sendKeys("dasharath.choudhari");
		Thread.sleep(4000);
	}
	public void NewPassward() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\\\"usernamereg-password\\\"]")).sendKeys("Dasharath@123");
		Thread.sleep(4000);
	}
	public void BirthYear()
	{
		driver.findElement(By.xpath("//*[@id=\\\"usernamereg-birthYear\\\"]")).sendKeys("1991");
		
	}
	
	public void SelectCountryCode() throws InterruptedException
	{
		WebElement ContryCode=driver.findElement(By.xpath("//*[@id=\"contact-countrycode-dropdown\"]/div[2]/div/select"));
		Select s1=new Select(ContryCode);
	    s1.selectByVisibleText("India(+91)");
		Thread.sleep(4000);
	}
	
	public void InputRecoveryMobileNumber() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"usernamereg-phone\"]")).sendKeys("9822778346");
		Thread.sleep(4000);
	}
	public void InputInvalidRecoveryMobileNumber() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"usernamereg-phone\"]")).sendKeys("90000000");
		Thread.sleep(4000);
	}
	
	public void clickOnSendCodeButton() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"reg-submit-button\"]")).click();
		
	}
	public void VerifyMobileNumber() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"verification-code-field\"]")).sendKeys("97375");
		
	  //Selenium is not support OTP and Captcha, so that inserted manual OTP code for Succesfull Test
	}
		public void clickOnVerifyButton() throws InterruptedException
		{
			driver.findElement(By.xpath("//*[@id=\"verify-code-button\"]")).click();
			Thread.sleep(4000);
	}
	
	
	
	
	}
