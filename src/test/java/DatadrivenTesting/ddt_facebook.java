package DatadrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ddt_facebook {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\data.properties1");
		 Properties pro = new Properties();
		 pro.load(fis);
		 
		 String url = pro.getProperty("url");
		 String username = pro.getProperty("username");
		 String property = pro.getProperty("password");
		 
		 driver.get(url);
		 driver.findElement(By.id("email")).sendKeys(username);
		 driver.findElement(By.id("pass")).sendKeys(property);
		 

	}

}
