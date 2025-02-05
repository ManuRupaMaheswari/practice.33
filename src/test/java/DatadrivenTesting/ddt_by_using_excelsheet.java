package DatadrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ddt_by_using_excelsheet {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties");
		
		Properties pro = new Properties();
		pro.load(fis);
		
		String URL = pro.getProperty("url");
		driver.get(URL);
		//driver.findElement(By.xpath("//button[text()='✕']")).click();
		//fetching data from excel sheet
		FileInputStream fes = new FileInputStream("C:\\Users\\User\\Desktop\\SELENIUM\\PRACTICE\\src\\test\\resources\\data.properties.xlsx");
		
		Workbook book = WorkbookFactory.create(fes);
		
		Sheet sheet = book.getSheet("FLIPKART");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String exceldata = cell.getStringCellValue();
		WebElement brand = driver.findElement(By.name("q"));
		brand.sendKeys(exceldata);
		brand.submit();
		
		
		

	}

}
