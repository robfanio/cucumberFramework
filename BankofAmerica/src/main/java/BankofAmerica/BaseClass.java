package BankofAmerica;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public BaseClass() {
		
	}
	static WebDriver driver;
	
		public static void Browser() {
			
			String projectPath = System.getProperty("user.dir");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			System.setProperty("webdriver.chrome.driver", projectPath+"\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.bankofamerica.com/");
			driver.manage().window().maximize();
			
		}
		
		

}
