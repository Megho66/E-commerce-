package Pages;

import Utilities.AssertionUtility;
import Utilities.DataUtils;
import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P05_Checkout {
    private final WebDriver driver;

    private final By productIcon = By.cssSelector("i[class=\"material-icons card_travel\"]");

    private final By addToCart = By.cssSelector("div>a[data-product-id=\"2\"]>i");

    private final By cartButton = By.className("fa-shopping-cart");

    private final By proceedToCheckoutButton = By.cssSelector("div>a[class=\"btn btn-default check_out\"]");

    private final By continueShopping = By.cssSelector("button[class=\"btn btn-success close-modal btn-block\"]");

    private final By billingAddress = By.className("page-subheading");

    private final By placeOrder = By.cssSelector("div>div>a[class=\"btn btn-default check_out\"]");

    private final By nameOnCard = By.name("name_on_card");

    private final By cardNumber = By.name("card_number");

    private final By CVC = By.name("cvc");

    private final By expiryMonth = By.name("expiry_month");

    private final By expiryYear = By.name("expiry_year");

    private final By confirmOrder = By.cssSelector("button[id=\"submit\"]");

    private final By confirmationmessage = By.cssSelector("section:nth-child(2) div.container div.row div.col-sm-9.col-sm-offset-1 > p:nth-child(2)");


    public P05_Checkout(WebDriver driver) {
        this.driver = driver;
    }

    public P05_Checkout clickOnProductIcon() {
        Utility.ClickingOnElement(driver, productIcon);
        return this;
    }

    public P05_Checkout clickOnAddToCart() {
        Utility.ClickingOnElement(driver, addToCart);
        return this;
    }

    public P05_Checkout clickOnContinueShopping() {
        Utility.ClickingOnElement(driver, continueShopping);
        return this;
    }

    public P05_Checkout navigateToCart() {
        Utility.ClickingOnElement(driver, cartButton);
        return this;
    }

    public P05_Checkout proceedToCheckout() {
        Utility.ClickingOnElement(driver, proceedToCheckoutButton);
        return this;
    }

    public P05_Checkout placeOrder() {
        Utility.ClickingOnElement(driver, placeOrder);
        return this;
    }

    public P05_Checkout enterNameOnCard() {
        Utility.SendData(driver, nameOnCard, DataUtils.getJsonData("home", "nameOnCard"));
        return this;
    }

    public P05_Checkout enterCardNumber() {
        Utility.SendData(driver, cardNumber, DataUtils.getJsonData("home", "cardNumber"));
        return this;
    }

    public P05_Checkout enterCVC() {
        Utility.SendData(driver, CVC, DataUtils.getJsonData("home", "CVC"));
        return this;
    }

    public P05_Checkout enterExpiryMonth() {
        Utility.SendData(driver, expiryMonth, DataUtils.getJsonData("home", "expiryMonth"));
        return this;
    }

    public P05_Checkout enterExpiryYear() {
        Utility.SendData(driver, expiryYear, DataUtils.getJsonData("home", "expiryYear"));
        return this;
    }

    public P05_Checkout clickOnConfirmOrder() {
        Utility.ClickingOnElement(driver, confirmOrder);
        return this;
    }



}






