package com.Signup.POC.eVerifile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SignUpPageSecond 

	{

		WebDriver driver;

		By FCRAchkbox1 = By.id("x-auto-12");
		By FCRAchkbox2 = By.id("x-auto-14");
		By FCRAchkbox3 = By.id("x-auto-16");
		By FCRAchkbox4 = By.id("x-auto-18");
		By signUpSecondPageNextBtn = By.xpath("//td[contains (text(), 'Next')]");
		
	

		public SignUpPageSecond(WebDriver driver)
			{

				this.driver = driver;

				}


			//Click FCRA Check Box 1
		public void clickFCRAchkbox1()
			{
				driver.findElement(FCRAchkbox1).click();

				}


			//Click FCRA Check Box 2
		public void clickFCRAchkbox2()
			{
				driver.findElement(FCRAchkbox2).click();
				
				}


			//Click FCRA Check Box 3
		public void clickFCRAchkbox3()
			{
				driver.findElement(FCRAchkbox3).click();
				
				}


			//Click FCRA Check Box 4
		public void clickFCRAchkbox4()
			{
				driver.findElement(FCRAchkbox4).click();

				}
		
		//Click On Next Button on First page of Sign Up
	    public void clickSignUpSecondPageNextBtn()
	    	{

	        	driver.findElement(signUpSecondPageNextBtn).click();

	    		}
	
	
	}
