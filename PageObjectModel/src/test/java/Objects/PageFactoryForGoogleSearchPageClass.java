package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryForGoogleSearchPageClass {
	WebDriver driver;

	public PageFactoryForGoogleSearchPageClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//We can declare using @Find BY class
	@FindBy(xpath="//textarea[@name='q']") public WebElement searchbox;
	@FindBy(xpath="//h3[text()='Facebook - log in or sign up") public WebElement Facebook_link;

	public void searchGoogle(String Searchinput) {
		searchbox.sendKeys(Searchinput);
		Facebook_link.click();
		
	}
}