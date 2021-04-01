package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class DriverFctory {
	
	public static void main(String[] arg) {
		
		
		
	}
	
	public static void DriverFactory(){
		
	}
	
	static WebDriver driver;
	
	
	
	public static void chromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\robfa\\Desktop\\cucumber Framework\\yahooLogin\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		}
	
	public static void firefoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\robfa\\Desktop\\cucumber Framework\\yahooLogin\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
	
		
	}
	
	
	
		
	

	
	
}
