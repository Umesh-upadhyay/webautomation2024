package com.qa.AutomationExercise.page_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.AutomationExercise.base_class.Base_test;

public class Registeration_page_Test_2 extends Base_test {
    // Test to fill the registration form after a successful signup
    
	 @Test(priority = 2, enabled = true)
	public void Verify_registeration() {
	signup.dosignup();
	regpage.fillform();
    Assert.assertEquals(appconst.Registeration_Page_Get_Title,"Automation Exercise - Signup / Login", "failed: Redirected to wrong URL after login.");
    
	}
	 
	
	
}
