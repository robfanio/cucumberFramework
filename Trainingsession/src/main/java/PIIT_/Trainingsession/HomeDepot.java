package PIIT_.Trainingsession;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;




public class HomeDepot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\robfa\\Desktop\\cucumber Framework\\Trainingsession\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(3000);
		driver.get("http://www.homedepot.com");
		driver.manage().window().maximize();
		WebElement toClick= driver.findElement(By.id("headerMyAccountTitle"));
		toClick.click();
		WebElement toRegister = driver.findElement(By.xpath("//a[@class = 'bttn-outline']"));
		js.executeScript("arguments[0].click()", toRegister);
		WebElement Select1 = driver.findElement(By.className("bttn--primary"));
		Select1.click();
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("robt381@yahoo.com");
		WebElement pass1= driver.findElement(By.name("password"));
		pass1.sendKeys("1234abcd.");
		WebElement zipcode = driver.findElement(By.id("zipCode"));
		zipcode.sendKeys("08205");
		WebElement phone = driver.findElement(By.xpath("//input[@class ='form-input__field' and @name ='phone']"));
		phone.sendKeys("6097052255");
		WebElement createAccount = driver.findElement(By.className("bttn--primary"));
		createAccount.click();
		
		System.out.println("Test complete");
		
	
	}
	
//	public static void Picture(TakesScreenshot driver) throws IOException {
//		File shot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(shot, new File("C:\\Users\\robfa\\Desktop\\cucumber Framework\\Trainingsession\\picture"));
//		
//	}
	
	
	
	
	
	
	
	
	
//	public static void clickEelment(WebElement element, WebDriver driver) {
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click()", element);
//		
//	}
	
	
	

}
