package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Autosugg {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		 driver.findElement(By.name("q")).sendKeys("bluetooth",Keys.ENTER);
		 Thread.sleep(1000);
		 
		  List<WebElement> Links = driver.findElements(By.tagName("li"));
		  for(WebElement wb:Links) {
			 if(wb.getText().contains("bluetooth headset")) { 
				 System.out.println(wb.getText());
				 wb.click();
				 break;
			 }
			  
			  
		  }
		 
	}

}
