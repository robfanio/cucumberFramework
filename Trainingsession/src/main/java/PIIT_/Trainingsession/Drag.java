package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Drag {
	static String message = "TEST PAST";
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\cucumber Framework\\Trainingsession\\driver\\chromedriverv88.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions action  = new Actions(driver);
		WebElement demos = driver.findElement(By.xpath("//a[@href='https://jqueryui.com/demos/']"));
		action.moveToElement(demos).perform();
		
		//insert this method if the site has an iframe
		driver.switchTo().frame(0);
		
		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		action.dragAndDrop(drag, drop).build().perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('Binson love Vanessa')");
		
		
		
		
		System.out.println(message);
	}

	
	}
