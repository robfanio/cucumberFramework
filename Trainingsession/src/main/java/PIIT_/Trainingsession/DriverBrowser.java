package PIIT_.Trainingsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverBrowser {
	static WebDriver driver;
	public static void  main(String[] args) {
	browserOptions("chrome","https://www.facebook.com");
		
	}
	
	public  static void browserOptions(String browser, String URI){
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\robfa\\Desktop\\cucumber Framework\\Trainingsession\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(URI);
			driver.manage().window().maximize();
		}else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\robfa\\Desktop\\cucumber Framework\\Trainingsession\\driver\\geckodriver.exe");
			driver= new FirefoxDriver();
			driver.get(URI);
			driver.manage().window().maximize();
		}else {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\robfa\\Desktop\\cucumber Framework\\Trainingsession\\driver\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			driver.get(URI);
			driver.manage().window().maximize();
			
		}

	
	}
}