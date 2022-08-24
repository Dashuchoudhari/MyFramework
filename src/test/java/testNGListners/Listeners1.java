package testNGListners;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

import org.testng.IClass;
import org.testng.IRetryAnalyzer;
import org.testng.ITestClass;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.internal.ConstructorOrMethod;
import org.testng.internal.annotations.ITest;
import org.testng.xml.XmlTest;

public class Listeners1 implements  ITestListener{

	@Test
	public  void getStart(ITestResult result) {
		System.out.println("start");
		result.getName();
		
	}
	@Test
	public  void getPass(ITestResult result) {
		System.out.println("pass");
		result.getName();
		
	}
	@Test
	public  void getSkipped(ITestResult result) {
		System.out.println("skipped");
		result.getName();
		
	}
	@Test
	public  void getFail(ITestContext context) {
		System.out.println("fail");
		context.getName();
		
	}

	

	

	
	

}
