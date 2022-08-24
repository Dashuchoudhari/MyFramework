package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class SetParameters {
	
	@Test
	@Parameters({"MyName"})
	public  void test1(String Name) {
		System.out.println("Name is"+Name);
		
		
	}
	/*@Test(groups =  {"sanaty","smoke"})
	public  void test2() {
		System.out.println("this is sencond method");
		
		
	}
	@Test(groups =  {"sanaty","regrassion"})
	public  void test3() {
		System.out.println("this is sencond 3rd");
		
		
	}
	@Test
	public  void test4() {
		System.out.println("this is sencond 4th");
		
		
	}*/

}
