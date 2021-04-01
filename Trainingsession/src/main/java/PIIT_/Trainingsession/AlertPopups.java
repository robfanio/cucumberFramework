package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;

public class AlertPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Automation\\cucumber Framework\\Trainingsession\\driver\\chromedriverv88.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement submit1 = driver.findElement(By.name("submit"));
		Actions act = new Actions(driver);
		submit1.click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//a[@href='http://demo.guru99.com/telecom/index.html']")))
				.click().build().perform();
		driver.close();
		System.out.println("Test complete");
	
	}

}
