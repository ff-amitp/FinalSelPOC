package com.Signup.POC.eVerifile;

import com.Signup.POC.eVerifile.SignUpPageFirst;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class testSignUpAutomationTest {

	WebDriver driver;
	SignUpPageFirst objSignUpFirstPage;
	SignUpPageSecond objSignUpSecondPage;
	SignUpPageThree objSignUpThirdPage;
	SignUpPageFour objSignUpFourthPage;
	SignUpPageFifth objSignUpFifthPage;
	SignUpPageSixth objSignUpSixthPage;
	SignUpPageSeventh objSignUpSeventhPage;
	
	
	@BeforeTest
	public void setup()
		{

			System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Setups\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			driver.get("https://eshortline-eworkforce-qa.everifile.com/renovo/");
			driver.manage().window().maximize();

			}

	
    @Test(priority=0)
    public void testSignUpFirstPage()
    	{
    		objSignUpFirstPage = new SignUpPageFirst(driver);
    		
    		objSignUpFirstPage.clickSignUpLink();
    		objSignUpFirstPage.enterVendorFirstName("John");
    		objSignUpFirstPage.enterVendorLastName("D");
    		objSignUpFirstPage.enterVendorEmailAddress("johnd@google1.com");
    		objSignUpFirstPage.enterVendorPhoneNumber("4564564560");
    		objSignUpFirstPage.enterVendorPassword("Test#123");
    		objSignUpFirstPage.reEnterVendorPassword("Test#123");
    		objSignUpFirstPage.clickVendorFirstSecurityQuesDropDown();
    		objSignUpFirstPage.clickVendorFirstSecurityQuesSelection();
    		objSignUpFirstPage.entervendorFirstSecurityQuesAnswer("rose");
    		objSignUpFirstPage.clickVendorSecondSecurityQuesDropDown();
    		objSignUpFirstPage.clickVendorSecondSecurityQuesSelection();
    		objSignUpFirstPage.entervendorSecondSecurityQuesAnswer("rose111");
    		objSignUpFirstPage.clickSignUpFirstPageNextBtn();
    		objSignUpFirstPage.clickConfirmPopupOKbtn();
    		
    	}
    
    @Test(priority=1)
    public void testSignUpSecondPage()
    	{
    		objSignUpSecondPage = new SignUpPageSecond(driver);
    		
    		objSignUpSecondPage.clickFCRAchkbox1();
    		objSignUpSecondPage.clickFCRAchkbox2();
    		objSignUpSecondPage.clickFCRAchkbox3();
    		objSignUpSecondPage.clickFCRAchkbox4();
    		objSignUpSecondPage.clickSignUpSecondPageNextBtn();
    		
    	}
    
    
    @Test(priority=2)
    public void testSignUpThirdPage()
    	{
    		objSignUpThirdPage = new SignUpPageThree(driver);
    		objSignUpThirdPage.enterVendorPromoCode("ALTON&SOUTHERN");
    		objSignUpThirdPage.clickSignUpThirdPageNextBtn();
    		
    	}
    
    
    @Test(priority=3)
    public void testSignUpFourthPage()
    	{
    		objSignUpFourthPage = new SignUpPageFour(driver);
    		
    		objSignUpFourthPage.enterVendorCompanyName("John Company");
    		objSignUpFourthPage.enterVendorTaxId("100");
    		objSignUpFourthPage.enterVendorCompanyPhoneNo("4564564560");
    		objSignUpFourthPage.enterVendorCompanyAddressLine1("Sr No");
    		objSignUpFourthPage.enterVendorCompanyCountry("United States");
    		objSignUpFourthPage.enterVendorCompanyCity("New York");
    		objSignUpFourthPage.enterVendorCompanyState("NY");
    		objSignUpFourthPage.enterVendorCompanyPostalCode("10001");
    		objSignUpFourthPage.clickSignUpFourthPageNextBtn();
    		
    	}
    
    @Test(priority=4)
    public void testSignUpFifthPage()
    	{
    		objSignUpFifthPage = new SignUpPageFifth(driver);
    		
    		objSignUpFifthPage.clickProgramRadioBUtton();
    		objSignUpFifthPage.clickSignUpFifthPageNextBtn();
    		
    	}
    
    
    @Test(priority=5)
    public void testSignUpSixthPage() throws InterruptedException
    	{
    		objSignUpSixthPage = new SignUpPageSixth(driver);
    		
    		objSignUpSixthPage.enterVendorCardNumber("4111111111111111");
    		objSignUpSixthPage.enterVendorCardSecurityNumber("1111");
    		objSignUpSixthPage.enterVendorCardExpirationMonth("12");
    		objSignUpSixthPage.enterVendorCardExpirationYear("2021");
    		objSignUpSixthPage.clickEverifileTermschkbox();
    		objSignUpSixthPage.clickSignUpSixthPageSubmitBtn();
    	    
    	}
    
    @Test(priority=6)
    public void testSignUpSeventhPage() throws InterruptedException
    	{
    		objSignUpSeventhPage = new SignUpPageSeventh(driver);
    		objSignUpSeventhPage.clickSignUpCompleteSubscriptionBtn();
    		
    	}
	
    
 /*   @AfterTest
    public void shutDownSelenium() {
        driver.quit();
    }*/
    
}


