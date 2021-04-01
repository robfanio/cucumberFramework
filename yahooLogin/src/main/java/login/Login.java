package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\robfa\\Desktop\\cucumber Framework\\yahooLogin\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(5L,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		WebElement menu = driver.findElement(By.xpath("//a[text()='Menu']"));
		menu.click();
		driver.switchTo().frame(0);
		WebElement music = driver.findElement(By.id("ui-id-9"));
		music.click();
		
		
			
		
//		driver.manage().window().maximize();
//		WebElement signin = driver.findElement(By.linkText("Sign in"));
//		signin.click();
//		WebElement userField= driver.findElement(By.xpath("//input[@type='text']"));
//		userField.sendKeys("robt381@yahoo.com");
//		WebElement nextButton = driver.findElement(By.xpath("//input[@type='submit']"));
//		nextButton.click();
		
	}

}
