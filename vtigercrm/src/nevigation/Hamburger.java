package nevigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hamburger {
	
WebDriver driver;
	
	
	public static void hamburger(WebDriver driver) {
		
		WebElement ham;
		ham =  driver.findElement(By.xpath("/html/body/div[1]/nav/div[1]/div/div[1]/div/div[1]/div/span"));
		ham.click();
		
	}

}
