package Mentoring;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path+"\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		//driver.get("http://automationpractice.com/index.php");
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2L, TimeUnit.SECONDS);
		//Actions action = new Actions(driver);
		
//		WebElement tShirtsIcon = driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/child::li[3]"));
//		tShirtsIcon.click();
		
		WebElement btn= driver.findElement(By.cssSelector(("input.nav-input")));
	
		btn.sendKeys("hello world");
		
		
		
		
		
		
		
//		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
//		action.contextClick(rightClick).perform();
//		Thread.sleep(2000);
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(2000);
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(2000);
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		
//		action.sendKeys(Keys.RETURN).perform();;
//		driver.switchTo().alert().accept();
		
		
//		driver.switchTo().frame(0);
//		WebElement drag = driver.findElement(By.id("draggable"));
//		WebElement drop = driver.findElement(By.id("droppable"));
//		
//		action.dragAndDrop(drag,drop).perform();
//		
		
		
		
		
//		WebElement btn= driver.findElement(By.id("u_0_2"));
//		btn.click();
//
//		Select month = new Select(driver.findElement(By.id("month")));
//		month.selectByValue("1");
//		Select day = new Select(driver.findElement(By.id("day")));
//		day.selectByVisibleText("25");
//		Select year = new Select(driver.findElement(By.id("year")));
//		year.selectByIndex(37);
		
		
		
		
		
		
		
		
		
		
//		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
//		searchBox.sendKeys("iphone 11");
//		searchBox.sendKeys(Keys.RETURN);
//		WebElement allMenu = driver.findElement(By.className("hm-icon-label"));
//		allMenu.click();
//		WebElement primeNav= driver.findElement(By.xpath("//a[@id='nav-link-prime']"));
//		primeNav.click();
//		WebElement searchBox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
//		searchBox.sendKeys("samsung 12");

		checkElement();
	}
	
	
	public static void checkElement() {
		if(driver.findElement(By.cssSelector(("input.nav-input"))) != null) {
			System.out.println("elements is present");
			
		}else {
			System.out.println("element is not present");
		}
	}

}
