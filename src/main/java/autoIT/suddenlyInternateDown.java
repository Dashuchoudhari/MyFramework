package autoIT;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class suddenlyInternateDown {

		static WebDriver driver;
		public static void main(String[] args) throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\CSS\\eclipse-workspace\\myFramework\\browsers\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.get("https://www.google.com");
			
	}

}
