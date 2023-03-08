package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabsCheckoutCompletePage extends BasePage{
    public SwagLabsCheckoutCompletePage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//span[contains(text(), 'Checkout: Complete!')]") private WebElement SwagLabCheckoutCompletePageLocator;
    @FindBy(xpath = "//h2[contains(text(), 'Thank you for your order!')]") private WebElement OrderAcknowledgementLocator;
    @FindBy(id="back-to-products") private WebElement BackHomeButtonLocator;
    public void clickOnBackHomeButton(){
        BackHomeButtonLocator.click();
    }

    public String getAcknowledgementMessage(){
        return OrderAcknowledgementLocator.getText();
    }


}
