package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class beforemethod {

	WebDriver driver=new ChromeDriver();
	
	@BeforeMethod		
	void login() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		Thread.sleep(1000);
				
		}
	
	@AfterMethod
	void logout() {
		driver.findElement(By.xpath("//a[normalize-space()='Contact us']")).click();
	}
	
	@Test(priority = 1)
	void id() throws InterruptedException {
		Thread.sleep(3000);
	boolean	logo =driver.findElement(By.xpath("//div[@class='logo pull-left']")).isDisplayed();
		Thread.sleep(1000);
		System.out.println(logo);
	}
	
	@Test(priority = 2)
	void id1() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		Thread.sleep(1000);
		
	}
	
	
}
