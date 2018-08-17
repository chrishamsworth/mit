package vtigercrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signout {
	
WebDriver driver;
	
	public static void signoutclass(WebDriver driver) {

		WebElement signout;
		WebElement signou;
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		signout = driver.findElement(By.xpath("/html/body/div[1]/nav/div[1]/div/div[3]/ul/li[5]/div/a/span[1]"));
		signout.click();
		
		signou = driver.findElement(By.xpath("//*[@id=\"menubar_item_right_LBL_SIGN_OUT\"]"));
		signou.click();
		
		driver.quit();
		
	}
}
