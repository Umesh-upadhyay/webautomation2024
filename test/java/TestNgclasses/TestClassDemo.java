package TestNgclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClassDemo {

//.........................Before test  Pre -requisite........................//
	
	@BeforeSuite
	public void connectDB() {
	System.out.println("DB connected"); 	
	System.out.println("API connectivity"); 	
	}
	
	@BeforeTest
	public void createUser() {
	System.out.println("user created/ admin/ account creation"); 		
	}
	
	@BeforeClass
	public void openApplication() {
	System.out.println("Application launched successfully"); 		
	}

	@BeforeMethod
	public void login() {
	System.out.println("Application Login/singin"); 		
	}

//.....................Test cases.......................//
	
	@Test(priority = 1, enabled = true)
	public void homePage() {
	System.out.println("dashboard"); 		
	}

	@Test(priority = 2, enabled = true)
	public void registerationPage() {
	System.out.println("registeration"); 		
	}
	
	@Test(priority = 3, enabled = true)
	public void cartPage() {
	System.out.println("Cart"); 		
	}
	
//.....................After methods........................//
	
	@AfterSuite
	public void connectDBA() {
	System.out.println("DB disconnected"); 	
	System.out.println("API connectivity closed"); 	
	}
	
	@AfterTest
	public void createUserA() {
	System.out.println("user created/ admin/ account sucessfully closed"); 		
	}

	@AfterClass
	public void openApplicationA() {
	System.out.println("Application launched successfully closed"); 		
	}

	@AfterMethod
	public void loginA() {
	System.out.println("Application Logout/signout"); 
	}
	
}
