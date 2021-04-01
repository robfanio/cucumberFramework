package Facebook_login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	HomeLogIn login;
	Registration register;
  @Test
  public void f() {
	  login.email("robt381@yahoo.com");
	  login.password("orangekey128");
	  login.btn();
	}
  @Test
  public void g() {
	 register.CreateActn();
	 register.firstName("robinson");
	 register.lastName("fanio");
	 register.password("orangekey128");
	 register.phoneNumber("6097484320");
 }
  
  
  
  @BeforeMethod
  public void setup() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  login = new HomeLogIn(driver);
	  register= new Registration(driver);
	  driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
	  
  }
}
