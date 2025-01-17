package practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyNewTabTitle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E://chromedriver-win32//chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		System.out.println("Title of the first page:"+driver.getTitle());
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.open()");
		
		Set<String> windowHandles=driver.getWindowHandles();
		
		ArrayList<String> tabs=new ArrayList<>(windowHandles);
		
		driver.switchTo().window(tabs.get(1));
		
		driver.get("https://google.com");
		
		System.out.println("Title of new page: "+driver.getTitle());

		String exceptedTitle="Google";
		
		if(driver.getTitle().equals(exceptedTitle)) {
			System.out.println("Title Verification Passes");
		}
		else {
			System.out.println("Title verification failed!");
		}
		
	}

}
