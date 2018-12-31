package com.Signup.POC.eVerifile;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage

{

	WebDriver driver;

	// ----------------------------------------------- OBJECTS LIST ------------------------------------------------------ //
	
	// First Screen Objects
	By signUpLink = By.linkText("Sign up");
	By vendorFirstName = By.id("x-auto-3-input");
	By vendorLastName = By.id("x-auto-4-input");
	By vendorEmailAddress = By.id("x-auto-5-input");
	By vendorPhoneNo = By.id("x-auto-6-input");
	By vendorPassword = By.id("x-auto-7-input");
	By vendorConfirmPassword = By.id("x-auto-8-input");
	By vendorFirstSecurityQuesDropDown = By.id("x-auto-1-input");
	By vendorFirstSecurityQuesSelection = By.xpath("//div[contains (text(), 'What was your childhood nickname?')]");
	By vendorFirstSecurityQuesAnswer = By.id("x-auto-9-input");
	By vendorSecondSecurityQuesDropDown = By.id("x-auto-2-input");
	By vendorSecondSecurityQuesSelection = By.xpath("//div[contains (text(), 'In what city does your nearest sibling live?')]");
	By vendorSecondSecurityQuesAnswer = By.id("x-auto-10-input");
	By signUpPageNextBtn = By.xpath("//td[contains (text(), 'Next')]");
	By confirmPopupOKbtn = By.xpath("//div[contains (text(),'OK')]");

	// Second Screen Objects
	By FCRAchkbox1 = By.id("x-auto-12");
	By FCRAchkbox2 = By.id("x-auto-14");
	By FCRAchkbox3 = By.id("x-auto-16");
	By FCRAchkbox4 = By.id("x-auto-18");
	
	// Third Screen Objects
	By PromoCodeField = By.id("x-auto-19-input");
	
	// Fourth Screen Objects
	By vendorCompanyName = By.id("x-auto-29-input");
	By vendorTaxId = By.id("x-auto-30-input");
	By vendorCompanyPhoneNo = By.id("x-auto-31-input");
	By vendorCompanyAddressLine1 = By.id("x-auto-21-input");
	By vendorComapnyCountry = By.id("x-auto-20-input");
	By vendorComapnyCity = By.id("x-auto-23-input");
	By vendorComapnyState = By.id("x-auto-24-input");
	By vendorComapnyPostalCode = By.id("x-auto-28-input");
	
	// Fifth Screen Objects
	By programRadioBUtton = By.id("x-auto-60");
	
	// Sixth Screen Objects
	By vendorCardNumber = By.id("x-auto-47-input");
	By vendorCardSecurityNumber = By.id("x-auto-46-input");
	By vendorCardExpirationMonth = By.id("x-auto-52-input");
	By vendorCardExpirationYear = By.id("x-auto-53-input");
	By vendoreVerifileTermschkbox = By.id("x-auto-57");
	By signUpSixthPageSubmitBtn = By.xpath("//td[contains(text(), 'Submit')]");

	// Seventh Screen Objects
	By signUpCompleteSubscriptionBtn = By.xpath("//td[@class='GMYNAMQCCB']//div[contains(text(), 'Complete Subscription Process')]");

	// --------------------------------------------- OBJECTS LIST ENDS ---------------------------------------------------- //
	
	
	
	

	
	// -------------------------------------------------- METHODS --------------------------------------------------------- //
	
	public SignUpPage(WebDriver driver) {

		this.driver = driver;

	}

	
	// Open Sign Up page
	public void clickSignUpLink() {

		driver.findElement(signUpLink).click();

	}
	
	
	 //------------------------------------------------------------//
	//------------- First Page Methods START ---------------------//
   //------------------------------------------------------------//

	// Enter Vendor First Name
	public void enterVendorFirstName(String strVendorFirstName) {

		driver.findElement(vendorFirstName).sendKeys(strVendorFirstName);

	}

	// Enter Vendor Last Name
	public void enterVendorLastName(String strVendorLastName) {

		driver.findElement(vendorLastName).sendKeys(strVendorLastName);

	}

	// Enter Vendor Email Address
	public void enterVendorEmailAddress(String strVendorEmailAddress) {

		driver.findElement(vendorEmailAddress).sendKeys(strVendorEmailAddress);
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(vendorPhoneNo));

	}

	// Enter Vendor Phone Number
	public void enterVendorPhoneNumber(String strVendorPhoneNumber) {

		driver.findElement(vendorPhoneNo).sendKeys(strVendorPhoneNumber);

	}

	// Enter Vendor Password
	public void enterVendorPassword(String strVendorPassword) {

		driver.findElement(vendorPassword).sendKeys(strVendorPassword);

	}

	// re-Enter Vendor Password
	public void reEnterVendorPassword(String strVendorConfirmPassword) {

		driver.findElement(vendorConfirmPassword).sendKeys(strVendorConfirmPassword);

	}

	// Open First Security Question Drop down
	public void clickVendorFirstSecurityQuesDropDown() {

		driver.findElement(vendorFirstSecurityQuesDropDown).click();
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(vendorFirstSecurityQuesSelection));

	}

	// Select First Security Question from Drop down
	public void clickVendorFirstSecurityQuesSelection() {

		driver.findElement(vendorFirstSecurityQuesSelection).click();
		Actions action = new Actions(driver);
		action.sendKeys(driver.findElement(vendorFirstSecurityQuesDropDown), Keys.TAB).build().perform();

	}

	// Select First Security Question from Drop down
	public void entervendorFirstSecurityQuesAnswer(String strVendorFirstSecurityQuesAnswer) {

		driver.findElement(vendorFirstSecurityQuesAnswer).sendKeys(strVendorFirstSecurityQuesAnswer);

	}

	// Open Second Security Question Drop down
	public void clickVendorSecondSecurityQuesDropDown() {

		driver.findElement(vendorSecondSecurityQuesDropDown).click();
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(vendorSecondSecurityQuesSelection));

	}

	// Select Second Security Question from Drop down
	public void clickVendorSecondSecurityQuesSelection() {

		driver.findElement(vendorSecondSecurityQuesSelection).click();
		Actions action = new Actions(driver);
		action.sendKeys(driver.findElement(vendorSecondSecurityQuesDropDown), Keys.TAB).build().perform();

	}

	// Select Second Security Question from Drop down
	public void entervendorSecondSecurityQuesAnswer(String strVendorSecondSecurityQuesAnswer) {

		driver.findElement(vendorSecondSecurityQuesAnswer).sendKeys(strVendorSecondSecurityQuesAnswer);

	}

	// Click On Next Button on First page of Sign Up
	public void clickSignUpFirstPageNextBtn() {

		driver.findElement(signUpPageNextBtn).click();

	}

	// Click On OK Button on First page of Sign Up Confirmation Popup
	public void clickConfirmPopupOKbtn() {

		driver.findElement(confirmPopupOKbtn).click();

	}

	  //------------------------------------------------------------//
	 // -------------- First Page Methods END -------------------- //
	//------------------------------------------------------------//
	
	
	
	 //------------------------------------------------------------//
	// ------------- Second Page Methods START -------------------//
   //------------------------------------------------------------//
	
	// Click FCRA Check Box 1
	public void clickFCRAchkbox1() {
		driver.findElement(FCRAchkbox1).click();

	}

	// Click FCRA Check Box 2
	public void clickFCRAchkbox2() {
		driver.findElement(FCRAchkbox2).click();

	}

	// Click FCRA Check Box 3
	public void clickFCRAchkbox3() {
		driver.findElement(FCRAchkbox3).click();

	}

	// Click FCRA Check Box 4
	public void clickFCRAchkbox4() {
		driver.findElement(FCRAchkbox4).click();

	}

	// Click On Next Button on First page of Sign Up
	public void clickSignUpSecondPageNextBtn() {

		driver.findElement(signUpPageNextBtn).click();

	}

	 //------------------------------------------------------------//
	//-------------- Second Page Methods END -------------------- //
   //------------------------------------------------------------//
	
	
	
	 //------------------------------------------------------------//
	//------------- Third Page Methods START -------------------- //
   //------------------------------------------------------------//
	
	// Enter Promo Code
	public void enterVendorPromoCode(String strVendorPromoCode) {
		driver.findElement(PromoCodeField).sendKeys(strVendorPromoCode);

	}

	// Click On Next Button on Third page of Sign Up
	public void clickSignUpThirdPageNextBtn() {

		driver.findElement(signUpPageNextBtn).click();

	}

	 //------------------------------------------------------------//
	// -------------- Third Page Methods END -------------------- //
   //------------------------------------------------------------//
	
	
	
	 //------------------------------------------------------------//
	// ------------- Fourth Page Methods START -------------------//
   //------------------------------------------------------------//
	
	// Enter Vendor Company Name
	public void enterVendorCompanyName(String strVendorCompanyName) {

		driver.findElement(vendorCompanyName).sendKeys(strVendorCompanyName);

	}

	// Enter Vendor Tax ID
	public void enterVendorTaxId(String strVendorTaxId) {

		driver.findElement(vendorTaxId).sendKeys(strVendorTaxId);

	}

	// Enter Vendor Company Phone No
	public void enterVendorCompanyPhoneNo(String strVendorCompanyPhoneNo) {

		driver.findElement(vendorCompanyPhoneNo).sendKeys(strVendorCompanyPhoneNo);

	}

	// Enter Vendor Company Address Line 1
	public void enterVendorCompanyAddressLine1(String strVendorCompanyAddressLine1) {

		driver.findElement(vendorCompanyAddressLine1).sendKeys(strVendorCompanyAddressLine1);

	}

	// Enter Vendor Company Country
	public void enterVendorCompanyCountry(String strVendorCompanyCountry) {

		driver.findElement(vendorComapnyCountry).sendKeys(strVendorCompanyCountry);

	}

	// Enter Vendor Company City
	public void enterVendorCompanyCity(String strVendorCompanyCity) {

		driver.findElement(vendorComapnyCity).sendKeys(strVendorCompanyCity);

	}

	// Enter Vendor Company State
	public void enterVendorCompanyState(String strVendorCompanyState) {

		driver.findElement(vendorComapnyState).sendKeys(strVendorCompanyState);

	}

	// Enter Vendor Company Postal Code
	public void enterVendorCompanyPostalCode(String strVendorCompanyPostalCode) {

		driver.findElement(vendorComapnyPostalCode).sendKeys(strVendorCompanyPostalCode);

	}

	// Click On Next Button on Fourth page of Sign Up
	public void clickSignUpFourthPageNextBtn() {

		driver.findElement(signUpPageNextBtn).click();

	}

	 //------------------------------------------------------------//
	// ------------- Fourth Page Methods END -------------------- //
   //------------------------------------------------------------//
	
	
	
	  //------------------------------------------------------------//
	 // ------------- Fifth Page Methods START ------------------- //
	//-----------------------------------------------------------//
	
	// Open Sign Up page
	public void clickProgramRadioBUtton() {

		driver.findElement(programRadioBUtton).click();

	}

	// Click On Next Button on First page of Sign Up
	public void clickSignUpFifthPageNextBtn() {

		driver.findElement(signUpPageNextBtn).click();

	}

	 //------------------------------------------------------------//
	// ------------- Fifth Page Methods END --------------------- //
   //-----------------------------------------------------------//
	
	
	
	
	 //------------------------------------------------------------//
	// ------------- Sixth Page Methods START ------------------- //
   //------------------------------------------------------------//
	
	// Enter Vendor Card Number
	public void enterVendorCardNumber(String strVendorVendorCardNumber) {

		driver.findElement(vendorCardNumber).sendKeys(strVendorVendorCardNumber);

	}

	// Enter Vendor Card Security Number
	public void enterVendorCardSecurityNumber(String strVendorCardSecurityNumber) {

		driver.findElement(vendorCardSecurityNumber).sendKeys(strVendorCardSecurityNumber);

	}

	// Enter Vendor Card Expiration Month
	public void enterVendorCardExpirationMonth(String strVendorCardExpirationMonth) {

		driver.findElement(vendorCardExpirationMonth).sendKeys(strVendorCardExpirationMonth);

	}

	// Enter Vendor Card Expiration Year
	public void enterVendorCardExpirationYear(String strVendorCardExpirationYear) {

		WebElement ele = driver.findElement(vendorCardExpirationYear);
		ele.sendKeys(strVendorCardExpirationYear);
		Actions action = new Actions(driver);
		action.sendKeys(ele, Keys.TAB).build().perform();

		for (int i = 0; i < 10; i++) {
			try {
				if (driver.findElement(By.id("x-auto-35-input")).getAttribute("value").contains("United States")) {
					break;
				}
			} catch (Exception e) {
				System.out.println("United States not found .." + i);
			}
		}

	}

	// Click eVerifile Terms and Condition Check Box
	public void clickEverifileTermschkbox() throws InterruptedException {
		// Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath(".//*[@id='x-auto-57']"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		// driver.findElement(vendoreVerifileTermschkbox).click();

	}

	// Click On Submit Button on Sixth page of Sign Up
	public void clickSignUpSixthPageSubmitBtn() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(signUpSixthPageSubmitBtn).click();

	}
	
	 //------------------------------------------------------------//
	// ------------- Sixth Page Methods END --------------------- //
   //------------------------------------------------------------//
	
	
	
	 //-------------------------------------------------------------//
	// ------------- Seventh Page Methods START ------------------ //
   //------------------------------------------------------------//
	
	// Click On Complete Subscription Process Button on Seventh page of SignUp
	public void clickSignUpCompleteSubscriptionBtn() throws InterruptedException {

		driver.findElement(signUpCompleteSubscriptionBtn).click();

	}

	 //------------------------------------------------------------//
	// ------------- Seventh Page Methods END ------------------- //
   //------------------------------------------------------------//

	// ------------------------------------------------ METHODS ENDS ------------------------------------------------------- //	
	
}
