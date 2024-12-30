package com.JavaSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E://chromedriver-win32//chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement newsSletter=driver.findElement(By.id("multiselect1"));
		
		Select MultiDropDown=new Select(newsSletter);
		List<WebElement> MultiSelectDDValues=MultiDropDown.getOptions();
		for(WebElement values:MultiSelectDDValues) {
			System.out.println(values.getText().toString());
		}
		MultiDropDown.selectByIndex(1);
		MultiDropDown.selectByValue("swiftx");
		MultiDropDown.selectByVisibleText("Audi");
		
		List<WebElement> OnlySelectedValues=MultiDropDown.getAllSelectedOptions();
		for(WebElement values:OnlySelectedValues) {
			System.out.println(values.getText().toString());
		}
		
	}

}
