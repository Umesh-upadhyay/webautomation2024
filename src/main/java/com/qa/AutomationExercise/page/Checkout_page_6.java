package com.qa.AutomationExercise.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.qa.AutomationExercise.Utils.Eleutilnew;

import config.Config_Reader;

public class Checkout_page_6 {

	private WebDriver driver;
    private Actions act;
    private Action action;
    private Eleutilnew elUtil;	
    private Config_Reader reader;
    private Payment_page_7 paymtpg;

//***************************** Constructor ***********************

    public Checkout_page_6(WebDriver driver) {
    this.driver = driver;
    this.act = new Actions(driver);
    this.elUtil = new Eleutilnew(driver);
    }
    
//******************************* LOCATORS **********************
    
    By place_order = By.xpath("//a[normalize-space()='Place Order']");
    
//************************* METHODS *********************************    
    
    public void scroll_down_Placeorder() throws InterruptedException {
	elUtil.scroll_Down(place_order);
    }
    public Payment_page_7 do_click_place_order() {
	elUtil.click(place_order);
	return new Payment_page_7(driver);
    }
    

}
