package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonTesr {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\cucumber Framework\\Trainingsession\\driver\\chromedriverv88.exe");
		WebDriver driver = new ChromeDriver();
	//	Actions action = new Actions(driver);
		driver.get("http://www.amazon.com");
		//driver.findElement(By.cssSelector("i.hm-icon")).click();
//	WebElement hover =	driver.findElement(By.cssSelector("a#nav-link-accountList"));
//	action.moveToElement(hover).build().perform();
//	Thread.sleep(1000);
//	WebElement account = driver.findElement(By.linkText("Account"));
//	account.click();
	
	WebElement signIn = driver.findElement(By.linkText("Sign in"));
	boolean test = signIn.isDisplayed();
	String result =signIn.getText();
	System.out.println(test);
	System.out.println(result);
	
		

	}

}
