package com.JavaSelenium;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestngCalendar {

    public static void main(String[] args) throws Throwable {
        // Set up WebDriver and launch the application
        System.setProperty("webdriver.chrome.driver", "E://chromedriver-win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        // Select a specific date
        int day = 15;

        // Scroll down the page to bring the calendar into view (custom method assumed)
        CommonMethods.scrollByAmount(driver, 0, 300);

        // Open the calendar
        driver.findElement(By.xpath("//img[@title='Calendar-icon']")).click();
        Thread.sleep(2000);

        // Select the date directly
        driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()=" + day + "]")).click();

        // Alternatively, use the selectDate method to handle dynamic dates
        driver.findElement(By.id("first_date_picker")).click();
        CommonMethods.selectDate(driver, "15/Dec/2024"); // Example date
    }

    
}
