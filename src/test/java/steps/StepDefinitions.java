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

public class StepDefinitions {

    private WebDriver driver;
    private DarazHomePage darazHomePage;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    public StepDefinitions() {
        driver = WebDriverUtils.getDriver("chrome"); // Or any other browser
        darazHomePage = new DarazHomePage(driver);
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
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
}