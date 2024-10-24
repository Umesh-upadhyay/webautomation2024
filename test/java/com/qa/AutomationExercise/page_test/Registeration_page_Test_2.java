package com.qa.AutomationExercise.page_test;

import org.testng.annotations.Test;
import com.qa.AutomationExercise.base_class.Base_test;

public class Registeration_page_Test_2 extends Base_test {

    @Test(priority = 6, enabled = true, description = "Fill Registration Form")
    public void testFillForm() throws InterruptedException {
        // Assuming 'regpage' is instantiated in the Base_test class
        signup.doSignup("kimaya vyas", "hssh@h55h.com");

        // Now fill the registration form
        regpage.fillform();
            
           
       
        
    }
    
}
