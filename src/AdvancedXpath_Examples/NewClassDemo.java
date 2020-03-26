package AdvancedXpath_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewClassDemo {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","//Users//sunita//Documents//Driver//chromedriver");
		WebDriver driver = new ChromeDriver();
       driver.get("http://testingmasters.weebly.com/webtables.html");
       driver.manage().window().maximize();
       
       String name = driver.findElement(By.xpath("//table/tbody/tr/td[2][text()='S148109']/following::td[1]")).getText();
       System.out.println(name);

}
}
