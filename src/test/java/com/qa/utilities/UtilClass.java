package com.qa.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class UtilClass extends TestBase{
	
	public UtilClass() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Add to cart')]")
	private WebElement addToCart;
	
	public void ClickOn_addToCart() {
		addToCart.click();
	}
	
	public void getTextFromAlert() {
	String str=	driver.switchTo().alert().getText();
	System.out.println(str);
	}
	public void Alert_accept() {
		driver.switchTo().alert().accept();
	}
	
	public static void takeScreenshot(){
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File sourse=ts.getScreenshotAs(OutputType.FILE);
			
			String path="C:\\Users\\CSS\\eclipse-workspace\\myFramework\\test-output\\Sreenshot"+System.currentTimeMillis()+".png";
			
			File destination=new File(path);
			FileHandler.copy(sourse, destination);
		}
		catch(IOException e){
			
			e.printStackTrace();
			
			
		}
	}
	
	

}
