package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(1000);
		WebElement daylist = driver.findElement(By.id("day"));
		Select sel = new Select(daylist);
		sel.selectByIndex(10);
		
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.id("month"));
		Select sele = new Select(month);
		sele.selectByValue("3");
		
		Thread.sleep(1000);
		WebElement year = driver.findElement(By.id("year"));
		Select select = new Select(year);
		select.selectByVisibleText("2021");
		
		
		
		
		
		
		
		

	}

}
