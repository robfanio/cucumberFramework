package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiKeyOperations { 

	public static void main(String[] args) {
		/*
		 * Automating Multi-key operations
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\cucumber Framework\\Trainingsession\\driver\\chromedriverv88.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement first = driver.findElement(By.xpath("//ol[@id='selectable']/li[1]"));
		WebElement scnd = driver.findElement(By.xpath("//ol[@id='selectable']/li[2]"));
		WebElement trd = driver.findElement(By.xpath("//ol[@id='selectable']/li[5]"));
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.COMMAND).perform();
		action.click(first);
		action.click(scnd); 
		action.click(trd); 
		action.keyUp(Keys.COMMAND).perform();
		

	}

}
