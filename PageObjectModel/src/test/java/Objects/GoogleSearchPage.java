package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

	WebDriver driver;

	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	By searchbox = By.xpath("//textarea[@name='q']");
	By Facebook_link = By.xpath("//h3[text()='Facebook - log in or sign up']");

	public void searchGoogle(String Searchinput) {
		try {
		driver.findElement(searchbox).sendKeys(Searchinput);
		driver.findElement(searchbox).sendKeys(Keys.ENTER);
		}
		catch(Exception e) {
			System.out.println("We got exception with name: "+e.getMessage());
		}
	}

	public void clickFacebook() {
		try {
			Thread.sleep(3000);
			driver.findElement(Facebook_link).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("We got exception with name: " + e.getMessage());
		}
		

	}
}
