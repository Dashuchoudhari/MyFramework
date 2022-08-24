package priority;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority = 1)
	public void method1() {
		System.out.println("I am inside the method 1");

	}
	@Test(priority = 2)
	public void method2() {
		System.out.println("I am inside the method 2");

	}
	@Test(priority = 0)
	public void method3() {
		System.out.println("I am inside the method 3");

	}
	@Test(priority =-1)
	public void method4() {
		System.out.println("I am inside the method 4");

	}

}
