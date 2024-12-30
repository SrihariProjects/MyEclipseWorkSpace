package com.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Alert Box
//Confirm Box
//Prompt Box

public class Alerts {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E://chromedriver-win32//chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// Alert Box
		driver.findElement(By.id("alert1")).click();
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();

		// Confirm Box
		driver.findElement(By.id("prompt")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.id("prompt")).click();
		driver.switchTo().alert().dismiss();

		// Prompt Box
		driver.findElement(By.id("prompt")).click();
		driver.switchTo().alert().sendKeys("Srihari");
		driver.switchTo().alert().accept();
		System.out.println("Accepted");

	}

}
