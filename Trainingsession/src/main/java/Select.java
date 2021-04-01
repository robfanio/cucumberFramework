import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\cucumber Framework\\Trainingsession\\driver\\chromedriverv88.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/demos/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	
		WebElement spin =driver.findElement(By.xpath("//aside[@class='widget'][2]/ul/li[12]//a[text()='Spinner']"));
		spin.click();
		driver.switchTo().frame(0);
		WebElement buttonClick = driver.findElement(By.xpath("//a[@class = 'ui-button ui-widget ui-spinner-button ui-spinner-up ui-corner-tr ui-button-icon-only']")); 

		
		for(int x = 0; x<= 1000; x++) {
			buttonClick.click();
		}
	}

}
