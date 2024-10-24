package com.qa.AutomationExercise.page_test;

import org.testng.annotations.Test;

import com.qa.AutomationExercise.base_class.Base_test;

public class Checkout_page_test_6 extends Base_test{

	@Test(priority = 6, enabled = true, description = "add_To_Cart")
	
	public void check_out_test() throws InterruptedException {
		
		signup.doSignup("kimaya vyas", "aafgkl@5.com");
		
	    regpage.fillform();
	    Thread.sleep(2000);
	    
	    accpage.continue_btn();
	    Thread.sleep(18000);
	    
	    hompgt.scroll_BlueTop();
	    hompgt.mouseover_top();
        hompgt.click_Add_To_Cart();
	    Thread.sleep(2000);
	    hompgt.continue_Shopping();
    
        cartpg.add_To_Cart();	
        
        checkot.scroll_down_Placeorder();
        checkot.check_out();
		
	}
}
