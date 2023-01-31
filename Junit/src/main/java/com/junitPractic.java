package com;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitPractic {
	static WebDriver dr;
	@BeforeClass
	public static void  beforeclass () {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kazih\\Downloads\\chromedriver_win32\\chromedriver.exe ");
		
		 dr = new ChromeDriver();
		
		System.out.println(" Kazi sujon");
		
		
	
	}
	@Before
	public  void before () {
		dr.get("https://www.target.com");
		System.out.println("shamima");
	}
	@AfterClass
	public static void afterclass () {
		//dr.close();
		System.out.println("kazi");
	}
	@After
	public  void after () {
		System.out.println("hanif");
	}
	

}
