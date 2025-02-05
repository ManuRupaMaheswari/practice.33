package basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Browsernative {

	public static void main(String[] args) {
		 EdgeOptions options = new EdgeOptions();
		 options.addArguments("InPrivate");
		 
		 WebDriver driver = new EdgeDriver(options);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.myntra.com/");
		 
		 

	}

}
