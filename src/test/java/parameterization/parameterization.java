package parameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parameterization {
	
	WebDriver driver;
	
		@BeforeClass
		void setup() {
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider = "teja")
	public void testlogin(String email,String password) throws Exception {
		driver.get("https://vjwbilling.excellmedia.net/cms/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='sumbit']")).click();
		Thread.sleep(2000);
//	Boolean	logo=	driver.findElement(By.xpath("//a[normalize-space()='M Maniteja']")).isDisplayed();
//	if(logo==true) {
//		System.out.println("logo displayed");
//		Assert.assertTrue(true);
//	}
//	else {
//		System.out.println("login faild");
//		//Assert.assertTrue(false);
	//}
	
	}
	@DataProvider(name ="teja", indices = {0,1})//here incdices means i want to execute only 1st 2 testdata so program will run for 2 times only
	
	public Object[][] dataprovider() {
		
	Object	data[][]= {
				{"maniteja", "123456"},
				{"teja", "excell"},
				{"maniteja","456789"}
				
		};
	return data;
		
	}
}
