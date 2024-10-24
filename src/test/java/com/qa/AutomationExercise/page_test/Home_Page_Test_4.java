package com.qa.AutomationExercise.page_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.AutomationExercise.base_class.Base_test;

public class Home_Page_Test_4 extends Base_test{

	@Test()
	public void verify_Home_page() throws InterruptedException {
		signup.dologin();
		hompgt.scroll_Bluetshirt();
	    Assert.assertEquals(appconst.Home_Page_4,"Automation Exercise", "failed: Redirected to wrong URL after login.");

		
    
	}
}
