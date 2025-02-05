package DatadrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ddt_by_using_properties {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\SELENIUM\\PRACTICE\\src\\test\\resources\\Data.properties");
		
		Properties pro = new Properties();
		pro.load(fis);
		
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		
		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(USERNAME);
		driver.findElement(By.id("pass")).sendKeys(PASSWORD);
		
		
		
		
		

	}

}
