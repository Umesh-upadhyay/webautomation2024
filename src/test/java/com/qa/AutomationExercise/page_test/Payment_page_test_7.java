package com.qa.AutomationExercise.page_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.AutomationExercise.base_class.Base_test;

public class Payment_page_test_7 extends Base_test{

	@Test(priority = 6, enabled = true, description = "check_out")
	
	public void payment_page_test() throws InterruptedException {
	
		signup.dologin();
		hompgt.scroll_Bluetshirt();
		cartpg.do_checkout();
		Thread.sleep(2000);
		checkout.scroll_down_Placeorder();
		Thread.sleep(2000);
		checkout.do_click_place_order();
		Thread.sleep(3000);
		paymtpg.do_fill_card_details();
	    Assert.assertEquals(appconst.Payment_page_test_7,"Automation Exercise - Payment", "failed: Redirected to wrong URL after login.");

	}

}
