package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooLogin  {

	public static void main(String[] args) {
		//Define the WebDriver
			System.setProperty("webdriver.chrome.driver","C:\\Automation\\cucumber Framework\\Trainingsession\\driver\\chromedriverv88.exe");
			WebDriver driver = new ChromeDriver();
			
			
		// Open the WebDriver
			String url= "https://www.google.com/gmail/about/#";
			driver.get(url);
		// Click Sign in
			driver.findElement(By.linkText("Sign in")).click();
		// Enter Email Add
			
			driver.findElement(By.xpath("//input[@id='identifierId")).sendKeys("fanio1981");
			
		
		// Get Confirmation
			String pageTitle = driver.getTitle();
			System.out.println("Confirmation Page Title:" + pageTitle);
			
			
		

	}

}
