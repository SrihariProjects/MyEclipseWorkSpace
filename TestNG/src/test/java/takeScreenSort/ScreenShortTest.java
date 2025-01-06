package takeScreenSort;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScreenShortTest {

	public static void main(String[] args) throws Exception {

		// System.setProperty("webdriver.chrome.driver", "C:/path/to/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "E://chromedriver-win32//chromedriver.exe/");
		// WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		
		Utils.CaptureScreenshot(driver, "Img.png");
	}
}
