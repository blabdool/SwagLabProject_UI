package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabYourCartPage extends BasePage{

    public SwagLabYourCartPage(WebDriver driver){
        super(driver);
    }
///Locators (FINDING PART)
    @FindBy(xpath = "//span[contains(text(), 'Your Cart')]") private WebElement SwagLabYourCartPageLocator;
    @FindBy(xpath = "//span[contains(text(), '1')]") private WebElement NoOfCartItemLocator;
    @FindBy(css = "#shopping_cart_container>a") private WebElement EmptyCartLocator;
    @FindBy(id = "checkout") private WebElement CheckoutButtonLocator;
    @FindBy(id = "continue-shopping") private WebElement ContinueShoppingButtonLocator;
    @FindBy(id = "remove-sauce-labs-backpack") private WebElement RemoveSauceLabsBackpackButtonLocator;
    @FindBy(id = "remove-sauce-labs-bike-light") private WebElement RemoveSauceLabsBikeLightButtonLocator;
    @FindBy(id = "remove-sauce-labs-bolt-t-shirt") private WebElement RemoveSauceLabsBoltTShirtButtonLocator;
    @FindBy(id = "remove-sauce-labs-fleece-jacket") private WebElement RemoveSauceLabsFleeceJacketButtonLocator;
    @FindBy(id = "remove-sauce-labs-onesie") private WebElement RemoveSauceLabsOnesieButtonLocator;
    @FindBy(id = "remove-test.allthethings()-t-shirt-(red)") private WebElement RemoveTestAllTheThingsTShirtButtonLocator;

    ///Methods (DOING PART)
    public void clickOnCheckout(){
        CheckoutButtonLocator.click();
    }
    public void clickOnContinueShoppingButton(){
        ContinueShoppingButtonLocator.click();
    }
    public void clickOnRemoveSauceLabsBackpackButton(){
        RemoveSauceLabsBackpackButtonLocator.click();
    }
    public void clickOnRemoveSauceLabsBikeLightButton(){
        RemoveSauceLabsBikeLightButtonLocator.click();
    }
    public void clickOnRemoveSauceLabsBoltTShirtButton(){
        RemoveSauceLabsBoltTShirtButtonLocator.click();
    }
    public void clickOnRemoveSauceLabsFleeceJacketButton(){
        RemoveSauceLabsFleeceJacketButtonLocator.click();
    }
    public void clickOnRemoveSauceLabsOnesieButton(){
        RemoveSauceLabsOnesieButtonLocator.click();
    }
    public void clickOnRemoveTestAllTheThingsTShirtButton(){
        RemoveTestAllTheThingsTShirtButtonLocator.click();
    }

    public String getNoOfItemsInCart(){
        return NoOfCartItemLocator.getText();
    }

    public String getEmptyCart(){
        return EmptyCartLocator.getTagName();
    }






}
