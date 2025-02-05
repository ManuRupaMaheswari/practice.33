package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class x_path {

	public static void main(String[] args) {
		//WebDriver driver = new EdgeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		/*//xpath by attribute
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("admin");
		
		//xpath contains attribute
		driver.findElement(By.xpath("//input[contains(@placeholder,\"Password\")]")).sendKeys("admin");
		
		//xpath by visibiletext
		//driver.findElement(By.xpath("//button[text()='Log in']")).click();
		  
		 
		//xpath contains visibletext
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();*/
		
		
		//xpath using multiple attribute on single xpath
		//driver.findElement(By.xpath("//input[@name=\"email\" and @id=\"email\"]")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@name=\"pass\" or @id=\"pass\"]")).sendKeys("admin");
		
		//xpath by using textfunction
		//driver.findElement(By.xpath("//button[text()='Log in']")).click();
		//driver.findElement(By.xpath("//button[.='Log in']")).click();
		
		
		//xpath with text()function using multiple attributes
		//driver.findElement(By.xpath("//button[@name=\"login\" and text()='Log in']")).click();
		
		//xpath to handle partial dynamic elements(we use contains method)
		//driver.findElement(By.xpath("//button[contains(text(),\"Log in\")]")).click();
		//driver.findElement(By.xpath("//button[contains(.,\"Log in\")]")).click();
		
		

	}

}
