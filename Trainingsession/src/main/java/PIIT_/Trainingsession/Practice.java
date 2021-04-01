package PIIT_.Trainingsession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\cucumber Framework\\Trainingsession\\driver\\chromedriverv88.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		
		List<WebElement> item =driver.findElements(By.xpath("//ol[@id='selectable']/li"));
		
		for(WebElement items : item) {
			System.out.println(items.getText());
			System.out.println(items.getAttribute("class"));
			System.out.println(items.getTagName());
		}
		
		
		
		
		String ab ="Hello world";
		
		
		for(int i=ab.length()-1;i>0;i--) {
			System.out.print(ab.charAt(i));
			
		}
		
	}
	
	
	
}
