package Tests;

import DriverFactory.DriverFactory;
import Pages.P01_Register;
import Pages.P02_SignUpPage;
import Utilities.DataUtils;
import org.testng.Assert;
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
        getDriver().get(DataUtils.getDataFromProperties("Base_URL"));
        getDriver().manage()
                .timeouts()
                .implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void Test() throws IOException, InterruptedException {
        new P01_Register(getDriver())
                .signUpPage();

        Assert.assertEquals(getDriver().getCurrentUrl(), DataUtils.getDataFromProperties("Reg_URL"));

        Thread.sleep(Duration.ofSeconds(1));

        new P02_SignUpPage(getDriver())

        ;

    }

    @AfterMethod
    public void Quit() {
        DriverFactory.Quit();
    }
}
