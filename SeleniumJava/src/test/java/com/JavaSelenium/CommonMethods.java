package com.JavaSelenium;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonMethods {

	public static void highlight(WebDriver driver, WebElement element) {
	    // Cast the WebDriver instance to JavascriptExecutor
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    // Use JavaScript to set a red border and yellow background to highlight the element
	    js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red; background: yellow;');", element);
	}
	
	public static void clickElementUsingJS(WebDriver driver, WebElement element) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    // Execute JavaScript to click the element
	    js.executeScript("arguments[0].click();", element);
	}

	
	public static void scrollToElement(WebDriver driver, WebElement element) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    // Scroll the page to bring the element into view
	    js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public static void scrollByAmount(WebDriver driver, int x, int y) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    // Scroll the page by the specified amount (x, y)
	    js.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
	}
	public static void selectDate(WebDriver driver, String date) throws Exception {
        // Initialize a Calendar instance to handle date operations
        Calendar calendar = Calendar.getInstance();

        try {
            // Define the expected date format
            SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd/MMM/yyyy");
            // Set lenient mode to false to validate the input date strictly
            targetDateFormat.setLenient(false);
            // Parse the input date string into a Date object
            Date formattedTargetDate = targetDateFormat.parse(date);
            // Set the parsed date in the Calendar object
            calendar.setTime(formattedTargetDate);
        } catch (Exception e) {
            // Throw an exception if the input date is invalid
            throw new Exception("Invalid date is provided, please check the input date!!");
        }

        // Extract the target date components
        int targetMonth = calendar.get(Calendar.MONTH); // Target month (0-based, January = 0)
        int targetYear = calendar.get(Calendar.YEAR);   // Target year
        int targetDay = calendar.get(Calendar.DAY_OF_MONTH); // Target day of the month

        // Get the currently displayed month and year from the date picker
        String currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
        // Parse the current month and year from the date picker title
        calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));
        int currentMonth = calendar.get(Calendar.MONTH); // Current month
        int currentYear = calendar.get(Calendar.YEAR);   // Current year

        // Navigate to the target month and year (forward)
        while (currentMonth < targetMonth || currentYear < targetYear) {
            // Click the "Next" button on the date picker
            driver.findElement(By.className("ui-datepicker-next")).click();
            // Update the current month and year after navigating
            currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
            calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));
            currentMonth = calendar.get(Calendar.MONTH);
            currentYear = calendar.get(Calendar.YEAR);
        }

        // Navigate to the target month and year (backward)
        while (currentMonth > targetMonth || currentYear > targetYear) {
            // Click the "Previous" button on the date picker
            driver.findElement(By.className("ui-datepicker-prev")).click();
            // Update the current month and year after navigating
            currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
            calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));
            currentMonth = calendar.get(Calendar.MONTH);
            currentYear = calendar.get(Calendar.YEAR);
        }

        // Select the target day if the target month and year match the current ones
        if (currentMonth == targetMonth && currentYear == targetYear) {
            // Use XPath to locate and click the day cell in the date picker table
            driver.findElement(By.xpath(
                    "//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="
                            + targetDay + "]"))
                    .click();
        } else {
            // Throw an exception if the target date cannot be selected
            throw new Exception("Unable to select the date because of current and target dates mismatch");
        }
    }
	
}
