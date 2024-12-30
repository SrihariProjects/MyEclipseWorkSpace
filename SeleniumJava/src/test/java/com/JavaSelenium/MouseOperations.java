package com.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperations {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E://chromedriver-win32//chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		Actions actions=new Actions(driver);
		
		//moving the element
		actions
		.moveToElement(driver.findElement(By.xpath("//span[text()='Admin']"))).perform();
		
		actions.doubleClick(driver.findElement(By.xpath("//span[text()='My Info']"))).perform();
		
		actions.contextClick().perform();//this will perform right click
		
		
		
		
		
	}

}
