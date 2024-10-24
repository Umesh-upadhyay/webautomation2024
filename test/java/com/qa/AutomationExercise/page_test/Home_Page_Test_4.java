package com.qa.AutomationExercise.page_test;

import org.testng.annotations.Test;

import com.qa.AutomationExercise.base_class.Base_test;

public class Home_Page_Test_4 extends Base_test{

	@Test(priority = 6, enabled = true, description = "continue_btn")
	public void add_To_Cart() throws InterruptedException {
	signup.doSignup("kimaya vyas", "abbsgckl@5.com");
	
    regpage.fillform();
    Thread.sleep(2000);
    
    accpage.continue_btn();
    Thread.sleep(2000);
    
    hompgt.scroll_BlueTop();
    hompgt.mouseover_top();
  
    hompgt.click_Add_To_Cart();
    Thread.sleep(2000);

    hompgt.continue_Shopping();
    
    hompgt.logout_page();
    
    hompgt.delete_page();
    
	}
}
