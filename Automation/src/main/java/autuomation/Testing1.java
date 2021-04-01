package autuomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testing1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\robfa\\Desktop\\cucumber Framework\\Automation\\driver\\chromedriver.exe");
	
		  WebDriver  driver = new ChromeDriver();
		  String path1 = System.getProperty("user.dir");
		  System.out.println(path1);
		  driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10L,TimeUnit.SECONDS);
		 // WebElement signIn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		 // signIn.click();
		  //WebDriverWait wait = new WebDriverWait(driver,10);
		  WebElement createEmail = driver.findElement(By.id("email_create"));
		   createEmail.sendKeys("robt381@yahoo.com");
		  WebElement account = driver.findElement(By.id("SubmitCreate"));
		  account.click();
		 // wait.until(ExpectedConditions.visibilityOf(account));
		   
		   Select BirthMonth = new Select(driver.findElement(By.id("days")));
		   BirthMonth.selectByValue("4");
		   
		   //Use try catch block if the element is presents
		   try {
			   driver.findElement(By.id("passwd"));
			   System.out.println("Eelement is present");
		   }catch(Exception e) {
			   System.out.println("element is not presents");
		   }
		   
		   
		
	}

}
