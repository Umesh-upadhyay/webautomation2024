package com.qa.AutomationExercise.page_test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa.AutomationExercise.Utils.Eleutilnew;
import com.qa.AutomationExercise.base_class.Base_test;

public class Account_Created_Page_Test_3 extends Base_test {
	
	 @Test(priority = 7, enabled = true, description = "fillform")
	public void continue_btn() throws InterruptedException {
	signup.doSignup("kimaya vyas", "CffgGhooBi@h5h.com");
    regpage.fillform();
    Thread.sleep(2000);
    accpage.continue_btn();
    
	}
	
	}
