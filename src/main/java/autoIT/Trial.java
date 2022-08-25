package autoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {
	static WebDriver driver;
		public static void main(String[] args) throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\CSS\\eclipse-workspace\\myFramework\\browsers\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.get("https://www.filemail.com/share/upload-file");
			driver.findElement(By.xpath("//*[@id=\"addBtn\"]")).click();
			
			Runtime.getRuntime().exec("C:\\Users\\CSS\\Desktop\\auto it\\fileuploadAutoIT.exe");
			
			Thread.sleep(4000);
	}

}
