package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dependency {

	//WebDriver driver = new ChromeDriver();
	
	@Test(priority = 0)
	public void openpage() {
	
		
		Assert.assertTrue(true);
	}
	@AfterTest
	public void logout() {
		System.out.println("after test");
	}
	
	@Test(priority = 1,dependsOnMethods = {"openpage"})
	public void login() {
	
		
		Assert.assertTrue(false);
	
	}
	@Test(priority = 2, dependsOnMethods = {"login","openpage"})
	public void usagereport() {
		System.out.println("priority2");
		
	}
	
}
