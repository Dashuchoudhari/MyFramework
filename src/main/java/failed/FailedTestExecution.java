package failed;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestExecution {

	@Test
	public  void test1() {
		System.out.println("start");
		
		
	}
	@Test
	public  void test2() {
		System.out.println("this is sencond method");
		//int i=1/0;
		
	}
	@Test(retryAnalyzer=failed.RetryAnalyzer.class)
	public  void test3() {
		System.out.println("this is sencond 3rd");
		Assert.assertTrue(0>1);
		
	}
	@Test
	public  void test4() {
		System.out.println("this is sencond 4th");
		
		
	}
}
