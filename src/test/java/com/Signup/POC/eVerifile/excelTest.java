package com.Signup.POC.eVerifile;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mailTest.MailUtility;

import org.testng.annotations.DataProvider;
import utility.ExcelUtils;



public class excelTest 
{
	

			WebDriver driver;
			
			SignUpPageFirst objSignUpFirstPage;
	
			
			@BeforeTest
			public void setup()
				{

					MailUtility.SendMailForExecutionStarted();
					System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Setups\\Drivers\\chromedriver_win32\\chromedriver.exe");
					driver = new ChromeDriver();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.manage().window().maximize();
					driver.get("https://eshortline-eworkforce-qa.everifile.com/renovo/");
					MailUtility.SendMail();
					
					
					/*MailUtility.SendMailForExecutionStarted();
			        System.setProperty( "webdriver.chrome.driver", "E:\\FirstFuelAutomationFrameworkArtifacts\\WebDrivers\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe" );
			        WebDriver driver = new ChromeDriver();
			        driver.get( "https://www.google.co.in/" );
			        
			        driver.manage().window().maximize();
			        driver.close();
			        driver.quit();
			        MailUtility.SendMail();
			        */
					

					}
			
			
			@DataProvider
			public Object[][] Authentication() throws Exception
			{

				Object[][] testObjArray = ExcelUtils.getTableArray("D://Automation//GitWorkspace//eVerifile//src//main//java//testData//SignUpData.xlsx","Sheet1", 1);
				return (testObjArray);

			}
			

			
			
			
			@Test(dataProvider = "Authentication")
		    public void testSignUpFirstPage(String FName, String LName, String Email, String Phone, String Password, 
		    		String reEnterPassword, String Answer1, String Answer2, String PromoCode, String VendorCompanyName, 
		    		String VendorTaxId, String VendorCompanyPhoneNumber, String VendorCompanyAddressLine1, String VendorCompanyCountry, 
		    		String VendorCompanyCity, String VendorCompanyState, String VendorCompanyPostalCode, String VendorCardNumber, 
		    		String VendorCardSecurityNumber, String VendorCardExpirationMonth, String VendorCardExpirationYear) 
		    				
		    				throws InterruptedException
		    	
			
			{
		    		objSignUpFirstPage = new SignUpPageFirst(driver);
		    		
		    		
		    		// First Page
		    		objSignUpFirstPage.clickSignUpLink();
		    		objSignUpFirstPage.enterVendorFirstName(FName);
		    		objSignUpFirstPage.enterVendorLastName(LName);
		    		objSignUpFirstPage.enterVendorEmailAddress(Email);
		    		objSignUpFirstPage.enterVendorPhoneNumber(Phone);
		    		objSignUpFirstPage.enterVendorPassword(Password);
		    		objSignUpFirstPage.reEnterVendorPassword(reEnterPassword);
		    		objSignUpFirstPage.clickVendorFirstSecurityQuesDropDown();
		    		objSignUpFirstPage.clickVendorFirstSecurityQuesSelection();
		    		objSignUpFirstPage.entervendorFirstSecurityQuesAnswer(Answer1);
		    		objSignUpFirstPage.clickVendorSecondSecurityQuesDropDown();
		    		objSignUpFirstPage.clickVendorSecondSecurityQuesSelection();
		    		objSignUpFirstPage.entervendorSecondSecurityQuesAnswer(Answer2);
		    		objSignUpFirstPage.clickSignUpFirstPageNextBtn();
		    		objSignUpFirstPage.clickConfirmPopupOKbtn();
		    		
		    		
		    		
		    		// Second Page
		    		objSignUpFirstPage.clickFCRAchkbox1();
		    		objSignUpFirstPage.clickFCRAchkbox2();
		    		objSignUpFirstPage.clickFCRAchkbox3();
		    		objSignUpFirstPage.clickFCRAchkbox4();
		    		objSignUpFirstPage.clickSignUpSecondPageNextBtn();
		    		
		    		
		    		// Third Page
		    		objSignUpFirstPage.enterVendorPromoCode(PromoCode);
		    		objSignUpFirstPage.clickSignUpThirdPageNextBtn();
		    		
		    		
		    		
		    		// Fourth Page
		    		objSignUpFirstPage.enterVendorCompanyName(VendorCompanyName);
		    		objSignUpFirstPage.enterVendorTaxId(VendorTaxId);
		    		objSignUpFirstPage.enterVendorCompanyPhoneNo(VendorCompanyPhoneNumber);
		    		objSignUpFirstPage.enterVendorCompanyAddressLine1(VendorCompanyAddressLine1);
		    		objSignUpFirstPage.enterVendorCompanyCountry(VendorCompanyCountry);
		    		objSignUpFirstPage.enterVendorCompanyCity(VendorCompanyCity);
		    		objSignUpFirstPage.enterVendorCompanyState(VendorCompanyState);
		    		objSignUpFirstPage.enterVendorCompanyPostalCode(VendorCompanyPostalCode);
		    		objSignUpFirstPage.clickSignUpFourthPageNextBtn();
		    		
		    		
		    		// Fifth Page
		    		objSignUpFirstPage.clickProgramRadioBUtton();
		    		objSignUpFirstPage.clickSignUpFifthPageNextBtn();
		    		
		    		
		    		// Sixth Page
		    		objSignUpFirstPage.enterVendorCardNumber(VendorCardNumber);
		    		objSignUpFirstPage.enterVendorCardSecurityNumber(VendorCardSecurityNumber);
		    		objSignUpFirstPage.enterVendorCardExpirationMonth(VendorCardExpirationMonth);
		    		objSignUpFirstPage.enterVendorCardExpirationYear(VendorCardExpirationYear);
		    		objSignUpFirstPage.clickEverifileTermschkbox();
		    		objSignUpFirstPage.clickSignUpSixthPageSubmitBtn();
		    		
		    		
		    		// Seventh Page
		    		objSignUpFirstPage.clickSignUpCompleteSubscriptionBtn();
		    	    
		    	}
	    		

			
			@AfterTest
			public void CloseSelenium() 
			{

				driver.close();

			}

}

