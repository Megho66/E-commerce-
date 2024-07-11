package Pages;

import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_Register {
    private final WebDriver driver;

    private final By signUpIcon = By.cssSelector("");


    public P01_Register(WebDriver driver) {
        this.driver = driver;
    }

    public P01_Register signUpPage() {
        Utility.ClickingOnElement(driver, signUpIcon);
        return this;
    }


    public P02_SignUpPage signupButton() {

        return new P02_SignUpPage(driver);
    }


}
