package Pages;

import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_Home {
    private final WebDriver driver;


    private final By email = By.name("email");
    private final By password = By.name("password");
    private final By clickLogin = By.cssSelector("button[data-qa=\"login-button\"]");

    public P02_Home(WebDriver driver) {
        this.driver = driver;
    }


    public P02_Home enterEmail(String userEmail) {
        Utility.SendData(driver, email, userEmail);
        return this;
    }


    public P02_Home enterPassword(String userPassword) {
        Utility.SendData(driver, password, userPassword);
        return this;
    }


    public P03_ProductVerification clickLogin() {
        Utility.ClickingOnElement(driver, clickLogin);
        return new P03_ProductVerification(driver);
    }

}





