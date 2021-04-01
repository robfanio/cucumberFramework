package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert_Simple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\cucumber Framework\\Trainingsession\\driver\\chromedriverv88.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/javascript-alerts/");
		driver.findElement(By.id("s_alert1")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
	}

}
