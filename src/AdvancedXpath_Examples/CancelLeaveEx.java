package AdvancedXpath_Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CancelLeaveEx {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","//Users//sunita//Documents//Driver//chromedriver");
		ChromeDriver driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://testingmasters.com/hrm/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("TM1234");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();		
		Thread.sleep(2000);		
		//mouse hover using Actions class
		Actions act = new Actions(driver);		
		WebElement leave = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
		act.moveToElement(leave).build().perform();
		
		driver.findElement(By.xpath("//a[@id='menu_leave_viewMyLeaveList']")).click();
		
		String leaveDate = "2020-01-01";
		
		driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[1]/a[text()='"+leaveDate+"']/parent::td/following-sibling::td[5]/a[contains(text(),'Pending Approval')]/parent::td/following-sibling::td[2]/select/option[text()='Cancel']")).click();
		
		
	}

}











