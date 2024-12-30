package com.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsCheckBoxes {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","E://chromedriver-win32//chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		CommonMethods.scrollByAmount(driver,0,500);
		
		
		//handling radio buttons
		driver.findElement(By.id("radio1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("radio2")).click();
		Thread.sleep(3000);
		WebElement femaleCheckBox=driver.findElement(By.name("radio1"));
		
		femaleCheckBox.click();
		
		Thread.sleep(3000);
		if(femaleCheckBox.isSelected()) {
			femaleCheckBox.click();
			Thread.sleep(5000);
		}
//		
		//handling checkboxes
		WebElement bluCheckBox=driver.findElement(By.id("checkbox1"));
		bluCheckBox.click();
		if(bluCheckBox.isEnabled()) {
			System.out.println("Checkbox is selected");
		}
		
		
	}

}
