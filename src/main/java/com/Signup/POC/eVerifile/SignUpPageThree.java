package com.Signup.POC.eVerifile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPageThree 

	{

			WebDriver driver;

			By PromoCodeField = By.id("x-auto-19-input");
			By signUpThirdPageNextBtn = By.xpath("//td[contains (text(), 'Next')]");
	


	public SignUpPageThree(WebDriver driver)
		{

			this.driver = driver;

			}


		//Enter Promo Code
	public void enterVendorPromoCode(String strVendorPromoCode)
		{
			driver.findElement(PromoCodeField).sendKeys(strVendorPromoCode);

			}

	
		//Click On Next Button on Third page of Sign Up
    public void clickSignUpThirdPageNextBtn()
    	{

        	driver.findElement(signUpThirdPageNextBtn).click();

    		}
	
}
