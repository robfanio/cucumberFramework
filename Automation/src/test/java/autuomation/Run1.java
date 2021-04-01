package autuomation;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Run1 {
	WebDriver driver;
	Registration_Page register;
	 
  @Test
  public void f()  {
	 
	  register.clickSignIn();
	  register.emailInput("rfanio1981@gmail.com");
	  register.ClickAccount();
	  register.clickkMr();
	  register.firstNameInput("robinson");
	  register.lastNameInput("fanio");
	  register.passwordInput("orangekey128");
	  register.selectDay("19");
	  register.selectMonth("4");
	  register.selectYear("1981");
	  register .checkNewsletter();
	  register.checkOffers();
	  register.companyInput("Bank of America");
	  register.StreetInput("314 S Ash Avenue");
	  register.cityInput("Galloway");
	  register.SelectStates("New Jersey");
	  register.postcode("08205");
	  register.addInfoInput("my office ");
	  register.phoneInput("6097052255");
	  register.mobileInput("6097052230");
	  //register.clickButton();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Automation\\cucumber Framework\\Automation\\driver1\\chromedriver.exe");
	  driver = new ChromeDriver();
	  String path1 = System.getProperty("user.dir");
	  System.out.println(path1);
	  driver.get("http://automationpractice.com/index.php");
	  driver.manage().window().maximize();
	  register = new Registration_Page(driver);
	  driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
	 // WebDriverWait wait = new WebDriverWait(driver,10);
	 // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Create an account']")));
	  
  }
@AfterMethod
public void afterMethod() {
	//driver.close();
	System.out.println("Test complete");
}
}
