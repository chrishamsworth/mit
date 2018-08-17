package vtigercrm;
import nevigation;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		WebDriver driver;

		System.setProperty("webdriver.ie.driver","d://drivers//IEDriverServer32bit.exe");
        
        driver = new InternetExplorerDriver();
 
        driver.get("http://localhost/vtigercrm/");
 
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        Login.loginclass(driver);
        
        Create_ticket.ticket(driver);
        
        Signout.signoutclass(driver);

	}

}
