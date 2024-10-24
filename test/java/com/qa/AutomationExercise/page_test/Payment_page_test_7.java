package com.qa.AutomationExercise.page_test;

import org.testng.annotations.Test;

import com.qa.AutomationExercise.base_class.Base_test;

public class Payment_page_test_7 extends Base_test{

	@Test(priority = 6, enabled = true, description = "check_out")
	
	public void payment_page_test() throws InterruptedException {
	
		signup.doSignup("kimaya vyas", "dvxfggkl@5.com");
		
	    regpage.fillform();
	    Thread.sleep(2000);
	    
	    accpage.continue_btn();
	    Thread.sleep(2000);
	    
	    hompgt.scroll_BlueTop();
	    hompgt.mouseover_top();
        hompgt.click_Add_To_Cart();
	    Thread.sleep(2000);
	    hompgt.continue_Shopping();
    
        cartpg.add_To_Cart();	
        
        checkot.scroll_down_Placeorder();
        checkot.check_out();
        
        paymtpg.payment_page();
	}

}
