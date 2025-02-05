package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ddt_pom_fb {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties");
		Properties pro = new Properties();
		pro.load(fis);
		
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		
		driver.get(URL);
		/*LOGIN_PAGE login = new LOGIN_PAGE(driver);
		login.emailtextfield(USERNAME);
		login.passwordtextfield(PASSWORD);
		login.login();*/
		
		LOGIN_PAGE login = new LOGIN_PAGE(driver);
		login.login(USERNAME, PASSWORD);
		
	}

}
