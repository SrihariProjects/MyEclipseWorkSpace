package com.JavaSelenium;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLOadTime {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E://chromedriver-win32//chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS); //This is the max time to load a page
		//default time is 300seconds
		//we can't provde negative value it throws exception
		
		Instant startTime = Instant.now();
		System.out.println(startTime.toString());
		
		
		System.out.println(driver.getTitle());
		
		Instant endTime =Instant.now();
		System.out.println(endTime.toString());
		
		Duration duration=Duration.between(startTime, endTime);
		System.out.println("pageLoad time: "+duration.toMillis());
		
		driver.quit();
		
		
	}

}
