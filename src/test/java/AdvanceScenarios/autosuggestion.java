package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class autosuggestion {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("bluetooth",Keys.ENTER);
		
		Thread.sleep(1000);
		List<WebElement> alllinks = driver.findElements(By.xpath("span"));
		for(WebElement wb:alllinks) {
			if(wb.getText().contains("bluetooth earphones")) {
				System.out.println(wb.getText());
				wb.click();
				break;
			}
		}
		//driver.findElement(By.xpath("//div[@aria-label=\"bluetooth earbuds\"]")).click();
		 /*List<WebElement> suggestions = driver.findElements(By.xpath("(//div[@class=\"s-suggestion s-suggestion-ellipsis-direction\"])[5]"));
		
		for(WebElement wb:suggestions) {
			String text = wb.getText();
			if(text.contains(" earphones boat")) {
				wb.click();
				break;
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}*/

	}

}
