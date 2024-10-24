package com.qa.AutomationExercise.page;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.AutomationExercise.Utils.Eleutilnew;

import config.Config_Reader;

public class Registeration_page_2 {

    private WebDriver driver;
    private Eleutilnew elUtil;
    private Config_Reader reader;
    private Properties prop;

    // Constructor to initialize WebDriver, Actions, and Config_Reader
    public Registeration_page_2(WebDriver driver) {
        this.driver = driver;
        this.elUtil = new Eleutilnew(driver);
        reader	= new Config_Reader();
    }

    // Locators
    private By accountInfoHeader = By.xpath("//b[contains(.,'Enter Account Information')]");
    private By titleMr = By.id("id_gender1");
    private By password = By.id("password");
    private By days = By.id("days");
    private By months = By.id("months");
    private By years = By.id("years");
    private By newsletter = By.id("newsletter");
    private By specialOffers = By.id("optin");
    private By firstName = By.id("first_name");
    private By lastName = By.id("last_name");
    private By company = By.id("company");
    private By address1 = By.id("address1");
    private By address2 = By.id("address2");
    private By country = By.id("country");
    private By state = By.id("state");
    private By city = By.id("city");
    private By zipcode = By.id("zipcode");
    private By mobileNumber = By.id("mobile_number");
    private By createAccount_btn = By.cssSelector("button[data-qa='create-account']");

    // Method to fill the registration form
    public Account_Created_Page_3 fillform() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for the 'Mr.' title element to be clickable and click it
        wait.until(ExpectedConditions.elementToBeClickable(titleMr));
        elUtil.click(titleMr);
        elUtil.logInfoMessage("Clicked on 'Mr.' title.");

        elUtil.pressTab(); // Assuming this is for skipping to the password field
        
        elUtil.dosendKeys(password, reader.getUserPassword());
        elUtil.logInfoMessage("Entered password.");

        elUtil.pressTab(); // Move to the day dropdown

        elUtil.selectByVisibleText(days, reader.getBirthDay());
        elUtil.logInfoMessage("Selected day: " + reader.getBirthDay());

        elUtil.pressTab(); // Move to the month dropdown

        elUtil.selectByVisibleText(months, reader.getBirthMonth());
        elUtil.logInfoMessage("Selected month: " + reader.getBirthMonth());

        elUtil.pressTab(); // Move to the year dropdown

        elUtil.selectByVisibleText(years, reader.getBirthYear());
        elUtil.logInfoMessage("Selected year: " + reader.getBirthYear());

        elUtil.pressTab(); // For newsletter opt-in
        elUtil.pressTab(); // For special offers opt-in

        elUtil.dosendKeys(firstName, reader.getFirstName());
        elUtil.logInfoMessage("Entered first name: " + reader.getFirstName());

        elUtil.pressTab(); // Move to last name field

        elUtil.dosendKeys(lastName, reader.getLastName());
        elUtil.logInfoMessage("Entered last name: " + reader.getLastName());

        elUtil.pressTab(); // Move to company field

        elUtil.dosendKeys(company, reader.getCompany());
        elUtil.logInfoMessage("Entered company name: " + reader.getCompany());

        elUtil.pressTab(); // Move to address 1 field

        elUtil.dosendKeys(address1, reader.getAddress1());
        elUtil.logInfoMessage("Entered address 1: " + reader.getAddress1());

        elUtil.pressTab(); // Move to address 2 field

        elUtil.dosendKeys(address2, reader.getAddress2());
        elUtil.logInfoMessage("Entered address 2: " + reader.getAddress2());

        elUtil.pressTab(); // Move to state field

        elUtil.dosendKeys(state, reader.getState());
        elUtil.logInfoMessage("Entered state: " + reader.getState());

        elUtil.pressTab(); // Move to city field

        elUtil.dosendKeys(city, reader.getCity());
        elUtil.logInfoMessage("Entered city: " + reader.getCity());

        elUtil.pressTab(); // Move to zipcode field

        elUtil.dosendKeys(zipcode, reader.getZipcode());
        elUtil.logInfoMessage("Entered zipcode: " + reader.getZipcode());

        elUtil.pressTab(); // Move to mobile number field

        elUtil.dosendKeys(mobileNumber, reader.getMobileNumber());
        elUtil.logInfoMessage("Entered mobile number: " + reader.getMobileNumber());

        elUtil.pressTab(); // Move to create account button

        elUtil.click(createAccount_btn); // Click to create account
        elUtil.logInfoMessage("Clicked on the 'Create Account' button.");

        return new Account_Created_Page_3(driver);
    }
}
