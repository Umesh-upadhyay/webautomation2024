package com.qa.AutomationExercise.page_test;

import org.testng.annotations.Test;

import com.qa.AutomationExercise.base_class.Base_test;

public class Orderplaced_page_test_8 extends Base_test {

	@Test(priority = 6, enabled = true, description = "payment_page")
	
	public void order_place_test() throws InterruptedException {
	
		signup.doSignup("kimaya vyas", "zzaa@5.com");
		
	    regpage.fillform();
	    Thread.sleep(2000);
	    
	    accpage.continue_btn();
	    Thread.sleep(2000);
	    
	    hompgt.mouseover_top();
        hompgt.click_Add_To_Cart();
	    Thread.sleep(2000);
	    hompgt.continue_Shopping();
    
        cartpg.add_To_Cart();	
        
        checkot.check_out();
        
        paymtpg.payment_page();
        
        orderplc.order_placed();
	}
	}
