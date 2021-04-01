package FacebookRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.interactions.Actions;

public class FacebookRegistration {
	
	public static void FacebookRegistrtaion() {
		
	}

	
	public static void main(String[] arg) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Automation\\cucumber Framework\\Trainingsession\\driver\\chromedriverv88.exe");
		WebDriver driver = new ChromeDriver();

		Form(driver);

	}

	public static void Form(WebDriver driver) throws InterruptedException {
		driver.get("https://www.facebook.com/");
		WebElement createNewAccount = driver.findElement(By.linkText("Create New Account"));
		createNewAccount.click();
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.id("u_1_b"));
		WebElement lastName = driver.findElement(By.name("lastname"));
		WebElement cpNumber = driver.findElement(By.id("u_1_g"));
		WebElement passWord = driver.findElement(By.name("reg_passwd__"));
		Select months = new Select(driver.findElement(By.id("month")));
		Select days = new Select(driver.findElement(By.id("day")));
		Select years = new Select(driver.findElement(By.id("year")));
		WebElement radioM = driver.findElement(By.id("u_1_3"));
		WebElement signup = driver.findElement(By.xpath("//button[@class ='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']"));

		firstName.sendKeys("Brenty");
		lastName.sendKeys(" Abarca Ling");
		cpNumber.sendKeys("6098885588");
		passWord.sendKeys("abc123");
		months.selectByIndex(6);
		days.selectByIndex(18);
		years.selectByValue("2000");
		radioM.click();
		signup.click();

	}
}
