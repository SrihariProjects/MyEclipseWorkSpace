package Test_Scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.FacebookPage;
import Objects.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_GoogleSearch {
	WebDriver driver;
	GoogleSearchPage objectrepo;
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
	}
	
	@Test(priority = 1)
	public void SearchOperation()  {
		GoogleSearchPage page=new GoogleSearchPage(driver);
		page.searchGoogle("facebook");
	}
	
	@Test(priority = 2)
	public void verifyandAccessFacebook() {
		objectrepo =new GoogleSearchPage(driver);
		objectrepo.clickFacebook();
	}
	
	@Test(priority = 3)
	public void verifyLogin() throws Exception {
		FacebookPage page=new FacebookPage(driver);
		page.EnterUsername();
		page.EnterPassword();
		page.verifyLogin();
		
	}
	
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
}
