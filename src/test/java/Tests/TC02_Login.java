package Tests;

import DriverFactory.DriverFactory;
import Pages.P01_Register;
import Pages.P02_Home;
import Utilities.DataUtils;
import org.testng.IInvokedMethodListener;
import org.testng.annotations.*;


import java.io.IOException;
import java.time.Duration;

import static DriverFactory.DriverFactory.getDriver;
import static DriverFactory.DriverFactory.setupDriver;



public class TC02_Login {


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
   // public void UserLoginToHome(String username , String password) {
    public void UserLoginToHome() {

        new P01_Register(getDriver())
                .ClickOnSignupIcon();

        new P02_Home(getDriver())
                .enterEmail(DataUtils.getJsonData("home", "email"))
                .enterPassword(DataUtils.getJsonData("home", "password"))
                .clickLogin();

    }


    @AfterMethod
    public void Quit() {
        DriverFactory.Quit();
    }
}
