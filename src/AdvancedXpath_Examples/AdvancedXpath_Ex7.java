package AdvancedXpath_Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdvancedXpath_Ex7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","//Users//sunita//Documents//Driver//chromedriver");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://testingmasters.weebly.com/webtables.html");
	    driver.manage().window().maximize();
	    
	  //Click on the checkboxes of the records whose applied days are more than 8 days.
	    
	  List<WebElement> eight = driver.findElements(By.xpath("//table/tbody/tr/td[7][text()>'8']"));	
	 
	  int a= eight.size();
	  System.out.println(a);
	  for(int i=0;i<=a-1;i++)
	  	  {
	  		    List<WebElement> eight1 = driver.findElements(By.xpath("//table/tbody/tr/td[7][text()>'8']/preceding::td[6]/input"));
	  			eight1.get(i).click();
	  		
	  	  }

	}

}
