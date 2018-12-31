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



public class LoginLogoutAutomation {

				WebDriver driver;
				LoginPage objLoginPage;
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
				public Object[][] LoginData() throws Exception
				{
					Object[][] loginDataArray = ExcelUtils.getLoginDataArray(System.getProperty ("user.dir") + "//src//main//java//testData//SignUpData.xlsx","Sheet2", 1);
					return (loginDataArray);

				}
					

				@Test(dataProvider = "LoginData")
			    public void testLoginPage(String UserName, String Password) 
			 
				{
			    		
					objLoginPage = new LoginPage(driver);
					
					// Login and Logout flow
					objLoginPage.enterVendorUserName(UserName);
					objLoginPage.enterVendorPassword(Password);
					objLoginPage.clickSubmitButton();
					objLoginPage.clickLogoutLink();				
				}	
				
				
				
				@AfterTest
				public void CloseSelenium() 
				{

					driver.close();

				}

	}


	
