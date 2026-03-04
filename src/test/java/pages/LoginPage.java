package pages;

// pages/LoginPage.java
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    private By emailOrPhoneField = By.id("username");
    private By passwordField = By.id("password");
    private By loginSubmitButton = By.xpath("//button[contains(text(),'Login')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getEmailOrPhoneField() {
        return driver.findElement(emailOrPhoneField);
    }

    public WebElement getPasswordField() {
        return driver.findElement(passwordField);
    }

    public WebElement getLoginSubmitButton() {
        return driver.findElement(loginSubmitButton);
    }

    public void enterEmailOrPhone(String emailOrPhone) {
        getEmailOrPhoneField().sendKeys(emailOrPhone);
    }

    public void enterPassword(String password) {
        getPasswordField().sendKeys(password);
    }

    public void clickLoginSubmitButton() {
        getLoginSubmitButton().click();
    }
}