package Search;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTest {
public static void main(String[] args) {
		GoogleSearch();
	}
	
public SearchTest() {
	
}
	public static void GoogleSearch() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(4L, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Automation");
		search.sendKeys(Keys.RETURN);
		
	

		String expectedUrl = "https://www.google.com/";
		String expectedTitlePage= "Google";
		String actualUrl= driver.getCurrentUrl();
		String actualTitlePage= driver.getTitle();
		
		
		 //driver.findElement(By.xpath("/input[@aria-label='Google Search' and @name='btnK' ]")).sendKeys(Keys.RETURN);
		//driver.close();
		
	}
	
}
