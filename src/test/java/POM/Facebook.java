package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {

	public static void main(String[] args) {
	
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		LOGIN_PAGE login = new LOGIN_PAGE(driver);
		
		login.emailtextfield("admin");
		login.passwordtextfield("admin");
		login.login();
		
		
		
		
		

	}

}
