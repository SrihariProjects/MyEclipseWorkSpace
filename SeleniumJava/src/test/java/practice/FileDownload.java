package practice;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownload {

	public static void main(String[] args) {

		String downloadPath = "C:\\path\\to\\download\\directory";

        // Configure Chrome options
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", downloadPath); // Set default download directory
        prefs.put("download.prompt_for_download", false);      // Disable download prompt
        prefs.put("safebrowsing.enabled", true);               // Enable safe browsing

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver(options);

        try {
            // Navigate to the file download page
            driver.get("https://example.com/download");

            // Click the download link or button
            driver.findElement(By.id("downloadButton")).click();

            System.out.println("File download initiated!");

            // Optionally, verify the file is downloaded
            Thread.sleep(5000); // Wait for the download to complete (adjust as needed)

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}