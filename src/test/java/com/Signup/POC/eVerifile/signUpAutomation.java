package com.Signup.POC.eVerifile;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import utility.ExcelUtils;



public class signUpAutomation 
{
			WebDriver driver;
			SignUpPage objSignUpPage;
			Properties prop = new Properties();
			
			
			@BeforeTest
			public void setup() throws IOException
				{

					FileInputStream fis = new FileInputStream(System.getProperty ("user.dir") + "\\env.properties");
					prop.load(fis);
				
					System.setProperty("webdriver.chrome.driver", System.getProperty ("user.dir") + "\\chromedriver.exe");
					driver = new ChromeDriver();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.manage().window().maximize();
					driver.get(prop.getProperty("qaeShortlineURL"));
					
					}
			
			
			@DataProvider
			public Object[][] SignUpData() throws Exception
			{
				Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty ("user.dir") + "//src//main//java//testData//SignUpData.xlsx","Sheet1", 1);
				return (testObjArray);

			}
			

			
			
			
			@Test(dataProvider = "SignUpData")
		    public void testSignUpFirstPage(String FName, String LName, String Email, String Phone, String Password, 
		    		String reEnterPassword, String Answer1, String Answer2, String PromoCode, String VendorCompanyName, 
		    		String VendorTaxId, String VendorCompanyPhoneNumber, String VendorCompanyAddressLine1, String VendorCompanyCountry, 
		    		String VendorCompanyCity, String VendorCompanyState, String VendorCompanyPostalCode, String VendorCardNumber, 
		    		String VendorCardSecurityNumber, String VendorCardExpirationMonth, String VendorCardExpirationYear) 
		    				
		    				throws InterruptedException
		    	
			
			{
		    		
				objSignUpPage = new SignUpPage(driver);
		    		
		    		// First Page Actions
		    		objSignUpPage.clickSignUpLink();
		    		objSignUpPage.enterVendorFirstName(FName);
		    		objSignUpPage.enterVendorLastName(LName);
		    		objSignUpPage.enterVendorEmailAddress(Email);
		    		objSignUpPage.enterVendorPhoneNumber(Phone);
		    		objSignUpPage.enterVendorPassword(Password);
		    		objSignUpPage.reEnterVendorPassword(reEnterPassword);
		    		objSignUpPage.clickVendorFirstSecurityQuesDropDown();
		    		objSignUpPage.clickVendorFirstSecurityQuesSelection();
		    		objSignUpPage.entervendorFirstSecurityQuesAnswer(Answer1);
		    		objSignUpPage.clickVendorSecondSecurityQuesDropDown();
		    		objSignUpPage.clickVendorSecondSecurityQuesSelection();
		    		objSignUpPage.entervendorSecondSecurityQuesAnswer(Answer2);
		    		objSignUpPage.clickSignUpFirstPageNextBtn();
		    		objSignUpPage.clickConfirmPopupOKbtn();
		    		
		    		// Second Page Actions
		    		objSignUpPage.clickFCRAchkbox1();
		    		objSignUpPage.clickFCRAchkbox2();
		    		objSignUpPage.clickFCRAchkbox3();
		    		objSignUpPage.clickFCRAchkbox4();
		    		objSignUpPage.clickSignUpSecondPageNextBtn();
		    		
		    		// Third Page Actions
		    		objSignUpPage.enterVendorPromoCode(PromoCode);
		    		objSignUpPage.clickSignUpThirdPageNextBtn();
		    		
		    		// Fourth Page Actions
		    		objSignUpPage.enterVendorCompanyName(VendorCompanyName);
		    		objSignUpPage.enterVendorTaxId(VendorTaxId);
		    		objSignUpPage.enterVendorCompanyPhoneNo(VendorCompanyPhoneNumber);
		    		objSignUpPage.enterVendorCompanyAddressLine1(VendorCompanyAddressLine1);
		    		objSignUpPage.enterVendorCompanyCountry(VendorCompanyCountry);
		    		objSignUpPage.enterVendorCompanyCity(VendorCompanyCity);
		    		objSignUpPage.enterVendorCompanyState(VendorCompanyState);
		    		objSignUpPage.enterVendorCompanyPostalCode(VendorCompanyPostalCode);
		    		objSignUpPage.clickSignUpFourthPageNextBtn();
		    		
		    		// Fifth Page Actions
		    		objSignUpPage.clickProgramRadioBUtton();
		    		objSignUpPage.clickSignUpFifthPageNextBtn();
		    		
		    		// Sixth Page Actions
		    		objSignUpPage.enterVendorCardNumber(VendorCardNumber);
		    		objSignUpPage.enterVendorCardSecurityNumber(VendorCardSecurityNumber);
		    		objSignUpPage.enterVendorCardExpirationMonth(VendorCardExpirationMonth);
		    		objSignUpPage.enterVendorCardExpirationYear(VendorCardExpirationYear);
		    		objSignUpPage.clickEverifileTermschkbox();
		    		objSignUpPage.clickSignUpSixthPageSubmitBtn();
		    		
		    		// Seventh Page Actions
		    		objSignUpPage.clickSignUpCompleteSubscriptionBtn();
		    	    
		}
	    		

			
			@AfterTest
			public void CloseSelenium() 
			{

				driver.close();

			}

}

