package com.qa.AutomationExercise.page_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.AutomationExercise.base_class.Base_test;

public class Cart_page_test_5 extends Base_test {

	@Test()
	
	public void verify_cart_page() throws InterruptedException {
		signup.dologin();
		hompgt.scroll_Bluetshirt();
		cartpg.do_checkout();
	    Assert.assertEquals(appconst.Cart_page_test_5,"Automation Exercise - Checkout", "failed: Redirected to wrong URL.");

	}
}
