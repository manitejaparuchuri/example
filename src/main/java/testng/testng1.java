package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testng1 {

	@Test(priority = 1)
	void test1() {
		System.out.println("maniteja");
	}
	
	@Test(priority = 2)
	void test2() {
		System.out.println("paruchuri");
	}

}
