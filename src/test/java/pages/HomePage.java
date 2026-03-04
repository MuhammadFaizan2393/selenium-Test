package pages;

public class HomePage {


public void clickAddToCart() {
        driver.findElement(addToCartButton).click();
    }

public int getCartCount() {
        return Integer.parseInt(driver.findElement(cartCount).getText());
    }

public void waitForCartCount(int expectedCount) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBe(cartCount, String.valueOf(expectedCount)));
    }

public void clickCartLink() {
        driver.findElement(cartLink).click();
    }
}