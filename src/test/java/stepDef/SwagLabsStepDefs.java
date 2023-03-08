package stepDef;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.*;
import utilities.PropertyReader;

import java.io.IOException;
import java.util.Properties;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SwagLabsStepDefs extends BaseUtil {
    private BaseUtil base;
    public SwagLabsStepDefs (BaseUtil base){
        this.base = base;
    }

    @Given("I am on the swag lab homepage {string}")
    public void i_am_on_the_swag_lab_homepage(String url) {
        base.driver.manage().window().maximize();
        //base.driver.get(url);
        base.driver.navigate().to(url);
    }
    @When("I enter valid username as {string} and valid password as {string}")
    public void i_enter_valid_username_as_and_valid_password_as(String username, String password) {
        SwagLabHomePage swagLabHomePage = new SwagLabHomePage(base.driver);
        swagLabHomePage.enterUserName(username);
        swagLabHomePage.enterPassword(password);
    }
    @When("I click on Login button")
    public void i_click_on_login_button() {
        SwagLabHomePage swagLabHomePage = new SwagLabHomePage(base.driver);
        swagLabHomePage.clickOnLogin();
    }
    @When("I click on the first item {string} on the products page")
    public void i_click_on_the_first_item_on_the_products_page(String string) {
        SwagLabProductsPage swagLabProductsPage = new SwagLabProductsPage(base.driver);
        swagLabProductsPage.clickOnSauceLabsBackpack();
    }
    @When("I click on Add to Cart button")
    public void i_click_on_add_to_cart_button() {
        SwagLabProductsPage swagLabProductsPage = new SwagLabProductsPage(base.driver);
        swagLabProductsPage.clickOnSauceLabsBackpackAddToCartButton();
    }
    @When("I click on Shopping Cart icon")
    public void i_click_on_shopping_cart_icon() {
        SwagLabProductsPage swagLabProductsPage = new SwagLabProductsPage(base.driver);
        swagLabProductsPage.clickOnShoppingCartContainer();
    }
    @When("I click on Checkout")
    public void i_click_on_checkout() {
        SwagLabYourCartPage swagLabYourCartPage = new SwagLabYourCartPage(base.driver);
        swagLabYourCartPage.clickOnCheckout();
    }
    @When("I enter First Name as {string} Last Name as {string} and Zip_Postal Code as {string}")
    public void i_enter_first_name_as_last_name_as_and_zip_postal_code_as(String fname, String lname, String pcode) {
        SwagLabsCheckoutYourInformationPage swagLabsCheckoutYourInformationPage = new SwagLabsCheckoutYourInformationPage(base.driver);
        swagLabsCheckoutYourInformationPage.enterFirstName(fname);
        swagLabsCheckoutYourInformationPage.enterLastName(lname);
        swagLabsCheckoutYourInformationPage.enterZipPostalCode(pcode);

    }
    @When("I click Continue button")
    public void i_click_continue_button() {
        SwagLabsCheckoutYourInformationPage swagLabsCheckoutYourInformationPage = new SwagLabsCheckoutYourInformationPage(base.driver);
        swagLabsCheckoutYourInformationPage.clickOnContinueButton();
    }
    @When("I click Finish button")
    public void i_click_finish_button() {
        SwagLabsCheckoutOverviewPage swagLabsCheckoutOverviewPage = new SwagLabsCheckoutOverviewPage(base.driver);
        swagLabsCheckoutOverviewPage.clickOnFinishButton();
    }
    @Then("{string} should be displayed")
    public void should_be_displayed(String expectedMsg) {
        SwagLabsCheckoutCompletePage swagLabsCheckoutCompletePage = new SwagLabsCheckoutCompletePage(base.driver);
        String actualMessage = swagLabsCheckoutCompletePage.getAcknowledgementMessage();
        assertThat(actualMessage.equalsIgnoreCase(expectedMsg), is(true));

    }

    @Given("I am on the swag lab homepage")
    public void i_am_on_the_swag_lab_homepage() throws IOException {
        PropertyReader propertyReader = new PropertyReader();
        base.driver.get(propertyReader.getSwagLabUrl());
    }
    @When("I enter valid username and valid password")
    public void i_enter_valid_username_and_valid_password() throws IOException {
        SwagLabHomePage swagLabHomePage = new SwagLabHomePage(base.driver);
        PropertyReader propertyReader = new PropertyReader();
        swagLabHomePage.enterUserName(propertyReader.getUsername());
        swagLabHomePage.enterPassword(propertyReader.getPassword());
    }
    @When("I enter First Name Last Name only but no ZipPostalCo")
    public void i_enter_first_name_last_name_only_but_no_zip_postal_co() throws IOException {
        SwagLabsCheckoutYourInformationPage swagLabsCheckoutYourInformationPage = new SwagLabsCheckoutYourInformationPage(base.driver);
        PropertyReader propertyReader = new PropertyReader();
        swagLabsCheckoutYourInformationPage.enterFirstName(propertyReader.getFirstName());
        swagLabsCheckoutYourInformationPage.enterLastName(propertyReader.getLastName());
    }
    @Then("{string} should be displayed on the Checkout Your Information page")
    public void should_be_displayed_on_the_checkout_your_information_page(String expectedErrorMsg) {
        SwagLabsCheckoutYourInformationPage swagLabsCheckoutYourInformationPage = new SwagLabsCheckoutYourInformationPage(base.driver);
        if (expectedErrorMsg=="Error: Postal Code is required"){
            String actualMessage = swagLabsCheckoutYourInformationPage.getErrorMessage();
            assertThat(actualMessage.equalsIgnoreCase(expectedErrorMsg), is(true));
        } else if (expectedErrorMsg =="Error: First Name is required") {
            String actualMessage = swagLabsCheckoutYourInformationPage.getErrorMessage();
            assertThat(actualMessage.equalsIgnoreCase(expectedErrorMsg), is(true));
        } else if (expectedErrorMsg =="Error: Last Name is required") {
            String actualMessage = swagLabsCheckoutYourInformationPage.getErrorMessage();
            assertThat(actualMessage.equalsIgnoreCase(expectedErrorMsg), is(true));
        }

    }

    @When("I enter only Last Name and PostalCode")
    public void i_enter_only_last_name_and_postal_code() throws IOException {
        SwagLabsCheckoutYourInformationPage swagLabsCheckoutYourInformationPage = new SwagLabsCheckoutYourInformationPage(base.driver);
        PropertyReader propertyReader = new PropertyReader();
        swagLabsCheckoutYourInformationPage.enterLastName(propertyReader.getLastName());
        swagLabsCheckoutYourInformationPage.enterZipPostalCode(propertyReader.getPostCode());
    }
    @When("I enter only First Name and PostalCode")
    public void i_enter_only_first_name_and_postal_code() throws IOException {
        SwagLabsCheckoutYourInformationPage swagLabsCheckoutYourInformationPage = new SwagLabsCheckoutYourInformationPage(base.driver);
        PropertyReader propertyReader = new PropertyReader();
        swagLabsCheckoutYourInformationPage.enterFirstName(propertyReader.getFirstName());
        swagLabsCheckoutYourInformationPage.enterZipPostalCode(propertyReader.getPostCode());
    }
    @Then("{string} error message is displayed and I am not logged in")
    public void error_message_is_displayed_and_i_am_not_logged_in(String loginErrorMsg) {
        SwagLabHomePage swagLabHomePage = new SwagLabHomePage(base.driver);
        String actualMessage = swagLabHomePage.getErrorMessage();
        assertThat(actualMessage.equalsIgnoreCase(loginErrorMsg), is(true));
    }


    @Then("{string} item is added to the cart")
    public void itemIsAddedToTheCart(String qty) {
        SwagLabYourCartPage swagLabYourCartPage = new SwagLabYourCartPage(base.driver);
        String NoOfItemsInCart = swagLabYourCartPage.getNoOfItemsInCart();
        assertThat(NoOfItemsInCart.equalsIgnoreCase(qty), is(true));
        
    }

    @When("I click remove button")
    public void iClickRemoveButton() {
        SwagLabYourCartPage swagLabYourCartPage = new SwagLabYourCartPage(base.driver);
        swagLabYourCartPage.clickOnRemoveSauceLabsBackpackButton();
        
    }

    @Then("cart should have no item in it")
    public void cartShouldHaveNoItemInIt() {
        SwagLabYourCartPage swagLabYourCartPage = new SwagLabYourCartPage(base.driver);

        String emptyTagName = swagLabYourCartPage.getEmptyCart();
        assertThat(emptyTagName.equalsIgnoreCase("a"), is(true));
        }


}
