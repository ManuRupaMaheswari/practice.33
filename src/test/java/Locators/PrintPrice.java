package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PrintPrice {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[text()='Fashion']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Footwear	']")).click();
		driver.findElement(By.xpath("Kids footwear")).click();

	}

}
