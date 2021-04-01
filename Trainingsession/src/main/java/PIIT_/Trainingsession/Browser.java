package PIIT_.Trainingsession;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	static WebDriver driver;

	public static void main(String[] args) {
		
		browserDriver("Chrome","https://www.facebook.com");
		//browserDriver("firefox","https://www.facebook.com");
		

	}
	public static void browserDriver(String browser, String URI) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			//use this method so you need to change path directory when sharing your project/code
			String director1 =System.getProperty("user.dir");
			System.out.println(director1);
			//use this method so you need to change path directory when sharing your project/code
			
			
			System.setProperty("webdriver.chrome.driver", director1+"\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
//			driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
			driver.get(URI);
			driver.manage().window().maximize();
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			String director1 =System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", director1 +"\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(URI);
			driver.manage().window().maximize();
			
		}
	}
}
