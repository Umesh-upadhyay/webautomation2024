package com.qa.AutomationExercise.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.qa.AutomationExercise.Utils.Eleutilnew;

public class Account_Created_Page_3 {
	
	private WebDriver driver;
	private Eleutilnew elUtil;
	private Actions act;
	private Home_Page_4 hompgt;

	
//*****************CONSTRUCTOR*******************	
	public Account_Created_Page_3(WebDriver driver) {
	this.driver= driver;
    this.act = new Actions(driver);
    elUtil = new Eleutilnew(driver);
	}

//********************LOCATOR*************************************
	
	By accountCreated = By.xpath("//h2[@class=\"title text-center\"]");
	By continuebtn = By.xpath("//a[@class=\"btn btn-primary\"]");
	
//************************ METHOD **********************************8

	public void get_Account_Created_Page_Title() {
	elUtil.getPageTitle();
	}
		
	public void _Account_Created_Url() {
	elUtil.current_Url();
	elUtil.logInfoMessage("Verified account creation.");
	}
	
	public Home_Page_4 accnt_created() {
	elUtil.click(continuebtn);	
	elUtil.logInfoMessage("account successfully created");
	return new Home_Page_4(driver);
	}
}
