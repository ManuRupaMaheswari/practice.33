package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicLocators {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//id
		/*driver.findElement(By.id("email")).sendKeys("admin");
		//name
		driver.findElement(By.name("pass")).sendKeys("password");
		//driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
		//linktext
		//driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.partialLinkText("Log")).click();*/
		
		//classname
		/*driver.get("https://www.flipkart.com/");
	    driver.findElement(By.className("_1Us3XD")).click();*/
	    
		//css selector
		//driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("admin");
		//driver.findElement(By.cssSelector("input[id=\"pass\"]")).sendKeys("admin");
		
		

	}

}
