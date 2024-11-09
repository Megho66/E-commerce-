package Tests;

import DriverFactory.DriverFactory;
import Pages.P03_ProductVerification;
import Utilities.AssertionUtility;
import Utilities.DataUtils;
import org.testng.IInvokedMethodListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import static DriverFactory.DriverFactory.getDriver;
import static DriverFactory.DriverFactory.setupDriver;


public class TC03_ProductVerifcation {


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
    public void UserLoginToHome() {

        new P03_ProductVerification(getDriver())
                .clickOnProductIcon();

        AssertionUtility.HardAssertionUtility.assertURL(getDriver(), DataUtils.getJsonData("home", "productURL"));

        new P03_ProductVerification(getDriver())
                .clickOnAProduct();
        AssertionUtility.HardAssertionUtility.assertURL(getDriver(), DataUtils.getJsonData("home", "productDetailPage"));
    }


    @AfterMethod
    public void Quit() {
        DriverFactory.Quit();
    }
}
