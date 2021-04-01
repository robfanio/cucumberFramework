package PIIT_.Trainingsession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Reference {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\cucumber Framework\\Trainingsession\\driver\\chromedriverv88.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://www.walmart.com");
		driver.manage().window().maximize();
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@id='global-search-input']"));
		searchBar.sendKeys("Men Shoes");
		WebElement btn = driver.findElement(By.xpath("//button[@id='global-search-submit']"));
		btn.click();
		
		List <WebElement> item = driver.findElements(By.cssSelector(".search-result-gridview-item-wrapper"));
		
		for(WebElement items : item) {
			String itmzName= items.findElement(By.xpath("//span[@class='price-main-block']")).getText();
			System.out.println(itmzName);
		}
		
		//driver.close();
	}

}
