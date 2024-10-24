package com.qa.AutomationExercise.page_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.AutomationExercise.base_class.Base_test;

public class Sign_Up_Page_Test_1 extends Base_test {

    @Test(priority =1)
    public void Verify_Signup() {
        signup.dosignup();  
        Assert.assertEquals(appconst.Registeration_Page_Get_Title, "Automation Exercise - Signup / Login", "Signup failed: Redirected to wrong URL after signup.");
    }

    @Test(priority =2)
    public void Verify_Login() throws InterruptedException {
        signup.dologin(); 
        Assert.assertEquals(appconst.Home_Page_4, "Automation Exercise", "Login failed: Redirected to wrong URL after login.");
    }

    @Test( enabled = true, dependsOnMethods = {"demoT4"})
    public void demoT3() {
        System.out.println("demoT3 executed first");
    }

    @Test( enabled = true)
    public void demoT4() {
        System.out.println("T4 executed after T3");
    }

   
    }

