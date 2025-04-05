package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class before_after_class  {

	WebDriver driver;
	  @BeforeTest
	  public void login() throws Exception {
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		  Thread.sleep(2000);
		  
	  }
	  @AfterTest
	  void logout() {
		  driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		  driver.findElement(By.xpath("//a[normalize-space()='Logout']	")).click();
}
	  @Test(priority = 1)
	  void admin() {
		  driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();
	  }
	  
	  //@Test(priority = 1)
	  void time() throws Exception {
		  driver.findElement(By.xpath("//span[normalize-space()='Time']")).click();
		  Thread.sleep(1000);
	  }
	  //@Test(priority = 2)
	  void leave() {
		  driver.findElement(By.xpath("//span[normalize-space()='Leave']")).click();
	  }
	  @Test(priority = 2)
	  void dashboard() {
		  driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).click();
	  }
	  
}
