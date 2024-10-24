package com.qa.AutomationExercise.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.qa.AutomationExercise.Utils.Eleutilnew;

import config.Config_Reader;

public class Orderplaced_page_8 {

	private WebDriver driver;
    private Actions act;
    private Action action;
    private Eleutilnew elUtil;	
    private Config_Reader reader;
    
//************************ CONSTRUCTOR *************************
    
    public Orderplaced_page_8(WebDriver driver) {
        this.driver = driver;
        this.act = new Actions(driver);
        this.elUtil = new Eleutilnew(driver);
        }
    
//***************************** LOCATORS *************************
    
    By download_invoice = By.xpath("//a[normalize-space()='Download Invoice']");
    By continue_btn = By.xpath("//a[normalize-space()='Continue']");
    
//*************************** METHOD *********************************
    
    public void do_order_placed() {
	elUtil.click(download_invoice);
	elUtil.click(continue_btn);
    }
    
}
