package Popup_Handling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Windowpopup {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[.=\"Open New Seperate Windows\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		Thread.sleep(1000);
		Set<String> set = driver.getWindowHandles();
		for(String string:set) {
			driver.switchTo().window(string);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("selenium")) {
				break;
			}
			
		}

	}

}
