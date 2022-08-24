package extentReoport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentTReport  {
static WebDriver driver;
	public static void main(String[] args) {

		ExtentHtmlReporter htmlReporter= new  ExtentHtmlReporter("extentReport.html");
		
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test=extent.createTest("My login test");
		
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
		
		test.log(Status.INFO, "starting testscript");
		driver.get("https://demoblaze.com/index.html");
		
		test.pass("clicked on phones");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[contains(text(),'Phones')]")).click();
		driver.quit();
		test.pass("browser closed");
		
		extent.flush();  // without flush we cannot create a report
		
		
		
		
		
		
	}

}
