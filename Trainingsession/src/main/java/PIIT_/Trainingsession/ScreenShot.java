package PIIT_.Trainingsession;

import java.io.File;
import java.io.IOException;

import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Automation\\cucumber Framework\\Trainingsession\\driver\\chromedriverv88.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.udemy.com/");
		driver.manage().window().maximize();
		TakePics(driver);
	}

	public static void TakePics(WebDriver driver) throws IOException {

		Date currentDate = new Date();
		String shot1= currentDate.toString().replace(" ", "-").replace(" ", "-");
		

		File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot, new File("C:\\Users\\robfa\\Desktop\\cucumber Framework\\Trainingsession\\picture\\udemy.png"));
		System.out.println(shot1);
		
		
	}
}
