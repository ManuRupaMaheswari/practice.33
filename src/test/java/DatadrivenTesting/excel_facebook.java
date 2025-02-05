package DatadrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class excel_facebook {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FileInputStream fis  =new FileInputStream(".\\src\\test\\resources\\facebook.excelsheeet.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		
		String url = book.getSheet("facebook").getRow(0).getCell(0).getStringCellValue();
		driver.get(url);
		String username = book.getSheet("facebook").getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.id("email")).sendKeys(username);
		String password = book.getSheet("facebook").getRow(0).getCell(2).getStringCellValue();
		 driver.findElement(By.id("pass")).sendKeys(password);
		
		
		
		
	}

}
