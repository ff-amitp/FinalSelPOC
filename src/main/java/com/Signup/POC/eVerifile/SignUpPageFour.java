package com.Signup.POC.eVerifile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPageFour {


		WebDriver driver;

		By vendorCompanyName = By.id("x-auto-29-input");
		By vendorTaxId = By.id("x-auto-30-input");
		By vendorCompanyPhoneNo = By.id("x-auto-31-input");
		By vendorCompanyAddressLine1 = By.id("x-auto-21-input");
		By vendorComapnyCountry = By.id("x-auto-20-input");
		By vendorComapnyCity = By.id("x-auto-23-input");
		By vendorComapnyState = By.id("x-auto-24-input");
		By vendorComapnyPostalCode = By.id("x-auto-28-input");
		By signUpFourthPageNextBtn = By.xpath("//td[contains (text(), 'Next')]");
		
	

public SignUpPageFour(WebDriver driver)
	{

    	this.driver = driver;

	}


	//Enter Vendor Company Name
public void enterVendorCompanyName(String strVendorCompanyName)
	{

    	driver.findElement(vendorCompanyName).sendKeys(strVendorCompanyName);

		}


	//Enter Vendor Tax ID
public void enterVendorTaxId(String strVendorTaxId)
	{

    	driver.findElement(vendorTaxId).sendKeys(strVendorTaxId);

		}


	//Enter Vendor Company Phone No
public void enterVendorCompanyPhoneNo(String strVendorCompanyPhoneNo)
	{

    	driver.findElement(vendorCompanyPhoneNo).sendKeys(strVendorCompanyPhoneNo);

		}


	//Enter Vendor Company Address Line 1
public void enterVendorCompanyAddressLine1(String strVendorCompanyAddressLine1)
	{

    	driver.findElement(vendorCompanyAddressLine1).sendKeys(strVendorCompanyAddressLine1);

		}


	//Enter Vendor Company Country
public void enterVendorCompanyCountry(String strVendorCompanyCountry)
	{

    	driver.findElement(vendorComapnyCountry).sendKeys(strVendorCompanyCountry);

		}


	//Enter Vendor Company City
public void enterVendorCompanyCity(String strVendorCompanyCity)
	{

    	driver.findElement(vendorComapnyCity).sendKeys(strVendorCompanyCity);

		}


//Enter Vendor Company State
public void enterVendorCompanyState(String strVendorCompanyState)
{

	driver.findElement(vendorComapnyState).sendKeys(strVendorCompanyState);

	}


//Enter Vendor Company Postal Code
public void enterVendorCompanyPostalCode(String strVendorCompanyPostalCode)
{

	driver.findElement(vendorComapnyPostalCode).sendKeys(strVendorCompanyPostalCode);

	}


	//Click On Next Button on Fourth page of Sign Up
public void clickSignUpFourthPageNextBtn()
	{

    	driver.findElement(signUpFourthPageNextBtn).click();

		}


}
	
	
