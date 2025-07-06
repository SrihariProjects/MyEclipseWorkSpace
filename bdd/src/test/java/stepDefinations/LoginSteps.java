package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginSteps {

	
	WebDriver driver;
	@Given("User launches the browser")
	public void user_launches_the_browser() {
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("www.google.com");
	}
	
	@When("User enters username {string} and password {string}")
	public void user_enters_username_password(String username, String password) {
		driver.findElement(By.name("username"));
		driver.findElement(By.name("password"));
		driver.findElement(By.id("button")).click();
	}
	
	@Then("User should be logged in successfully")
	public void user_should_be_logged_in() {
		boolean isDashboardvisible = driver.getPageSource().contains("Dashboard");
		assert isDashboardvisible :"Login failed!";
	}
	public WebDriver getDriver() {
		return driver;
	}
}
