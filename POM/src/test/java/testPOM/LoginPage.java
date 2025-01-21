package testPOM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	//constructors
	LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	
	//locators
	By username=By.xpath("//input[@name=\"username\"]");
	By password=By.xpath("//input[@type=\"password\"]");
	By submit=By.xpath("//button[@type=\"submit\"]");
	

	//Action methods
	public void setUserName(String user) {
		driver.findElement(username).sendKeys(user);
	}
	
	public void setPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
		
	}
	
	public void clickLogin() {
		driver.findElement(submit).click();
	}
	
	
	
}
