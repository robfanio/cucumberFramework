package dataProvider;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class RunData {
	WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod() {
		 String path = System.getProperty("user.dir");
		 System.setProperty("webdriver.chrome.driver", path +"\\driver\\chromedriverv88.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.get("https://www.saucedemo.com/");
		 
		 }
	
  @Test(dataProvider= "LoginData")
  public void f(String user, String password) {
	 WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
	 username.sendKeys(user);
	 WebElement pass= driver.findElement(By.id("password"));
	 pass.sendKeys(password);
	 WebElement btn = driver.findElement(By.id("login-button"));
	 btn.click();
  }
 

  @DataProvider(name= "LoginData")
  public String[][] getData(){
	  String LoginData[][]= {
			  {"standard_user","secret_sauce"},
			  {"standard_user","secret_sauce"},
			  {"standard_user","secret_sauce"},
			  {"standard_user","secret_sauce"},
	  };
	  return LoginData;
  }
 

  @AfterMethod()
  public void tearDown() {
	  driver.quit();
  }
  
  
}
