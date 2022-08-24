package groupingInTestNg;


import org.apache.http.client.params.AllClientPNames;
import org.testng.annotations.Test;


//@Test(groups = {"AllClassTests"})   it is runn all tests
public class GroupingDemo1 {
	
	@Test(groups = {"sanaty"})
	public  void test1() {
		System.out.println("start");
		
		
	}
	@Test(groups =  {"sanaty","smoke"})
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
		
		
	}

}
