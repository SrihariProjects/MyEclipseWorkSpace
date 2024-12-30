package com.JavaSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//JavaScriptExecutor is inteface
//to perform operation on javascript code of Webpages
public class TestingJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E://chromedriver-win32//chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		//TypeCasting the driver to JavascriptExecutor
		JavascriptExecutor jsexecutor=(JavascriptExecutor) driver;
//		WebElement element=(WebElement)jsexecutor.executeScript("return document.getElementById('email')");
//		element.sendKeys("Srihari");
		WebElement cssElement=(WebElement)jsexecutor.executeScript("return document.querySelector('#email')");
		cssElement.sendKeys("id");
//
//		WebElement xpathSelector=(WebElement)jsexecutor.executeScript("document.evaluate(\"//div[@class='uiContextualLayerParent']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue");
////		sending values using JavaScript Executor
//		jsexecutor.executeScript("document.querySelector('#email').value='sri'");
		
//		jsexecutor.executeScript("document.evaluate(\"//button[@name='login']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click;");
		
		//to click element using javascript executor
//		jsexecutor.executeScript("document.getElementByName('login')[0].click()");
	
	}

}
