package Popup_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Calanderpopup {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for=\"departure\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text()='September 2024']"+ "/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()=\"Return\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text()='October 2024']"+ "/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='25']")).click();
		

		

	}

}
