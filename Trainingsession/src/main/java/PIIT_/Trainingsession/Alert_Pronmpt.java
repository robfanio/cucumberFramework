package PIIT_.Trainingsession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Pronmpt {
	
	public static void  main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\cucumber Framework\\Trainingsession\\driver\\chromedriverv88.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/javascript-alerts/");
		
		driver.findElement(By.id("p_alert3")).click();
		Thread.sleep(3000);
		
		Alert a = driver.switchTo().alert();
		
		a.sendKeys("Atlantic");
		Thread.sleep(4000);
		System.out.println(a.getText());
		a.accept();
		//driver.close();
	}

}
