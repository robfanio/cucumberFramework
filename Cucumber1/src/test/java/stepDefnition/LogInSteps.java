package stepDefnition;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LogInSteps {
	WebDriver driver;
	@BeforeClass()
	public void setup() {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\cucumber Framework\\Cucumber1\\drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
	}
	
	
	
	
	@Given("^Navigate to  the website$")
	public void navigate_to_the_website() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\cucumber Framework\\Cucumber1\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("www.facebook.com");
		driver.manage().window().maximize();
	}
 
	@Given("^enter email and password$")
	public void enter_email_and_password() {
	    System.out.println("enter email add");
	    
	}

	@When("^click login button$")
	public void click_login_button() throws Throwable {
		System.out.println("enter email add");
	}

	@Then("^validate user login succesfully$")
	public void validate_user_login_succesfully() throws Throwable {
		System.out.println("enter email add");
	}

}
