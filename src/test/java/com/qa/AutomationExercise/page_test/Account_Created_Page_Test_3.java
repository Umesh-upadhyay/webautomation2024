package com.qa.AutomationExercise.page_test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.AutomationExercise.base_class.Base_test;

public class Account_Created_Page_Test_3 extends Base_test {
	
	@Test (priority = 3, enabled = true)
	public void verify_account_creation() {
		signup.dosignup();
		regpage.fillform();
		accpage.accnt_created();
	    Assert.assertEquals(appconst.Account_Created_Page_Get_Title,"Automation Exercise - Account Created", "failed: Redirected to wrong URL after login.");
	}	
	}
	
