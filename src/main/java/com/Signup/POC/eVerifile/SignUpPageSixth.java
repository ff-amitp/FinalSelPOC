package com.Signup.POC.eVerifile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPageSixth {

	WebDriver driver;

	By vendorCardNumber = By.id("x-auto-47-input");
	By vendorCardSecurityNumber = By.id("x-auto-46-input");
	By vendorCardExpirationMonth = By.id("x-auto-52-input");
	By vendorCardExpirationYear = By.id("x-auto-53-input");
	By vendoreVerifileTermschkbox = By.id("x-auto-57");
	By signUpSixthPageSubmitBtn = By.xpath("//td[contains(text(), 'Submit')]");

	public SignUpPageSixth(WebDriver driver) {

		this.driver = driver;

	}

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
		/*WebElement ele = driver.findElement(vendorCardExpirationMonth);
		ele.sendKeys(strVendorCardExpirationMonth);
		Actions action = new Actions(driver);
		action.sendKeys(ele, Keys.TAB).build().perform();*/

		driver.findElement(vendorCardExpirationMonth).sendKeys(strVendorCardExpirationMonth);

	}

	// Enter Vendor Card Expiration Year
	public void enterVendorCardExpirationYear(String strVendorCardExpirationYear) {

		//driver.findElement(vendorCardExpirationYear).sendKeys(strVendorCardExpirationYear);
		
		WebElement ele = driver.findElement(vendorCardExpirationYear);
		ele.sendKeys(strVendorCardExpirationYear);
		Actions action = new Actions(driver);
		action.sendKeys(ele, Keys.TAB).build().perform();
		
		//System.out.println("Waiting for Zip code now ..");  //
	/*	for(int i=0;i<10;i++) {
			try {
				if(driver.findElement(By.id("x-auto-43-input")).getAttribute("value").contains("10001")) {
					break;
				}
			}catch(Exception e) {
				System.out.println("10001 not found .."+i);
			}
		}*/
		
		
		for(int i=0;i<10;i++) {
			try {
				if(driver.findElement(By.id("x-auto-35-input")).getAttribute("value").contains("United States")) {
					break;
				}
			}catch(Exception e) {
				System.out.println("United States not found .."+i);
			}
		}
		
		
	}

	// Click eVerifile Terms and Condition Check Box
	public void clickEverifileTermschkbox() throws InterruptedException {
		//Thread.sleep(5000);
		WebElement element= driver.findElement(By.xpath(".//*[@id='x-auto-57']"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		//driver.findElement(vendoreVerifileTermschkbox).click();

	}
	
	
	// Click On Submit Button on Sixth page of Sign Up
	public void clickSignUpSixthPageSubmitBtn() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(signUpSixthPageSubmitBtn).click();
		//WebElement element = driver.findElement(By.xpath("//td[contains (text(), 'Complete Subscription Process')]"));
		/*try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			System.out.println("Waiting for Element: SignUp");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@class='GMYNAMQCCB']//div[contains(text(), 'Complete Subscription Process')]")));
		}catch(Exception e) {
			System.out.println("Error occured while waiting for element .. it won't affect the execution ");
		}*/
		
		System.out.println("Element Found");
		
		// Thread.sleep(3000);
		
		//Thread.sleep(2000);
		//WebElement element = driver.findElement(By.xpath("//div[@class='GMYNAMQCNS']//td[text()='Submit']"));
		//element.click();
		

	}
	
	
	// Click On Submit Button on Sixth page of Sign Up
/*	public void clickSignUpSixthPageSubmitBtn() {
		WebElement element = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			System.out.println("Waiting for Element: SignUp");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='GMYNAMQCNS']//td[text()='Submit']")));
		}catch(Exception e) {
			System.out.println("Error occured while waiting for element .. it won't affect the execution ");
		}
		System.out.println("Element is visible now ..");
		element = driver.findElement(By.xpath("//div[@class='GMYNAMQCNS']//td[text()='Submit']"));
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", element); 
		
		System.out.println("Checking if its visible :"+element.isDisplayed());
		
		executor.executeScript("arguments[0].click();", element);
		
		List<WebElement> allTables = driver.findElements(By.xpath("//td[@class='buttonbar']//table"));
		System.out.println("total Tables found are : "+allTables.size());
		
		for(WebElement allElements : allTables) {
			System.out.println("Inner HTML is : "+allElements.getAttribute("innerHTML"));
			if(allElements.getAttribute("innerHTML").contains("Submit")) {
				allElements.findElement(By.xpath("//*[text()='Submit']")).click();
			}
		}
		
		System.out.println("Failed to click on Element.. final trials");
		allTables.get(1).findElement(By.xpath("//*[text()='Submit']")).click();
		Actions myAction = new Actions(driver);
		myAction.moveToElement(element).doubleClick().build().perform();
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", element);
		
		//driver.findElement(By.xpath("//td[contains (text(), 'Submit')]")).click();
		//driver.findElement(signUpSixthPageSubmitBtn).click();

	}*/

}
