package TestRun;

import org.testng.annotations.Test;

import Pages.Facebook.Home;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;


public class NewTest {
	
	WebDriver driver;
	
	//3rd Annotation executed
  @Test
  public void f() {
	 Home ob  = new Home(driver);
	 ob.emailOfInput();
	 ob.passwordInput();
	 ob.passwordInput();
	 ob.signinButton();
	 
  }
//2nd Annotation executed
  @BeforeMethod
  public void beforeMethod() {
	  
  }
// 4th Annotation executed
  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }

  
//last Annotation executed
  @AfterClass
  public void afterClass() {
	  
  }
  
  
  
  }


