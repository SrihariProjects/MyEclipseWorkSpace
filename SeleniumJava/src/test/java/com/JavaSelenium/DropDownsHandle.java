package com.JavaSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownsHandle {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","E://chromedriver-win32//chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement newsSletter=driver.findElement(By.id("drop1"));
		
		Select newsSletterDropDown=new Select(newsSletter);
		newsSletterDropDown.selectByIndex(4);
		
		Thread.sleep(3000);
		newsSletterDropDown.selectByValue("def");
		
		Thread.sleep(3000);
		newsSletterDropDown.selectByVisibleText("doc 3");
		
		List<WebElement> NewsSletterOption = newsSletterDropDown.getOptions();
		
		
		for(WebElement values:NewsSletterOption) {
			System.out.println(values.getText());
		}
		
		WebElement SelectedText=newsSletterDropDown.getFirstSelectedOption();
		System.out.println("First Selected Text"+SelectedText.toString());
		
		
		
		
		
	}
}
