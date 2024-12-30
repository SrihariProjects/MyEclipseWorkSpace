package Objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookPage {
	WebDriver driver;

	public FacebookPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By username_editbox = By.id("email");
	By password_editbox = By.id("pass");
	By Login_Btn = By.name("login");
	
	public void EnterUsername() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(username_editbox).sendKeys("Testuser");
		
	}
	
	public void EnterPassword() {
		driver.findElement(password_editbox).sendKeys("Tester123");
	}
	
	public void verifyLogin() {
		driver.findElement(Login_Btn).click();
		String title=driver.getTitle();
		assertEquals(title, "Log in to Facebook");
	}
}
