package com.qa.AutomationExercise.page_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.AutomationExercise.base_class.Base_test;

public class Orderplaced_page_test_8 extends Base_test {

	@Test(priority = 6, enabled = true, description = "payment_page")
	
	public void order_place_test() throws InterruptedException {
	
		signup.dologin();
		hompgt.scroll_Bluetshirt();
		cartpg.do_checkout();
		Thread.sleep(2000);
		checkout.scroll_down_Placeorder();
		Thread.sleep(2000);
		checkout.do_click_place_order();
		Thread.sleep(3000);
		paymtpg.do_fill_card_details();
		Thread.sleep(2000);
		orderplc.do_order_placed();
		Thread.sleep(3000);
		hompgt.delete_page();
	    Assert.assertEquals(appconst.Orderplaced_page_test_8,"Automation Exercise - Order Placed", "failed: Redirected to wrong URL after login.");


	}
	}
