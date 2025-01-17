package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E://chromedriver-win32//chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement uploadElement=driver.findElement(By.id("Upload"));
		
		uploadElement.sendKeys("file path");
		
		driver.findElement(By.id("submit")).click();
		
	}

}
