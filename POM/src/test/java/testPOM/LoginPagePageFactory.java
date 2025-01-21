package testPOM;
import java.awt.print.PageFormat;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePageFactory {
	
	WebDriver driver;
	
	//constructors
	LoginPagePageFactory(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//locators
	/*
	 * By username=By.xpath("//input[@name=\"username\"]"); By
	 * password=By.xpath("//input[@type=\"password\"]"); By
	 * submit=By.xpath("//button[@type=\"submit\"]");
	 */
	
	//to store single web element another way
	@FindBy(how=How.XPATH, using="//input[@name='username']") WebElement username1;
	
	//to store single web element
	@FindBy(xpath="//input[@name='username']") WebElement username;
	@FindBy(xpath="//input[@type='password']") WebElement password;
	@FindBy(xpath="//button[@type='submit']") WebElement submit;
	
	//to store group of web elements
	@FindBy(tagName="a") List<WebElement> links;

	//Action methods
	public void setUserName(String user) {
		username.sendKeys(user);
	}
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
		
	}
	
	public void clickLogin() {
		submit.click();
	}
	
	
	
}
