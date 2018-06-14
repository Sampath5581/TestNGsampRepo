package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class AppTest
{
	@Test
    public void browser()
    {
    	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
    	
    	
    	WebDriver driver=new ChromeDriver();
    	driver.get("http://www.assurant.com/");

    	
        System.out.println( "Hello World!" );
    }
}
