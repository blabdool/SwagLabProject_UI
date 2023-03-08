package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabsCheckoutYourInformationPage extends BasePage{
    public SwagLabsCheckoutYourInformationPage(WebDriver driver){
        super(driver);
    }
    ///Locators (FINDING PART)
    @FindBy(xpath = "//span[contains(text(), 'Checkout: Your Information')]") private WebElement SwagLabCheckOutYourInformationPageLocator;
    @FindBy(id ="first-name") private WebElement FirstNameLocator;
    @FindBy(id="last-name") private WebElement LastNameLocator;
    @FindBy(id="postal-code") private WebElement ZipPostalCodeLocator;
    @FindBy(id="continue") private WebElement ContinueButtonLocator;
    @FindBy(id="cancel") private WebElement CancelButtonLocator;
    @FindBy(xpath = "//h3[@data-test='error']") private WebElement ErrorLocator;

    ///Methods (DOING PART)

    public void enterFirstName(String firstname){
        FirstNameLocator.sendKeys(firstname);
    }
    public void enterLastName(String lastname){
        LastNameLocator.sendKeys(lastname);
    }
    public void enterZipPostalCode(String postalcode){
        ZipPostalCodeLocator.sendKeys(postalcode);
    }
    public void clickOnContinueButton(){
        ContinueButtonLocator.click();
    }
    public void clickOnCancelButton(){
        CancelButtonLocator.click();
    }

    public String getErrorMessage(){
        return ErrorLocator.getText();
    }
}
