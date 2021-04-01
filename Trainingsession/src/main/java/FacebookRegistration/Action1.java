package FacebookRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\robfa\\Desktop\\cucumber Framework\\Trainingsession\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		WebElement sigin = driver.findElement(By.className("nav-action-inner"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		sigin.click();
		
		
		
		
		

	}

}
