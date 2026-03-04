package steps;

// steps/StepDefinitions.java
package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.DarazHomePage;
import pages.LoginPage;
import pages.DashboardPage;
import utils.WebDriverUtils;
import pages.HomePage;

public class StepDefinitions {
private HomePage homePage;
private DarazHomePage darazHomePage;


    private WebDriver driver;
    private DarazHomePage darazHomePage;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    public StepDefinitions() {
    driver = WebDriverUtils.getDriver('chrome');
    homePage = new HomePage(driver);
    darazHomePage = new DarazHomePage(driver);
}


    @Given("the user is on the Daraz Pakistan homepage")
    public void the_user_is_on_the_daraz_pakistan_homepage() {
        driver.get("https://www.daraz.pk/"); // Replace with the actual Daraz Pakistan homepage URL
    }

    @When("the user clicks on the Login button")
    public void the_user_clicks_on_the_login_button() {
        darazHomePage.clickLoginButton();
    }

    @Then("the login modal or page should be display")
    public void the_login_modal_or_page_should_be_display() {
        // Assuming a modal or page with username input appears
        Assert.assertTrue(loginPage.getEmailOrPhoneField().isDisplayed());
    }

    @Then("the user enters a valid email or phone number")
    public void the_user_enters_a_valid_email_or_phone_number() {
        loginPage.enterEmailOrPhone("valid_email@example.com"); // Replace with a valid email or phone
    }

    @Then("the user enters a valid password")
    public void the_user_enters_a_valid_password() {
        loginPage.enterPassword("valid_password"); // Replace with a valid password
    }

    @Then("the user clicks the Login submit button")
    public void the_user_clicks_the_login_submit_button() {
        loginPage.clickLoginSubmitButton();
    }

    @Then("the user should be redirected to the dashboard")
    public void the_user_should_be_redirected_to_the_dashboard() {
        // Add assertion to check for dashboard elements after redirection.
        //For example dashboard title
        //Assert.assertEquals("Dashboard",driver.getTitle());
        // Or checking an element that only appears on the dashboard
       Assert.assertTrue(dashboardPage.isUserNameVisible()); // Example
    }

    @Then("the user name should be visible on the header")
    public void the_user_name_should_be_visible_on_the_header() {
        // Assuming user name is visible in the header after login
        Assert.assertTrue(dashboardPage.isUserNameVisible());
    }

    @Then("the user should logged in")
    public void the_user_should_logged_in() {
        // Another assertion to confirm login.  Could check for logout button.
        Assert.assertTrue(dashboardPage.isUserNameVisible());

    }

@Given("I am on the product listing page")
public void i_am_on_the_product_listing_page() { //new
    // Assuming you navigate to the product listing page here
    driver.get("https://example.com/products"); // Replace with your actual URL
}

@When("I click "Add to Cart" for a product")
public void i_click_add_to_cart_for_a_product() { //new
    homePage.clickAddToCart();
}

@Then("the product should appear in my cart")
public void the_product_should_appear_in_my_cart() { //new
    homePage.clickCartLink();
    // Add assertions here to verify the product is in the cart
}

@And("the cart count should increase by {int}")
public void the_cart_count_should_increase_by(int expectedIncrease) { //new
    int initialCartCount = homePage.getCartCount();
    homePage.waitForCartCount(initialCartCount + expectedIncrease);
    int finalCartCount = homePage.getCartCount();
    Assert.assertEquals(finalCartCount, initialCartCount + expectedIncrease);
}

@When("I add two different products to the cart")
public void i_add_two_different_products_to_the_cart() { //new
    // Assuming you have a way to add two different products
    homePage.clickAddToCart();
    // Navigate to another product page and add it to the cart
    driver.get("https://example.com/another-product"); // Replace with your actual URL
    homePage.clickAddToCart();
}

@Then("both products should appear in my cart")
public void both_products_should_appear_in_my_cart() { //new
    homePage.clickCartLink();
    // Add assertions here to verify both products are in the cart
}

@And("the cart count should reflect {int} items")
public void the_cart_count_should_reflect_items(int expectedCount) { //new
    homePage.waitForCartCount(expectedCount);
    int actualCount = homePage.getCartCount();
    Assert.assertEquals(actualCount, expectedCount);
}

@Given("I am on the product page")
public void i_am_on_the_product_page() { //new
    // Assuming you navigate to a product page here
    driver.get("https://example.com/product"); // Replace with your actual URL
}

}
