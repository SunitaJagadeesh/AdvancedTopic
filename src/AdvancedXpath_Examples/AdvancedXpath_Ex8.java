package AdvancedXpath_Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AdvancedXpath_Ex8 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","//Users//sunita//Documents//Driver//chromedriver");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://testingmasters.weebly.com/webtables.html");
	    driver.manage().window().maximize();
	    
		//Print the selected status values whose designation is Analyst 
	    
	    List<WebElement> li=driver.findElements(By.xpath("//table/thead/tr/th[text()='Designation']/parent::tr/parent::thead/following::tbody/tr/td[text()='Analyst']/following-sibling::td[3]/select"));
		int a = li.size();
		System.out.println(a);
		for(int i=0;i<li.size()-1;i++)
		{
			WebElement ele =li.get(i);
			Select sel = new Select(ele);
			String str =sel.getFirstSelectedOption().getText();
			System.out.println(str);
		}

	}

}
