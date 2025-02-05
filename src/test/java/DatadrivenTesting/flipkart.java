package DatadrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class flipkart {
	
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement brand = driver.findElement(By.name("q"));
		brand.sendKeys("biba");
		brand.submit();
		
		
	}

}
