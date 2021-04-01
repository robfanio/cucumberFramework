package PIIT_.Trainingsession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\cucumber Framework\\Trainingsession\\driver\\chromedriverv88.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		WebElement btn = driver.findElement(By.linkText("Create New Account"));
		btn.click();
		List <WebElement> month = driver.findElements(By.xpath("//select[@id='month']/option"));
		List <WebElement> day = driver.findElements(By.xpath("//select[@id='day']/option"));
		List <WebElement> year = driver.findElements(By.xpath("//select[@id='year']/option"));
		
		//---------MONTH----------//
		for(WebElement months:month) {
			System.out.println(months.getText());
			if(months.getText().trim().contains("Apr")) {
				months.click();
				break;
			}
			
			
		}
		
		//---------DAY----------//
		
		for(WebElement days: day) {
			if(days.getText().trim().contains("19")) {
				days.click();
				break;
				
			}
			System.out.println(days.getText());
			
		}
		
		//--------------------------YEAR-------------------//
		
		
		for(WebElement years: year) {
			if(years.getText().trim().contains("1981")) {
				years.click();
				
			}
			System.out.println(years.getText());
		}
	}
	
	

}
