package com.qa.AutomationExercise.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.AutomationExercise.Utils.Eleutilnew;
import config.Config_Reader;

public class Sign_Up_Page_1 {

    private WebDriver driver;
    private Eleutilnew elUtil;
    private Config_Reader configReader; // Declare Config_Reader instance

    // Locators
    private By signupName = By.xpath("//input[@placeholder='Name']");
    private By signupEmail = By.xpath("//input[@data-qa='signup-email']");
    private By signupLogin_btn = By.xpath("//button[normalize-space()='Signup']");
    private By loginPassword = By.xpath("//input[@placeholder='Password']");
    private By login_btn = By.xpath("//button[normalize-space()='Login']");
    private	By loginEmail = By.xpath("//input[@data-qa='login-email']");  
    private By signupLoginHeader = By.xpath("//a[normalize-space()='Signup / Login']");
    // Constructor
   public Sign_Up_Page_1(WebDriver driver) {
        this.driver = driver;
        this.elUtil = new Eleutilnew(driver);
        this.configReader = new Config_Reader(); // Initialize Config_Reader
    }

  

    // Method for login
    public void dosignup() {
   

       
    	// Entering the signup name
    	elUtil.dosendKeys(signupName, configReader.getSignupName());
    	elUtil.logInfoMessage("Sign up name entered: " + configReader.getSignupName());

    	// Entering the signup email
    	elUtil.dosendKeys(signupEmail, configReader.getSignupEmail());
    	elUtil.logInfoMessage("Sign up email entered: " + configReader.getSignupEmail());
    	elUtil.captureScreenshot(driver, "getSignupName");
    	// Clicking the signup button
    	elUtil.click(signupLogin_btn);
    	elUtil.logInfoMessage("Clicked on the signup button.");

    }
    
    // Method for login
    
    
        public Home_Page_4 dologin() throws InterruptedException {
    	
        // Entering the login email
        elUtil.dosendKeys(loginEmail, configReader.getSignupEmail());
        elUtil.logInfoMessage("Login email entered: " + configReader.getSignupEmail());

        // Entering the login password
        elUtil.dosendKeys(loginPassword, configReader.getUserPassword());
        elUtil.logInfoMessage("Login password entered.");
        elUtil.captureScreenshot(driver, "dologin");
        // Clicking the login button
        elUtil.click(login_btn);
        Thread.sleep(3000);
    	

        elUtil.logInfoMessage("Clicked on the login button.");
        return new Home_Page_4(driver);
    }

    // Method to verify if the user is on the home page
    

    

    // Other methods...
}
