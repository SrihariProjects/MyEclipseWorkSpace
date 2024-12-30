package com.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesConsept {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E://chromedriver-win32//chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("name")).sendKeys("This is parent Frame page");
		driver.switchTo().frame("frm1");
		WebElement dropDownValXpath=driver.findElement(By.id("selectnav1"));
		Select dropdown=new Select(dropDownValXpath);
		dropdown.selectByIndex(2);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("name")).sendKeys("Back to parent Frame page");

		
		driver.quit();
		
	}

}
