package abhibus;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

    public static WebDriver driver;
    public void initializeBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.abhibus.com/");
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    } 
    
    public void openBrowser() {
    	driver=new FirefoxDriver();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.manage().window().maximize();
    	driver.get("https://www.abhibus.com/");
    }
}
