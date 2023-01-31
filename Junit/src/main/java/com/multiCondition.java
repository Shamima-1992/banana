package com;

import org.junit.Test;
import org.openqa.selenium.By;
public class multiCondition extends junitPractic {
	
	@Test
	public void day() {
		if(dr.getCurrentUrl().equals("target.com")) {
			System.out.println(" nasrin");
		}
		else if (dr.findElement(By.xpath(" ")).isDisplayed()) {
			System.out.println("suha");
	}
		else if (dr.findElement(By.xpath(" ")).isEnabled()) {
			System.out.println("shamima");
			
		}
		
		else {
			System.out.println("sujon");
		}

}
}
