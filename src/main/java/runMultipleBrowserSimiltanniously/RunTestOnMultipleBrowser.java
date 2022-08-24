package runMultipleBrowserSimiltanniously;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RunTestOnMultipleBrowser {
	WebDriver driver=null;
	
	@BeforeTest
	public void setup(String br){
		if(br.equalsIgnoreCase("chrome")) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\CSS\\eclipse-workspace\\myFramework\\browsers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gesko.driver", "C:\\Users\\CSS\\eclipse-workspace\\myFramework\\browsers\\chromedriver.exe");
			driver=new FirefoxDriver();
			}
		else if(br.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\CSS\\eclipse-workspace\\myFramework\\browsers\\chromedriver.exe");
			driver=new InternetExplorerDriver();
		}
		
	}
	@Test
	public void test1() throws InterruptedException {
		driver.get("https://google.com");
		Thread.sleep(4000);
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
