package com.qa.AutomationExercise.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.qa.AutomationExercise.Utils.Eleutilnew;

public class Home_Page_4 {

	private WebDriver driver;
	private Eleutilnew elUtil;	
	private Actions act;
    private Action action;
    private Cart_page_5 cartpg;


//******************CONSTRUCTOR************************
		
	public Home_Page_4(WebDriver driver) {
	this.driver= driver;
	elUtil = new Eleutilnew(driver);
    this.act = new Actions(driver);

	}
	
//**********************LOCATORS****************************
	
	By blue_Tshirt = By.xpath("//div[3]//div[1]//div[2]//ul[1]//li[1]//a[1]");
	By add_crt = By.xpath("//button[normalize-space()='Add to cart']");
	By view_crt = By.xpath("//a[normalize-space()='Cart']");
	
	By cont_shopping = By.xpath("//button[normalize-space()='Continue Shopping']");
	By logout = By.xpath("//a[normalize-space()='Logout']");
	By dlte = By.xpath("//a[normalize-space()='Delete Account']");
    By continue_delete_btn = By.xpath("//a[normalize-space()='Continue']");
    
	  
//*************************METHODS*************************

    public Home_Page_4 scroll_BlueTop() throws InterruptedException {
	elUtil.scroll_Down(blue_Tshirt);
	return scroll_BlueTop();

    }
    
//	public void mouseover_top() {
//	elUtil.mouseHover(blue_top);
//	}
	
	public void click_Add_To_Cart() {
	elUtil.click(add_crt);
	}
	
	public Cart_page_5 continue_Shopping() {
	elUtil.click(cont_shopping);
	return new Cart_page_5(driver);
	}
	
	public void logout_page() {
	elUtil.click(logout);
    }
	
	public void delete_page() {
	elUtil.click(dlte);
	elUtil.click(continue_delete_btn);
    }
	
	public Cart_page_5 scroll_Bluetshirt() throws InterruptedException {
		elUtil.scroll_Down(blue_Tshirt);
	    
	    // Click on the 'Blue T-shirt' element
	    elUtil.click(blue_Tshirt);
	    elUtil.logInfoMessage("Clicked on the 'Blue T-shirt' element.");
	    Thread.sleep(2000);
	    
	    // Click on 'Add to Cart'
	    elUtil.click(add_crt);
	    elUtil.logInfoMessage("Clicked on 'Add to Cart'.");
	    Thread.sleep(2000);

	    // Click on 'Continue Shopping'
	    elUtil.click(cont_shopping);
	    Thread.sleep(2000);

	    
	    // Click on 'View Cart'
	  //  elUtil.click(view_crt);
	  //  elUtil.logInfoMessage("Clicked on 'View Cart' to review items.");
	    return new Cart_page_5(driver);

	}
	
}





