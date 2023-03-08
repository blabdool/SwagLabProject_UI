package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SwagLabProductsPage extends BasePage{

    public SwagLabProductsPage(WebDriver driver){
        super(driver);
    }
///Locators (FINDING PART)

    //Alternative formats using a list. Both css ways of identifying the List are correct.
     //@FindBy(css = ".inventory_item_name") private List<WebElement> ProductsLocators;
    // @FindBy(css = "div[class='inventory_item_name']") private List<WebElement> ProductsLocators;
    //public void clickOnTheFirstProduct(){ ProductsLocators.get(0).click();}
    //Make it a generic method
    //public void clickOnAProduct(int index){
      //  ProductsLocators.get(index-1).click();}

    @FindBy(xpath = "//div[contains(text(), 'Sauce Labs Backpack')]") private WebElement SauceLabsBackpackLocator;
    @FindBy(xpath = "//div[contains(text(), 'Sauce Labs Bike Light')]") private WebElement SauceLabsBikeLightLocator;
    @FindBy(xpath = "//div[contains(text(), 'Sauce Labs Bolt T-Shirt')]") private WebElement SauceLabsBoltTShirtLocator;
    @FindBy(xpath = "//div[contains(text(), 'Sauce Labs Fleece Jacket')]") private WebElement SauceLabsFleeceJacketLocator;
    @FindBy(xpath = "//div[contains(text(), 'Sauce Labs Onesie')]") private WebElement SauceLabsOnesieLocator;
    @FindBy(xpath = "//div[contains(text(), 'Test.allTheThings() T-Shirt (Red)')]") private WebElement TestAllTheThingsTShirtLocator;

    @FindBy(xpath = "//img[@alt ='Sauce Labs Backpack']") private WebElement SauceLabsBackpackImageLocator;
    @FindBy(xpath = "//img[@alt ='Sauce Labs Bike Light']") private WebElement SauceLabsBikeLightImageLocator;
    @FindBy(xpath = "//img[@alt ='Sauce Labs Bolt T-Shirt']") private WebElement SauceLabsBoltTShirtImageLocator;
    @FindBy(xpath = "//img[@alt ='Sauce Labs Fleece Jacket']") private WebElement SauceLabsFleeceJacketImageLocator;
    @FindBy(xpath = "//img[@alt ='Sauce Labs Onesie']") private WebElement SauceLabsOnesieImageLocator;
    @FindBy(id = "item_3_img_link") private WebElement TestAllTheThingsTShirtImageLocator;

    @FindBy(id = "add-to-cart-sauce-labs-backpack") private WebElement SauceLabsBackpackAddToCartButtonLocator;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light") private WebElement SauceLabsBikeLightAddToCartButtonLocator;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt") private WebElement SauceLabsBoltTShirtAddToCartButtonLocator;
    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket") private WebElement SauceLabsFleeceJacketAddToCartButtonLocator;
    @FindBy(id = "add-to-cart-sauce-labs-onesie") private WebElement SauceLabsOnesieAddToCartButtonLocator;
    @FindBy(xpath = "//*[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") private WebElement TestAllTheThingsTShirtAddToCartButtonLocator;

    @FindBy(id = "shopping_cart_container") private WebElement ShoppingCartContainerLocator;

    ///Methods (DOING PART)
    public void clickOnSauceLabsBackpack(){
        SauceLabsBackpackLocator.click();
    }
    public void clickOnSauceLabsBikeLight(){
        SauceLabsBikeLightLocator.click();
    }
    public void clickOnSauceLabsBoltTShirt(){
        SauceLabsBoltTShirtLocator.click();
    }
    public void clickOnSauceLabsFleeceJacket(){
        SauceLabsFleeceJacketLocator.click();
    }
    public void clickOnSauceLabsOnesie(){
        SauceLabsOnesieLocator.click();
    }
    public void clickOnTestAllTheThingsTShirt(){
        TestAllTheThingsTShirtLocator.click();
    }
// PRODUCT IMAGES
    public void clickOnSauceLabsBackpackImage(){
        SauceLabsBackpackImageLocator.click();
    }
    public void clickOnSauceLabsBikeLightImage(){
        SauceLabsBikeLightImageLocator.click();
    }
    public void clickOnSauceLabsBoltTShirtImage(){
        SauceLabsBoltTShirtImageLocator.click();
    }
    public void clickOnSauceLabsFleeceJacketImage(){
        SauceLabsFleeceJacketImageLocator.click();
    }
    public void clickOnSauceLabsOnesieImage(){
        SauceLabsOnesieImageLocator.click();
    }
    public void clickOnTestAllTheThingsTShirtImage(){
        TestAllTheThingsTShirtImageLocator.click();
    }

    //ADD TO CART BUTTONS
    public void clickOnSauceLabsBackpackAddToCartButton(){
        SauceLabsBackpackAddToCartButtonLocator.click();
    }
    public void clickOnSauceLabsBikeLightAddToCartButton(){
        SauceLabsBikeLightAddToCartButtonLocator.click();
    }
    public void clickOnSauceLabsBoltTShirtAddToCartButton(){
        SauceLabsBoltTShirtAddToCartButtonLocator.click();
    }
    public void SauceLabsFleeceJacketAddToCartButton(){
        SauceLabsFleeceJacketAddToCartButtonLocator.click();
    }
    public void clickOnSauceLabsOnesieAddToCartButton(){
        SauceLabsOnesieAddToCartButtonLocator.click();
    }
    public void clickOnTestAllTheThingsTShirtAddToCartButton(){
        TestAllTheThingsTShirtAddToCartButtonLocator.click();
    }

    public void clickOnShoppingCartContainer(){
        ShoppingCartContainerLocator.click();
    }

}
