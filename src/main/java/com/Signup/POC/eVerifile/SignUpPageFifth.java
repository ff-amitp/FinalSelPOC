package com.Signup.POC.eVerifile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPageFifth {

	WebDriver driver;

	By programRadioBUtton = By.id("x-auto-60");
	By signUpFifthPageNextBtn = By.xpath("//td[contains (text(), 'Next')]");
	

public SignUpPageFifth(WebDriver driver)
{

	this.driver = driver;

}



// Open Sign Up page
public void clickProgramRadioBUtton()
{
	
	driver.findElement(programRadioBUtton).click();

	}



//Click On Next Button on First page of Sign Up
public void clickSignUpFifthPageNextBtn()
{

	driver.findElement(signUpFifthPageNextBtn).click();

	}



	
}
