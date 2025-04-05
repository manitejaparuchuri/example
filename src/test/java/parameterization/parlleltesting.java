package parameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parlleltesting {
	
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	public void setup(String br) {
		switch (br) {
		case "chrome":driver=new ChromeDriver();break;
		case "edge": driver= new EdgeDriver();break;
		case "firefox" : driver= new FirefoxDriver();break;
		default:System.out.println("invalid browser");return;
			
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() {
		
		driver.get("https://vjwbilling.excellmedia.net/cms/login.php");
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("maniteja");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("excell4039");
		driver.findElement(By.xpath("//input[@name='sumbit']")).click();
		
	}

}
