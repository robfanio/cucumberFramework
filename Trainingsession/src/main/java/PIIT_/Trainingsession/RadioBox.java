package PIIT_.Trainingsession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\cucumber Framework\\Trainingsession\\driver\\chromedriverv88.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/jobs/jobs-in-pleasantville-nj?trk=homepage-basic_intent-module-jobs&position=1&pageNum=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		WebElement dropDown = driver.findElement(By.xpath("//button[contains(text(),'Company')]"));
		dropDown.click();
		
		List<WebElement> company = driver.findElements(By.xpath("//div[@id='COMPANY-dropdown']//li "));
		
		for( WebElement companies: company) {
			System.out.println(companies.getText());
			if(companies.getText().trim().contains("AtlantiCare") || (companies.getText().contains("Hard Rock Hotel & Casino Atlantic City "))) {
				companies.click();
			}
		
		}

	}

}
