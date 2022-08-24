package dependsOn;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore   //   if we provide ignore at class level the no test will executed
public class Ignore1 {
	
	@Ignore
	@Test
	public  void test1() {
		System.out.println("functional testing");


	}
	@Test
	public  void test2() {
		System.out.println("Sanity");
	}
}
