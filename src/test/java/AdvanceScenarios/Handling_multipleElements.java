package AdvanceScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Handling_multipleElements {

	public static void main(String[] args) {
		/*WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		 List<WebElement> Alllinks = driver.findElements(By.xpath("//a"));
		 
		 int count=0;
		 for(WebElement wb:Alllinks) {
			 System.out.println(wb.getText());
			 count++;
			 
		 }
		 System.out.println("total no of links:"+count);*/
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		int count=0;
		for(WebElement wb: alllinks) {
			System.out.println(wb.getText());
			count++;
		}
		System.out.println("total no of links:"+count);
		
	}
}       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

          
		