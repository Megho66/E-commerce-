package Tests;

import DriverFactory.DriverFactory;
import Pages.P03_ProductVerification;
import Pages.P04_searchProduct;
import Utilities.AssertionUtility;
import Utilities.DataUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import static DriverFactory.DriverFactory.getDriver;
import static DriverFactory.DriverFactory.setupDriver;

public class TC04_searchProduct {
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
    public void searchProduct (){

        new P04_searchProduct(getDriver())
                .clickOnProductIcon()
                .enterProductName()
                .clickOnSearchButton();
    }


    @AfterMethod
    public void Quit() {
        DriverFactory.Quit();
    }
}
