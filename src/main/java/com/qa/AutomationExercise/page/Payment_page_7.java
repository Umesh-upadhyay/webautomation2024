package com.qa.AutomationExercise.page;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.qa.AutomationExercise.Utils.Eleutilnew;

import config.Config_Reader;

public class Payment_page_7 {

	private WebDriver driver;
    private Actions act;
    private Action action;
    private Eleutilnew elUtil;	
    private Config_Reader configReader; // Declare Config_Reader instance
    private Properties prop;
    private Orderplaced_page_8 orderplc;
    
//********************* CONSTRUCTOR *************************
    
    public Payment_page_7(WebDriver driver) {
    this.driver = driver;
    this.act = new Actions(driver);
    this.elUtil = new Eleutilnew(driver);
    this.configReader = new Config_Reader(); // Initialize Config_Reader

    }
    
//*************************** LOCATOR ***********************
    
    By name_on_cart = By.xpath("//input[@name='name_on_card']");
    By card_no = By.xpath("//input[@name='card_number']");
    By ccv = By.xpath("//input[@placeholder='ex. 311']");
    By month = By.xpath("//input[@placeholder='MM']");
    By year = By.xpath("//input[@placeholder='YYYY']");
    By pay_on_confirmbtn = By.xpath("//button[@id='submit']");
    
//********************** METHOD *********************************
    
    public Orderplaced_page_8 do_fill_card_details() {
        // Entering card holder name
        elUtil.dosendKeys(name_on_cart, configReader.getCardHolderName());
        elUtil.pressTab();
        
        // Entering card number
        elUtil.dosendKeys(card_no, configReader.getCardNumber());
        elUtil.pressTab();
        
        // Entering CVV
        elUtil.dosendKeys(ccv, configReader.getCvvNumber());
        elUtil.pressTab();
        
        // Entering month
        elUtil.dosendKeys(month, configReader.getPaymentMonth());
        elUtil.pressTab();
        
        // Entering year
        elUtil.dosendKeys(year, configReader.getPaymentYear());
        elUtil.pressTab();
        
        // Clicking the pay button
        elUtil.click(pay_on_confirmbtn);
        return new Orderplaced_page_8(driver);
    }
}
