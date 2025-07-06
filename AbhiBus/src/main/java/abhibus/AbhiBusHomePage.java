package abhibus;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AbhiBusHomePage {

    WebDriver driver;

    // Constructor
    public AbhiBusHomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By fromField = By.xpath("//input[contains(@placeholder,'Leaving From')]");
    By toField = By.xpath("//input[@placeholder='Going To']");
    By dateField = By.xpath("//input[@placeholder='Onward Journey Date']");
    By tomorrow = By.xpath("//a[normalize-space()='Tomorrow']");
    By searchBtn = By.xpath("//a[normalize-space()='Search']");

    // Actions
    public void enterFrom(String from) throws InterruptedException {
        WebElement fromInput = driver.findElement(fromField);
        fromInput.sendKeys(from);
        Thread.sleep(2000);
        fromInput.sendKeys(Keys.ARROW_DOWN);
        fromInput.sendKeys(Keys.ENTER);
    }

    public void enterTo(String to) throws InterruptedException {
        WebElement toInput = driver.findElement(toField);
        toInput.sendKeys(to);
        Thread.sleep(2000);
        toInput.sendKeys(Keys.ARROW_DOWN);
        toInput.sendKeys(Keys.ENTER);
    }

    public void selectDate() {
        driver.findElement(dateField).click();
        driver.findElement(tomorrow).click();
    }

    public void clickSearch() {
        driver.findElement(searchBtn).click();
    }
}
