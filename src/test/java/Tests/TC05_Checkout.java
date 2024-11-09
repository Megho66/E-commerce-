package Tests;

import DriverFactory.DriverFactory;
import Pages.P01_Register;
import Pages.P02_Home;
import Pages.P04_searchProduct;
import Pages.P05_Checkout;
import Utilities.AssertionUtility;
import Utilities.DataUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import static DriverFactory.DriverFactory.getDriver;
import static DriverFactory.DriverFactory.setupDriver;

public class TC05_Checkout {
    @BeforeMethod
    public void setUp() throws IOException {
        setupDriver(DataUtils.getDataFromProperties("browserName"));
        getDriver().
                get(DataUtils.
                        getDataFromProperties("Base_URL"));
        getDriver()
                .manage()
                .timeouts()
                .implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void checkOut (){

        new P01_Register(getDriver())
                .ClickOnSignupIcon();

        new P02_Home(getDriver()).enterEmail(DataUtils.getJsonData("home", "email"))
                .enterPassword(DataUtils.getJsonData("home", "password"))
                .clickLogin();

        new P05_Checkout(getDriver())
                .clickOnProductIcon()
                .clickOnAddToCart().clickOnContinueShopping()
                .navigateToCart().proceedToCheckout().placeOrder()
                .enterNameOnCard().enterCardNumber()
                .enterCVC().enterExpiryMonth().enterExpiryYear()
                .clickOnConfirmOrder();
        AssertionUtility.HardAssertionUtility.assertURL(getDriver(),DataUtils.getJsonData("home","paymentDoneURL"));

    }

    @AfterMethod
    public void Quit() {
        DriverFactory.Quit();
    }
}
