package Pages;

import Utilities.DataUtils;
import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_Register {
    private final WebDriver driver;


    public By signUpIcon = By.cssSelector("a>[class=\"fa fa-lock\"]");
    public By enterName = By.name("name");
    public By enterEmail = By.cssSelector("input[data-qa=\"signup-email\"]");
    public By SignupButton = By.cssSelector("button[data-qa=\"signup-button\"]");
    public By EnterPassword = By.id("password");
    public By chooseDay = By.id("days");
    public By chooseMonth = By.id("months");
    public By chooseYear = By.id("years");
    public By entersFirstName = By.id("first_name");
    public By entersLastName = By.id("last_name");
    public By entersCompany = By.id("company");
    public By entersAddress = By.id("address1");
    public By chooseCountry = By.name("country");
    public By entersState = By.id("state");
    public By entersCity = By.id("city");
    public By entersZipcode = By.id("zipcode");
    public By entersMobileNum = By.id("mobile_number");
    public By clickCreateAccount = By.cssSelector("button[data-qa=\"create-account\"]");
    public By clickContinue = By.cssSelector("a[class=\"btn btn-primary\"]");

    public P01_Register(WebDriver driver) {

        this.driver = driver;
    }

    public P01_Register ClickOnSignupIcon() {
        Utility.ClickingOnElement(driver, signUpIcon);
        return this;
    }

    public P01_Register enterName (String name) {
        Utility.SendData(driver, enterName, name);
        return this;
    }

    public P01_Register enterEmail(String Email){
        Utility.SendData(driver , enterEmail , Email);
        return this;
    }

    public P01_Register clickSignUp (){
        Utility.ClickingOnElement(driver , SignupButton);
        return this;
    }
    public P01_Register enterPassword (String password){
        Utility.SendData(driver , EnterPassword , password );
        return this;
    }

    public P01_Register selectDay(String day) {
        Utility.selectDropdownByValue(driver, chooseDay, day);
        return this;
    }

    public P01_Register selectMonth(String month) {
        Utility.selectDropdownByValue(driver, chooseMonth, month);
        return this;
    }

    public P01_Register selectYear(String year) {
        Utility.selectDropdownByValue(driver, chooseYear, year);
        return this;
    }

    public P01_Register enterFirstName(String firstName) {
        Utility.SendData(driver, entersFirstName, firstName);
        return this;
    }

    public P01_Register enterLastName(String lastName) {
        Utility.SendData(driver, entersLastName, lastName);
        return this;
    }

    public P01_Register enterCompany(String company) {
        Utility.SendData(driver, entersCompany, company);
        return this;
    }

    public P01_Register enterAddress(String address) {
        Utility.SendData(driver, entersAddress, address);
        return this;
    }

    public P01_Register selectCountry(String country) {
        Utility.selectDropdownByText(driver, chooseCountry, country);
        return this;
    }

    public P01_Register enterState(String state) {
        Utility.SendData(driver, entersState, state);
        return this;
    }

    public P01_Register enterCity(String city) {
        Utility.SendData(driver, entersCity, city);
        return this;
    }

    public P01_Register enterZipcode(String zipcode) {
        Utility.SendData(driver, entersZipcode, zipcode);
        return this;
    }

    public P01_Register enterMobileNumber(String mobileNumber) {
        Utility.SendData(driver, entersMobileNum, mobileNumber);
        return this;
    }

    public P01_Register clickCreateAccount() {
        Utility.ClickingOnElement(driver, clickCreateAccount);
        return this;
    }

    public P02_Home clickContinue() {
        Utility.ClickingOnElement(driver, clickContinue);
        return new P02_Home(driver);
    }



}
