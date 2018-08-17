package vtigercrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Login {
	
	WebDriver driver;
	
	public static void loginclass(WebDriver driver) {

	WebElement username;
	WebElement password;
	WebElement signin;
	
	username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	username.sendKeys("admin");
	
	password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
	password.sendKeys("bH1$Mm3!");
	
	signin = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/form/div[3]/button"));
	signin.click();
	
	}

}
