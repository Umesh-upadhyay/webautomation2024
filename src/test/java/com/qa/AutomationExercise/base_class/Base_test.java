package com.qa.AutomationExercise.base_class;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.qa.AutomationExercise.Constant.App_constant;
import com.qa.AutomationExercise.Utils.Eleutilnew;
import com.qa.AutomationExercise.page.Account_Created_Page_3;
import com.qa.AutomationExercise.page.Cart_page_5;
import com.qa.AutomationExercise.page.Checkout_page_6;
import com.qa.AutomationExercise.page.Home_Page_4;
import com.qa.AutomationExercise.page.Orderplaced_page_8;
import com.qa.AutomationExercise.page.Payment_page_7;
import com.qa.AutomationExercise.page.Registeration_page_2;
import com.qa.AutomationExercise.page.Sign_Up_Page_1;
import com.qa.AutomationExercise.page_test.Sign_Up_Page_Test_1;
import com.qa.AutomationExercise_Factory.Driver_factory;

import config.Config_Reader;
import freemarker.template.utility.TemplateModelUtils;


@Listeners(com.mystore.utilities.ExtentListenerClass.class) // Add this annotation at the class level
public class Base_test {
	
    WebDriver driver;
    Driver_factory df;
    protected Config_Reader reader;
    protected Sign_Up_Page_1 signup;
    protected Registeration_page_2 regpage;
    protected Account_Created_Page_3 accpage;
    protected Home_Page_4 hompgt;
    protected Cart_page_5 cartpg;
    protected Checkout_page_6 checkout;
    protected Payment_page_7 paymtpg;
    protected Orderplaced_page_8 orderplc;
    protected Sign_Up_Page_Test_1 signpgt;
    protected App_constant appconst;
    protected Eleutilnew elUtil;
    
    @BeforeTest
    public void setup() {
        // Initialize Config_Reader
        reader = new Config_Reader();  
        df = new Driver_factory(reader);  
        driver = df.initDriver();  

        // Initialize Page objects with the driver
        signup = new Sign_Up_Page_1(driver);
        regpage = new Registeration_page_2(driver);
        accpage = new Account_Created_Page_3(driver);
        hompgt = new Home_Page_4(driver);
        cartpg = new Cart_page_5(driver);
        checkout = new Checkout_page_6(driver);
        paymtpg = new Payment_page_7(driver);
        orderplc = new Orderplaced_page_8(driver);
        signpgt = new Sign_Up_Page_Test_1();
        appconst = new App_constant(driver);
        elUtil = new Eleutilnew(driver);
    }

    @AfterTest
   
  
    public void tear_Down() throws InterruptedException
    
    {
    
        if (driver != null) {
            Thread.sleep(2000);
            driver.quit();
        }
    }
    
    
   
    
    
}
