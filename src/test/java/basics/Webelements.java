package basics;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Webelements {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//clear
		driver.get("https://www.facebook.com/");
		//WebElement Textfield = driver.findElement(By.id("email"));
		//Textfield.sendKeys("biba");
		//Thread.sleep(1000);
		//Textfield.clear();
		
		//Textfield.submit();
		
		//getsize()
		/*WebElement data = driver.findElement(By.xpath("//a[text()='తెలుగు']"));
		Dimension value = data.getSize();
		System.out.println(value.getHeight()); 
		System.out.println(value.getWidth());*/
		
		//getloc()
		/*WebElement data = driver.findElement(By.xpath("//a[text()='తెలుగు']"));
		Point value = data.getLocation();
		System.out.println(value.getX()); 
		System.out.println(value.getY()); 
		System.out.println(value);*/
		
		//getrec()
		/*WebElement data = driver.findElement(By.xpath("//a[text()='తెలుగు']"));
		Rectangle value = data.getRect();
		System.out.println(value.getHeight());
		System.out.println(value.getWidth());
		System.out.println(value.getX());
		System.out.println(value.getY());
		System.out.println(value);*/
		
		//isdisplayed
		/*WebElement data = driver.findElement(By.xpath("//a[text()='తెలుగు']"));
		if(data.isDisplayed()) {
			System.out.println("telugu");
		}else {
			System.out.println("not in telugu");
		}*/
		
		//isenabled
		/*WebElement data = driver.findElement(By.id("email"));
		if(data.isEnabled()) {
			System.out.println("admin");
		}else {
			System.out.println("not enabled");
		}*/
		
		//isselected
		/*WebElement data = driver.findElement(By.name("login"));
		data.click();
		if(data.isSelected()) {
			System.out.println("selected");
		}else {
			System.out.println("not selected");
		}*/
		
		//cssvalue
		/*WebElement data = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		String value = data.getCssValue("color");
		System.out.println(value);*/
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\screenshots\\flipkart.png");
		FileUtils.copyFile(src, dest);
	
		
		
		//tagname
		/*WebElement data = driver.findElement(By.id("email"));
		String value = data.getTagName();
		System.out.println(value);*/
		
		//accessiblename
		/*WebElement data = driver.findElement(By.id("email"));
		String value = data.getAccessibleName();
		System.out.println(value);*/
		
		//arialrole
		/*WebElement data = driver.findElement(By.id("email"));
		String value = data.getAriaRole();
		System.out.println(value);*/
		
		//getattribute
		/*WebElement data = driver.findElement(By.id("email"));
		String value = data.getAttribute("id");
		System.out.println("attribute name :"+ value);*/
		
		//getdomattribute
		/*WebElement data = driver.findElement(By.id("email"));
		String value = data.getDomAttribute("id");
		System.out.println(value);*/
		
		//getdomproperty
		/*WebElement data = driver.findElement(By.id("email"));
		String value = data.getDomProperty("id");
		System.out.println(value);*/
		
		
		//driver.close();
		
		//screenshot
		/*TakesScreenshot ts = (TakesScreenshot)driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\screenshots\\facebook.png");
		FileUtils.copyFile(scr, dest);*/
		
		
	
		
	
		
	}

}
