package PIIT_.Trainingsession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\cucumber Framework\\Trainingsession\\driver\\chromedriverv88.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.trivago.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		WebElement checkIn = driver.findElement(By.xpath("//button[@key='checkInButton']"));
		checkIn.click();
		
		String expectedMtnh = "April 2022";
		String expectedDay = "19";
		String currentMonth = driver.findElement(By.xpath("//th[@id='cal-heading-month']")).getText();
		
		WebElement arrowClick = driver.findElement(By.xpath("//button[@class='cal-btn-next']"));
		System.out.println(currentMonth);
		int i = 0;
		while(! currentMonth.contains(expectedMtnh)){
			arrowClick.click();
			i++;
			currentMonth = driver.findElement(By.xpath("//th[@id='cal-heading-month']")).getText();
			if(i==12) {
				break;
				
			}
		}
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='onetrust-accept-btn-handler']")));
		WebElement ok =driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		ok.click();
		List <WebElement> days = driver.findElements(By.cssSelector("div.two-month-calendar td"));
		
			for(WebElement day: days) {
			String x = day.getText().trim();
			if(x.equals(expectedDay)) {
				day.click();
			}
		}
			
		WebElement apply=driver.findElement(By.xpath("//ul[@class='guest-selector__footer']/li[2]"));
		apply.click();
			Actions action = new Actions(driver);
			WebElement search = driver.findElement(By.xpath("//span[text()='Search']"));
			action.moveToElement(search).click().perform();
		
			
	}

	

}
