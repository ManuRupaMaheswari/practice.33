package synchronization;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class scrolling {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for(int i=0;i<5;i++) {
			js.executeScript("window.scrollBy(0,900)");
			Thread.sleep(1000);
		}
		for(int i=0;i<3;i++) {
			js.executeScript("window.scrollBy(0,-900)");
			Thread.sleep(1000);
		}
		
	}
}
