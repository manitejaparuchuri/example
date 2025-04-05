package grouping;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice99 {

	
	// this is the testcase used to ge the report for the by hand bills with address and phone numbers and amount
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String xlpath ="C:\\Users\\hp\\Desktop\\bills.xlsx";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://maniteja:excell4039@vjwbilling.excellmedia.net");
		FileInputStream fis = new FileInputStream(xlpath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet =workbook.getSheet("sheet1");		//workbook.getSheetAt(0);  (this also we can use sheet number as parameter
		int rowcount = sheet.getLastRowNum();
		for (int i=1;i<rowcount;i++) {
			XSSFRow currow = sheet.getRow(i);
			String value1 = currow.getCell(0).toString();
             
             if (value1 != null) {
                // String cellValue = value1.toString();
                 //int Value = (int) Double.parseDouble(cellValue);
                 String cleanedValue = value1.replace(".0", "");
                 System.out.println(cleanedValue);
                 driver.findElement(By.name("search_cust")).sendKeys(cleanedValue);
                 driver.findElement(By.xpath("//input[@value='Search customers']")).click();
                 Thread.sleep(2000);
                String address= driver.findElement(By.xpath("//body[1]/table[3]/tbody[1]/tr[1]/td[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[4]/td[2]")).getText();
                System.out.println(address);
                String phone1 =driver.findElement(By.xpath("//body[1]/table[3]/tbody[1]/tr[1]/td[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[9]/td[2]")).getText();
                System.out.println(phone1);
                String phone2 = driver.findElement(By.xpath("//body[1]/table[3]/tbody[1]/tr[1]/td[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[10]/td[2]")).getText();
                System.out.println(phone2);
                String amount = driver.findElement(By.xpath("//body[1]/table[3]/tbody[1]/tr[1]/td[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]")).getText();
                String finalamount = amount.replace("Rs.", "");
                System.out.println(finalamount);
                currow.createCell(3).setCellValue(address);
                currow.createCell(4).setCellValue(phone1);
                if(phone2!=null) {
                	currow.createCell(5).setCellValue(phone2);
                }
                else {
                	currow.createCell(5).setCellValue("empty");
                }
                
                currow.createCell(6).setCellValue(finalamount);
                
                 FileOutputStream fos = new FileOutputStream(xlpath);
                 workbook.write(fos);
                 Thread.sleep(3000);
             }
		 }

	}


	}


