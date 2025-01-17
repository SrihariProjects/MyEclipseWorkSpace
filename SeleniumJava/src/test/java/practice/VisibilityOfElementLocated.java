package practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisibilityOfElementLocated {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://chromedriver-win32//chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		
		try {
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		By dynamiclocator=By.id("username");
		
		WebElement dynamicEle=wait.until(ExpectedConditions.visibilityOfElementLocated(dynamiclocator));
		
		System.out.println("Element text: "+dynamicEle.getText());
		
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
