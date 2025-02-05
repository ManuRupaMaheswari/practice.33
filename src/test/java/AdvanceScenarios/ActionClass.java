package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.flipkart.com/");
		WebElement data = driver.findElement(By.xpath("//span[text()='Beauty, Toys & More']"));
		//movetoelement,perform
		 
		Actions act = new Actions(driver);
		act.moveToElement(data).perform();
		
		//context click,double click
		 
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//WebElement data = driver.findElement(By.xpath("//span[.='right click me']"));
		Actions act = new Actions(driver);
		//act.contextClick(data).perform();
		
		WebElement data = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		act.doubleClick(data).perform();
		//drag and drop
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();*/
		
		/*driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.name("login"));
		Actions act = new Actions(driver);
		//act.sendKeys(username,"admin").perform();
		//act.sendKeys(password,"admin").perform();
		act.sendKeys(username,"admin").sendKeys(password,"admmin").sendKeys(login).build().perform();*/
		driver.get("https://www.flipkart.com/");
		WebElement data = driver.findElement(By.xpath("//span[text()=\"Beauty, Toys & More\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(data).perform();
		

	}

}
