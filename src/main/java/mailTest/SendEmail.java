package mailTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SendEmail {


    public static void main( String[] args ) {
    	MailUtility.SendMailForExecutionStarted();
        System.setProperty( "webdriver.chrome.driver", "E:\\FirstFuelAutomationFrameworkArtifacts\\WebDrivers\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.google.co.in/" );
        
        driver.manage().window().maximize();
        driver.close();
        driver.quit();
        MailUtility.SendMail();
        
        
        
    }

}
