package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class handling_multipleElements_amazon {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		int count=0;
		for(WebElement wb:allLinks) {
			System.out.println(wb.getText());
			count++;
		}
		System.out.println("total no of links:"+count);

	

	}

}
