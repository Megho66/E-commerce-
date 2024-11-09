package Pages;

import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03_ProductVerification {
    private final WebDriver driver;

    private final By clickOnProductButton = By.cssSelector("i[class=\"material-icons card_travel\"]");
    private final By clickOnProduct = By.cssSelector("div[class=\"choose\"]>ul>li>a[href=\"/product_details/1\"]");
    private final By productsDisplayed = By.className("features_items");
    private final By detailsAppear = By.className("product-information");

    public P03_ProductVerification(WebDriver driver) {
        this.driver = driver;
    }

    public P03_ProductVerification clickOnProductIcon() {
        Utility.ClickingOnElement(driver, clickOnProductButton);
        return this;
    }


    public P04_searchProduct clickOnAProduct() {
        Utility.ClickingOnElement(driver, clickOnProduct);
        return new P04_searchProduct(driver);
    }



}
