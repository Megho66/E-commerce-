package Pages;

import Utilities.DataUtils;
import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class P04_searchProduct {
    private WebDriver driver ;
//    ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();
// TODO >>el thread local da ba3mlo lma bagy a3mel parallel execution
    private final By productIcon = By.cssSelector("i[class=\"material-icons card_travel\"]");

    private final By productName = By.id("search_product");

    private final By searchButton = By.cssSelector("i[class=\"fa fa-search\"]");

    private final By matchProductName = By.cssSelector("div[class=\"features_items\"]>div[class=\"col-sm-4\"]>div>div[class=\"single-products\"]>div[class=\"productinfo text-center\"]>p");

    public P04_searchProduct (WebDriver driver){
        this.driver = driver;
    }

    public P04_searchProduct clickOnProductIcon(){
        Utility.ClickingOnElement(driver , productIcon);
        return this ;
    }
    public P04_searchProduct enterProductName (){
        Utility.SendData(driver , productName , DataUtils.getJsonData("home" , "searchProduct"));
        return this;
    }
    public P05_Checkout clickOnSearchButton (){
        Utility.ClickingOnElement(driver , searchButton);

        return new P05_Checkout(driver);
    }


}


