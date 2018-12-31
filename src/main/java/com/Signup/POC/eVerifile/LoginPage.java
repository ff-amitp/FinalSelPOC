package com.Signup.POC.eVerifile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPage {

	WebDriver driver;
	
	
		// Login Page Objects Objects
		By userNameInputBox = By.id("j_username");
		By passwordInputBox = By.id("j_password");
		By submitBtn = By.id("submitBtn");
		By logoutLink = By.xpath(".//*[@id='logout']");
		
			
		
		
		public LoginPage (WebDriver driver) {

			this.driver = driver;

		}
		
		
		 //------------------------------------------------------------//
		//------------- Login Page Methods START ---------------------//
	   //------------------------------------------------------------//

		// Enter User Name
		public void enterVendorUserName(String strUsertName) {

			driver.findElement(userNameInputBox).sendKeys(strUsertName);

		}

		// Enter Password
		public void enterVendorPassword(String strVendorPassword) {

			driver.findElement(passwordInputBox).sendKeys(strVendorPassword);

		}
		
		
		// Click on Submit Button
		public void clickSubmitButton() {

			driver.findElement(submitBtn).click();
			WebDriverWait wait = new WebDriverWait(driver, 4);
			wait.until(ExpectedConditions.visibilityOfElementLocated(logoutLink));

		}
		
		// Click on Logout Button
		public void clickLogoutLink () {

			driver.findElement(logoutLink).click();
			WebDriverWait wait = new WebDriverWait(driver, 4);
			wait.until(ExpectedConditions.visibilityOfElementLocated(submitBtn));

		}
		
}
