package com.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningBrowsers {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "E://chromedriver-win32//chromedriver.exe/");
		// WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
//		driver.quit();
		Thread.sleep(5000);
		CommonMethods.highlight(driver, driver.findElement(By.id("login_field")));
		Thread.sleep(3000);
		driver.findElement(By.id("login_field"));
//		driver.findElement(By.xpath("(//a[contains(text(),'Sign in')and @href='/login'])[1]")).click();
		
	}
	


}
