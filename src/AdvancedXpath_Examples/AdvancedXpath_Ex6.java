package AdvancedXpath_Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdvancedXpath_Ex6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","//Users//sunita//Documents//Driver//chromedriver");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://testingmasters.weebly.com/webtables.html");
	    driver.manage().window().maximize();
	    
	  //Print the Mail Id's of the candidates who have applied for less than or equal to 5 days
	    
	  List<WebElement> five = driver.findElements(By.xpath("//table/tbody/tr/td[7][text()<='5']/preceding::td[3]"));
	  int a= five.size();
	  System.out.println(a);
	  for(int i=0;i<=a-1;i++)
	  {
	  			String s = five.get(i).getText();
	  			System.out.println(s+"        "+ "Printed");
	  		
	  }
	}

}
