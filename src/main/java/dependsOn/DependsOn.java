package dependsOn;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DependsOn {
	
	
	@Test(dependsOnMethods = {"test2"})
	
	public  void test1() {
		System.out.println("functional testing");
		
		
	}
	@Test
	public  void test2() {
		System.out.println("Sanity");
	}}