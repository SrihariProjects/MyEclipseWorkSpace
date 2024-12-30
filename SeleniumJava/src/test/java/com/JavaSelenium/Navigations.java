package com.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E://chromedriver-win32//chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement newPage=driver.findElement(By.xpath("//a[text()='Page One']"));
		Thread.sleep(3000);
		driver.navigate().to("https://facecheck.id/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
		
		
	}

}
