package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium_webdriver {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		/*String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		String TITLE = driver.getTitle();
		System.out.println(TITLE);
		
		String Sourcecode = driver.getPageSource();
		System.out.println(Sourcecode);*/
		
		driver.navigate().to("https://www.amazon.jobs/");
		//driver.navigate().forward();
		driver.navigate().back();
		//driver.navigate().refresh();
		//driver.close();
		//driver.quit();
		
		

	}

}
