package com.qa.AutomationExercise.page_test;

import org.testng.annotations.Test;

import com.qa.AutomationExercise.base_class.Base_test;

public class Cart_page_test_5 extends Base_test {

	@Test(priority = 6, enabled = true, description = "continue_btn")
	
	public void test_add_To_cart_page() throws InterruptedException {
		
		signup.doSignup("kimaya vyas", "gjhckl@5.com");
		
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
    
	}
}
