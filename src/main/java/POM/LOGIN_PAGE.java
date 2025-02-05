package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOGIN_PAGE {
	//declaration
	@FindBy(id="email")
	private WebElement emailTF;
	
	@FindBy(id="pass")
	private WebElement passwordTF;
	
	@FindBy(name="login")
	private WebElement loginButton;
	
	//initialization
	public LOGIN_PAGE(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	//utilization
	
	public void emailtextfield(String value) {
		emailTF.sendKeys(value);
	}
	
	public void passwordtextfield(String value) {
		passwordTF.sendKeys(value);
	}
	
	public void login() {
		loginButton.click();
	}
	

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//bussiness logic
	public void login(String USERNAME , String PASSWORD) {
		emailTF.sendKeys(USERNAME);
		passwordTF.sendKeys(PASSWORD);
		loginButton.click();
		
	}
	
	
	
	
	
	

}
