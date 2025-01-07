package com.qa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class KK {
//	String kk = "the umesh";
//	String kks = "the sumesh";
	 public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.amazon.in");
	List<WebElement> Linklist = driver.findElements(By.tagName("a"));
	int totalinks = Linklist.size();
	System.out.println(totalinks);
	
	int count = 0;
	
	for(WebElement e : Linklist) {
	String Linklist2 = e.getText();
	String URL = e.getAttribute("href");
	count ++;
	System.out.println(Linklist2 + "======:" + URL);
	System.out.println(Linklist2 + "======:" + URL);
	System.out.println(Linklist2 + "=====sds=:" + URL);
	m.out.println(Linklist2 + "======:" + URL);
	git remote add origin https://github.com/Umesh-upadhyay/Framework2024.git
	}
	
	}
	}
	
	
	

