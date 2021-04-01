package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\robfa\\Desktop\\cucumber Framework\\login\\dirver\\chromedriver.exe");
		WebDriver od = new ChromeDriver();
	}

}
