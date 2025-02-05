package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class autosug {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.in/");
		WebElement search = driver.findElement(By.name("q"));
		Thread.sleep(1000);
		search.sendKeys("selenium",Keys.ENTER);
		
		
		driver.findElement(By.xpath("//span[text()='selenium testing']")).click();

	}

}
