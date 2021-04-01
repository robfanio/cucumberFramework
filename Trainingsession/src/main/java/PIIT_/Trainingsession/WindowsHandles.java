package PIIT_.Trainingsession;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandles {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\cucumber Framework\\Trainingsession\\driver\\chromedriverv88.exe");
		driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/multiple-browser-windows/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement btn = driver.findElement(By.xpath("//button[@id='u_7_8']"));
		btn.click();
		
		Set<String> window = driver.getWindowHandles();
		
		for(String windows: window) {
			
			System.out.println(windows);
			driver.switchTo().window(windows);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			System.out.println("-------------");
			if(driver.getCurrentUrl().equals("https://www.facebook.com/")) {
				break;
			
			}
			
		}
		WebElement emailInput = driver.findElement(By.xpath("//input[@id='email']"));
		emailInput.sendKeys("robt381@yahoo.com");
		//driver.quit();

	}

}
