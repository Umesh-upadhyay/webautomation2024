package com.qa.AutomationExercise.page_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.AutomationExercise.base_class.Base_test;

public class Checkout_page_test_6 extends Base_test{

	@Test(priority = 6, enabled = true, description = "add_To_Cart")
	
	public void verify_checkout_test() throws InterruptedException {
		
		signup.dologin();
		hompgt.scroll_Bluetshirt();
		cartpg.do_checkout();
		Thread.sleep(2000);
		checkout.scroll_down_Placeorder();
		Thread.sleep(2000);
		checkout.do_click_place_order();
	    Assert.assertEquals(appconst.Checkout_page_test_6,"Automation Exercise - Checkout", "failed: Redirected to wrong URL after login.");

	}
}
