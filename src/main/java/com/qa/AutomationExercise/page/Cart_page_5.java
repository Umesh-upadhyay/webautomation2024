package com.qa.AutomationExercise.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.qa.AutomationExercise.Utils.Eleutilnew;

import config.Config_Reader;

public class Cart_page_5 {

	private WebDriver driver;
    private Actions act;
    private Action action;
    private Eleutilnew elUtil;	
    private Config_Reader reader;
    private Checkout_page_6 checkot;

//***************************** Constructor ***********************
    
    public Cart_page_5(WebDriver driver) {
    this.driver = driver;
    this.act = new Actions(driver);
    this.elUtil = new Eleutilnew(driver);
   
    }
    
//*****************************LOACTORS****************************
    
    By cart_pg = By.xpath("//a[normalize-space()='Cart']");
    By proceed_to_check = By.xpath("//a[normalize-space()='Proceed To Checkout']");
    
//*********************** METHOD *****************************    
    
    
    public Checkout_page_6 do_checkout() throws InterruptedException {
    elUtil.click(cart_pg);
    Thread.sleep(2000);
    elUtil.click(proceed_to_check);
    return new Checkout_page_6(driver);
    }
    
}
