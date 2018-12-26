package com.Signup.POC.eVerifile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPageSeventh {

			WebDriver driver;

			By signUpCompleteSubscriptionBtn = By.xpath("//td[@class='GMYNAMQCCB']//div[contains(text(), 'Complete Subscription Process')]");



			public SignUpPageSeventh(WebDriver driver)
				{

					this.driver = driver;

					}
			

			
			//Click On Complete Subscription Process Button on Seventh page of SignUp
			public void clickSignUpCompleteSubscriptionBtn() throws InterruptedException
				{

				//Thread.sleep(5000);
				     driver.findElement(signUpCompleteSubscriptionBtn).isDisplayed();
				     System.out.println("Seventh Page Element is Displayed..");
				     
				  //   Thread.sleep(5000);
					//driver.findElement(signUpCompleteSubscriptionBtn).click();

					}

	
}
