package CucumberFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","");
			WebDriver  drivers = new ChromeDriver();
			drivers.get("http://www.facebook.com");
	}

}
