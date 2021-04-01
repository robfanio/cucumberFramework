package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\robfa\\Desktop\\cucumber Framework\\Trainingsession\\driver\\chromedriver.exe");
		WebDriver site= new ChromeDriver();
		sleep();
		site.get("http://facebook.com");
		site.findElement(By.name("email")).sendKeys("robt381@yahoo.com");
		site.findElement(By.name("pass")).sendKeys("Sciontc1981.");
		site.findElement(By.name("login")).click();
		
	}

	private static void sleep() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
