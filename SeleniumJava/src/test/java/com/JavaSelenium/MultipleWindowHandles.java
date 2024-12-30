package com.JavaSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandles {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E://chromedriver-win32//chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);


		//Single Window
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println("Parent Window Handle:"+parentWindowHandle+driver.getTitle());

		WebElement newWindowDD=driver.findElement(By.id("newWindowBtn"));

		CommonMethods.clickElementUsingJS(driver, newWindowDD);
		Set<String> windowHandles=driver.getWindowHandles();
		for(String windowhandle : windowHandles) {
			driver.switchTo().window(windowhandle);
			if(!windowhandle.equals(parentWindowHandle)) {
				driver.switchTo().window(windowhandle);
				driver.manage().window().maximize();
				Thread.sleep(3000);
				driver.findElement(By.id("firstName")).sendKeys("Srihari");
				Thread.sleep(3000);
				driver.close();
			}


			//			System.out.println(windowhandle +driver.getTitle());
		}
		driver.switchTo().window(parentWindowHandle);
		Thread.sleep(3000);

		//Handling Tabs

		WebElement openTabs=driver.findElement(By.id("newTabBtn"));
		CommonMethods.clickElementUsingJS(driver, openTabs);

		Set<String> TabWindows=driver.getWindowHandles();
		for(String tabWindowValues:TabWindows) {

			if(!tabWindowValues.equals(parentWindowHandle)) {
				driver.switchTo().window(tabWindowValues);
				driver.findElement(By.id("alertBox")).click();
				driver.switchTo().alert().accept();
				driver.close();
			}
		}

		//		driver.quit();

	}

}
