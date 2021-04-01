package PIIT_.Trainingsession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropBox {
	static WebDriver driver;

	public static void main(String[] args) {
		String path =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4L,TimeUnit.SECONDS);
		
		WebElement createAccount = driver.findElement(By.id("u_0_2"));
		createAccount.click();
		
		List<WebElement> month = driver.findElements(By.cssSelector("select#month>option"));
		System.out.println(month);
		
		Select month1 =  new Select(driver.findElement(By.id("month")));
		month1.selectByVisibleText("Apr");
		Select day= new Select(driver.findElement(By.xpath("//select[@aria-label='Day']")));
		day.selectByValue("19");
		Select year= new Select(driver.findElement(By.id("year")));
		year.selectByValue("1981");
		
		
		// This for loops Method to select dont work
		for(WebElement m:month) {
			if(m.getText().trim().equals("Apr"))
			m.click();
			break;
		}
		
		List<WebElement> day1 = driver.findElements(By.cssSelector("select#day>option"));
		for(WebElement d:day1) {
			if(d.getText().trim().equals("19"))
			d.click();
			break;
		}
		System.out.println("Test Complete");
		
		List<WebElement> year1= driver.findElements(By.cssSelector("select#year>option"));
		for(WebElement y:year1) {
			if(y.getText().trim().equals("1981"))
				y.click();
			break;
		}
	}
}
