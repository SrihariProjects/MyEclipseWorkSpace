package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicTest {

	@Test(dataProvider = "loginTestData")
	public void TestLogin(String userName, String passWord) throws Exception {

		System.setProperty("webdriver.chrome.driver", "E://chromedriver-win32//chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(passWord);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}


	@DataProvider(name="loginTestData",parallel = true)
	public Object[][] loginData() {
		Object[][] data = new Object[2][2];

		data[0][0] = "Admin";
		data[0][1] = "admin123";

		data[1][0] = "Admin";
		data[1][1] = "Admin123";
		
//		data[2][0] = "Admin";
//		data[2][1] = "admin123";
//
//		data[3][0] = "Admin";
//		data[3][1] = "Admin123";

		return data;
	}

}
