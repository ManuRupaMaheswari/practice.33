package synchronization;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sync_handlings {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//java wait
		//Thread.sleep(1000);
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//explicit wait
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		//wait.until(ExceptedConditions.ecmethods);
		
		//fluent wait
		//FluentWait wait = new FluentWait(driver);
		//wait.pollingEvery(Duration.ofSeconds(10));
		//wait.until(exceptedconditions.ec method);
		
		
		
		
		
		
			
		}
		
		
		
		

	}


