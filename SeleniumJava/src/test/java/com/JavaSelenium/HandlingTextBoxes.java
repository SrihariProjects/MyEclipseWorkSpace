package com.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTextBoxes {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E://chromedriver-win32//chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.switchTo().frame("navbar-iframe");
		WebElement textBox=driver.findElement(By.id("b-query"));
		
		if(textBox.isDisplayed()) {
			System.out.println("Element is present");
			
			if(textBox.isEnabled()) {
				textBox.sendKeys("Hii");
				String enteredText=textBox.getAttribute("value");
				System.out.println("Entered Text is"+enteredText);
				Thread.sleep(3000);
				textBox.clear();
				System.out.println("The text is cleared");
			}
			
		}
		else {
			System.out.println("Web Element is not Present");
		}
		
		driver.switchTo().defaultContent();
	}

}
