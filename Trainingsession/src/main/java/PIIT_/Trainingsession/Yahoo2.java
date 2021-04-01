package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo2 {

	public static void main(String[] args) {
		//Define the WebDriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\robfa\\Desktop\\cucumber Framework\\Trainingsession\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		driver.get(url);
		driver.findElement(By.xpath("//input[@type ='email']")).sendKeys("fanio1981");
		// click next button
				WebElement next= driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
				next.click();
	}

}
