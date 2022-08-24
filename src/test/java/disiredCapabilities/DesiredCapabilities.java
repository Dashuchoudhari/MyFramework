package disiredCapabilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilities {
	
	public static void main (String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("dashu");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);   //enter keyword 
		
		
	//	driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
