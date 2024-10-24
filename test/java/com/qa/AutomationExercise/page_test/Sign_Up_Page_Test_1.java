package com.qa.AutomationExercise.page_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.AutomationExercise.Utils.Eleutilnew;
import com.qa.AutomationExercise.base_class.Base_test;


public class Sign_Up_Page_Test_1 extends Base_test {

	private Eleutilnew elUtil;		
	
	@Test(priority = 1, enabled = true,
	description = "page title verification")
	public void Page_verification() {
		
	 // Fetching actual title
    
	String expected = "Expected Signup Page Title";  
    String actual =elUtil.getPageTitle();
     
    System.out.println(actual);
    // Assert that the actual and expected titles are equal
    Assert.assertEquals(actual, expected);
	}
	
	//*******************Signup Scenarios**************************
	
	@Test(priority = 2, enabled = true,
	description = "Signup with correct credentials")
	public void Correct_login() {
    System.out.println("Executing Signup Test...");
    signup.doSignup("kia vyas", "Kimya@gmail.com");    
	}

    // Correct signup credentials
    @Test(priority=3, enabled= true,
	description = "Already signup login credentials"		)
    public void Already_Signup_credentials() {
    signup.doSignup("umesh upadhyay", "upadhyayumesh8@gmail.com");
    }
    
    // Already signed up scenario
    @Test(priority=4, enabled= false)
    public void correct_Signup_already_signup_credentials() {
    signup.doSignup("kimaya", "kimayavyas2@gmail.com");    
    }
    
    //*******************Login Scenarios**************************
    
    @Test(priority=5, enabled= true)    
    public void correct_Login_Credentials() {
    signup.login("upadhyayumesh8@gmail.com", "prajautomation");
    }
    
    @Test(priority=6, enabled= true)    
    public void incorrect_Login_Credentials() {
    signup.login("upadhyayumesh8@gmail.com", "prajautomatio");
    }
}
