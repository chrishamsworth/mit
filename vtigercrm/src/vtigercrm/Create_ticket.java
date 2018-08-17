package vtigercrm;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Create_ticket {
	
	WebDriver driver;
	
	public static void ticket(WebDriver driver) {
		
        WebElement plus;
        WebElement tic;
        WebElement title;
        WebElement save_ticket;
        
		plus = driver.findElement(By.xpath("//*[@id=\"menubar_quickCreate\"]"));
		plus.click();
		
		tic = driver.findElement(By.xpath("/html/body/div[1]/nav/div[1]/div/div[3]/ul/li[1]/div/ul/li[2]/div/div[1]/div[3]/a/span"));
		tic.click();
		
		title = driver.findElement(By.xpath("//*[@id=\"HelpDesk_editView_fieldName_ticket_title\"]"));
		title.sendKeys("VIP");
		title.click();
		
		
		Select priority = new Select (driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div/div[1]/div/table/tbody/tr[2]/td[2]/select")));
		priority.selectByVisibleText("High");
		
		Select assign = new Select (driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div/div[1]/div/table/tbody/tr[1]/td[4]/select")));
		assign.selectByVisibleText("Team Selling");
		
		Select status = new Select (driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div/div[1]/div/table/tbody/tr[2]/td[4]/select")));
		status.selectByVisibleText("Open");
		
		save_ticket = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[3]/center/button[2]"));
		save_ticket.click();
		
		
		
		
		
	}

}
