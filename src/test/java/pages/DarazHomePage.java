package pages;

// pages/DarazHomePage.java
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DarazHomePage {

    private WebDriver driver;

    private By loginButton = By.xpath("//a[contains(text(),'Login')]");

    public DarazHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }

    public void clickLoginButton() {
        getLoginButton().click();
    }
}