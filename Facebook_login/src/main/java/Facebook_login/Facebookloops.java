package Facebook_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebookloops {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",  "C:\\Automation\\cucumber Framework\\Trainingsession\\driver\\chromedriverv88.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		
		
		WebElement red = driver.findElement(By.cssSelector("div#red>span"));
		WebElement green = driver.findElement(By.cssSelector("div#green>span"));
		WebElement blue = driver.findElement(By.cssSelector("div#blue>span"));
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(red).moveByOffset(-20, 0).release(red).build().perform();
		Thread.sleep(1000);
		action.clickAndHold(green).moveByOffset(20, 0).release(green).build().perform();
		Thread.sleep(1000);
		action.clickAndHold(blue).moveByOffset(10, 0).release(blue).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Thread.sleep(2000);
//		WebElement first = driver.findElement(By.xpath("//ol[@id='selectable']/descendant::li[2]"));
//		WebElement third = driver.findElement(By.xpath("//ol[@id='selectable']/descendant::li[3]"));
//		WebElement fifth = driver.findElement(By.xpath("//ol[@id='selectable']/descendant::li[1])"));
//
//		Actions action = new Actions(driver);
//
//		action.keyDown(Keys.COMMAND).perform();
//		action.click(first);
//		action.click(third);
//		action.click(fifth);
//		action.keyUp(Keys.COMMAND).perform();

		// Actions action = new Actions(driver);

		/*
		 * WebElement rigthClick = driver.findElement(By.
		 * xpath("//span[@class='context-menu-one btn btn-neutral']"));
		 * action.contextClick(rigthClick).perform(); Thread.sleep(2000);
		 * action.sendKeys(Keys.ARROW_DOWN).perform(); Thread.sleep(1000);
		 * action.sendKeys(Keys.ARROW_DOWN).perform(); Thread.sleep(1000);
		 * action.sendKeys(Keys.ARROW_DOWN).perform(); Thread.sleep(1000);
		 * 
		 * action.sendKeys(Keys.RETURN).perform();
		 */

//		System.out.println(driver.findElement(By.tagName("a")).getSize());
//		WebElement footerDriver= driver.findElement(By.className("_95ke"));
//		System.out.println(footerDriver.findElement(By.tagName("a")).getSize());
//		
//		WebElement CreatBtn = driver.findElement(By.id("u_0_2"));
//		CreatBtn.click();
//		WebElement firstName= driver.findElement(By.name("firstname"));
//		firstName.sendKeys("john");
//		
//		Select selectMonth = new Select(driver.findElement(By.id("month")));
//		selectMonth .selectByVisibleText("Apr");
//		

//		WebElement createAccount = driver.findElement(By.id("u_0_2"));
//		createAccount.click();
//		
//		List<WebElement> month = driver.findElements(By.cssSelector("select#month>option"));
//		
//		for(WebElement m:month) {
//			if(m.getText().trim().equals("Apr"));
//			m.click();
//			break;
//		}
//		
//		List<WebElement> day = driver.findElements(By.cssSelector("select#day>option"));
//		for(WebElement d:day) {
//			if(d.getText().trim().equals("19"));
//			d.click();
//			break;
//		}
//		
//		

		System.out.println("Test Complete");

	}

}
