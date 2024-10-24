package com.qa.AutomationExercise.Constant;

import org.openqa.selenium.WebDriver;

import com.qa.AutomationExercise.Utils.Eleutilnew;

public class App_constant   {
    
	private WebDriver driver;

	public App_constant(WebDriver driver) {
    this.driver = driver;
	 }
//**********************Time_Constant***************************************

public static final int Default_MIN_Time_Out  = 3;
public static final int Default_MID_Time_Out  = 10;
public static final int Default_MAX_Time_Out  = 60;

//************************* Page Title ***************************************

public 	final String Login_Page_Get_Title = "Automation Exercise - Signup";
public  final String Registeration_Page_Get_Title = "Automation Exercise - Signup / Login";
public  final String Account_Created_Page_Get_Title ="Automation Exercise - Account Created";
public  final String Home_Page_4 = "Automation Exercise";
public  final String Cart_page_test_5 = "Automation Exercise - Checkout";
public  final String Checkout_page_test_6 = "Automation Exercise - Checkout";
public  final String Payment_page_test_7 = "Automation Exercise - Payment";
public  final String Orderplaced_page_test_8 = "Automation Exercise - Order Placed";


//************************ Page URL ***************************************

public static final String Fractional_Login_Page1_url = ".com/login";
public static final String Fractional_Registeration_Page2_url = ".com/signup";
public static final String Fractional_Account_Created_Page3_url = ".com/account_created";
public static final String Fractional_Home_Page_4_url = ".com";
public static final String Fractional_Cart_page_test_5_url = ".com/view_cart";
public static final String Fractional_Checkout_page_test_6_url = ".com/view_cart";
public static final String Fractional_Payment_page_test_7_url = ".com/payment";
public static final String Orderplaced_page_test_8_url = ".com/payment_done/400";



}
