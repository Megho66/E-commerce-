package Tests;

import DriverFactory.DriverFactory;
import Pages.P01_Register;
import Utilities.DataUtils;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import static DriverFactory.DriverFactory.getDriver;
import static DriverFactory.DriverFactory.setupDriver;

public class TC01_Register {


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
    public void testUserRegistration() {
        new P01_Register(getDriver())
                .ClickOnSignupIcon()
                .enterName(DataUtils.getJsonData("home", "name"))
                .enterEmail(DataUtils.getJsonData("home", "email"))
                .clickSignUp()
                .enterPassword(DataUtils.getJsonData("home", "password"))
                .selectDay(DataUtils.getJsonData("home", "day"))
                .selectMonth(DataUtils.getJsonData("home", "month"))
                .selectYear(DataUtils.getJsonData("home", "year"))
                .enterFirstName(DataUtils.getJsonData("home", "firstName"))
                .enterLastName(DataUtils.getJsonData("home", "lastName"))
                .enterCompany(DataUtils.getJsonData("home", "company"))
                .enterAddress(DataUtils.getJsonData("home", "address"))
                .selectCountry(DataUtils.getJsonData("home", "country"))
                .enterState(DataUtils.getJsonData("home", "state"))
                .enterCity(DataUtils.getJsonData("home", "city"))
                .enterZipcode(DataUtils.getJsonData("home", "zipcode"))
                .enterMobileNumber(DataUtils.getJsonData("home", "mobileNumber"))
                .clickCreateAccount()
                .clickContinue();
    }


    @AfterMethod
    public void Quit() {
        DriverFactory.Quit();
    }
}
