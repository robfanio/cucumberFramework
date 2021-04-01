package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\robfa\\Desktop\\cucumber Framework\\Trainingsession\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://jqueryui.com/menu/";
	
	driver.get(url);
	driver.manage().window().maximize();
	
	Actions action = new Actions(driver);
	WebElement plugin = driver.findElement(By.linkText("Contribute"));
	action.moveToElement(plugin).build().perform();
	WebElement cla= driver.findElement(By.linkText("CLA"));
	cla.click();
	
	

	
	
	}

}
