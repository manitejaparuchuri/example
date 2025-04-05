package testnglistners;

import org.testng.annotations.Test;

public class practice1 {
	
	@Test(priority = 1)
	public void test1() {
		System.out.println("testing 1st method");
	}
	
	@Test(priority = 2)
	public void test2() {
		System.out.println("testing 2nd method");
	}
	
	@Test(priority = 3)
	public void test3() {
		System.out.println("testing 3rd method");
	}
	

	@Test(priority = 4)
	public void test4() {
		System.out.println("testing 4th method");
	}
}
