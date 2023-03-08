package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabsCheckoutOverviewPage extends BasePage{
    public SwagLabsCheckoutOverviewPage(WebDriver driver){
        super(driver);
    }
    ///Locators (FINDING PART)
    @FindBy(xpath = "//span[contains(text(), 'Checkout: Overview')]") private WebElement SwagLabCheckoutOverviewPageLocator;
    @FindBy(xpath = "//div[contains(text(), 'Payment Information')]") private WebElement PaymentInformationLocator;
    @FindBy(xpath = "//div[contains(text(), 'Shipping Information')]") private WebElement ShippingInformationLocator;
    @FindBy(xpath = "//div[contains(text(), 'Price Total')]") private WebElement PriceTotalLocator;
    @FindBy(css = "div[class='summary_info_label summary_total_label']") private WebElement SummaryInfoLocator;
    @FindBy(id="finish") private WebElement FinishButtonLocator;
   // @FindBy(id="cancel") private WebElement CancelButtonLocator;

    public void clickOnFinishButton(){
        FinishButtonLocator.click();
    }


}
