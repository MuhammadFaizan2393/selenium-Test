package pages;

// pages/DashboardPage.java
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

    private WebDriver driver;

    private By userNameHeader = By.id("myAccount"); // Example locator, adjust as needed

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUserNameHeader() {
        return driver.findElement(userNameHeader);
    }

    public String getUserName() {
        return getUserNameHeader().getText();
    }

    public boolean isUserNameVisible() {
        return getUserNameHeader().isDisplayed();
    }
}