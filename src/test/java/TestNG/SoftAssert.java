package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert {
	@Test
	public void assertions() {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		SoftAssert s = new SoftAssert();
		Assert.assertEquals(title, "abcdefgh");
		Assert.fail();
		System.out.println(driver.getCurrentUrl());
		

	}
	
	
	

}
