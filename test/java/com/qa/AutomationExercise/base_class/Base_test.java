package com.qa.AutomationExercise.base_class;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.AutomationExercise.page.Account_Created_Page_3;
import com.qa.AutomationExercise.page.Cart_page_5;
import com.qa.AutomationExercise.page.Checkout_page_6;
import com.qa.AutomationExercise.page.Home_Page_4;
import com.qa.AutomationExercise.page.Orderplaced_page_8;
import com.qa.AutomationExercise.page.Payment_page_7;
import com.qa.AutomationExercise.page.Registeration_page_2;
import com.qa.AutomationExercise.page.Sign_Up_Page_1;
import com.qa.AutomationExercise.page_test.Home_Page_Test_4;
import com.qa.AutomationExercise_Factory.Driver_factory;

import config.Config_Reader;

public class Base_test {
	
    WebDriver driver;
    Driver_factory df;
    protected Config_Reader reader;
    protected Sign_Up_Page_1 signup;
    protected Registeration_page_2 regpage;
    protected Account_Created_Page_3 accpage;
    protected Home_Page_4 hompgt;
    protected Cart_page_5 cartpg;
    protected Checkout_page_6 checkot;
    protected Payment_page_7 paymtpg;
    protected Orderplaced_page_8 orderplc;
    
    
    
    @BeforeTest
    public void setup() {
        // Initialize Config_Reader
        reader = new Config_Reader();  // Make sure you have a no-argument constructor in Config_Reader

        // Initialize Driver_factory and WebDriver using the config reader
        df = new Driver_factory(reader);  // Pass the reader to Driver_factory
        driver = df.initDriver();  // Initialize the driver

        // Initialize Page objects with the driver
        signup = new Sign_Up_Page_1(driver);
        regpage = new Registeration_page_2(driver);
        accpage = new Account_Created_Page_3(driver);
        hompgt = new Home_Page_4(driver);
        cartpg = new Cart_page_5(driver);
        checkot = new Checkout_page_6(driver);
        paymtpg = new Payment_page_7(driver);
        orderplc = new Orderplaced_page_8(driver);
       
    }

    @AfterTest
    public void tear_Down() throws InterruptedException {
        if (driver != null) {
            Thread.sleep(5000);
            driver.quit();
        }
    }
}
