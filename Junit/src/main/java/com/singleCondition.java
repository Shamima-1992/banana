package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class singleCondition {
	WebDriver dr;
	public void m1() {
		
		if(dr.findElement(By.id(" ")).isDisplayed()) {
			System.out.println("Displayed");
			
		}
		else {
			System.out.println("not Display");
			
		}
		
	}
	

}
