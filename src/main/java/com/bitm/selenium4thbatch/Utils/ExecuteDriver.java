package com.bitm.selenium4thbatch.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ExecuteDriver {

	static{
		
		System.setProperty("webdriver.gecko.driver", "E:/Selenium Files/geckodriver-v0.18.0-win64/geckodriver.exe");
	}
	
	public static WebDriver driver = new FirefoxDriver();
	
	@Test
	public void executionTest()
	{
		System.out.println("Driver Executed !");
	}
	
	private ExecuteDriver (){
		
	}
}
