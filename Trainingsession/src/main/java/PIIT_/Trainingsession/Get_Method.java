package PIIT_.Trainingsession;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Get_Method {
static WebDriver driver;

	public static void main(String[] args) throws IOException {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path+"\\driver\\chromedriverv88.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//prntScreen();
		WebElement crtBtn = driver.findElement(By.id("u_0_2"));
		crtBtn.click();
		prntScreen();
		
	}
	
	//SCREEN SHOT
	public static void prntScreen() throws IOException{
	Date currentDate = new Date();
	String newDate=currentDate.toString().replace(" ", "-").replace(":", "-");
	System.out.println(newDate);
	File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(screen,new File("C:\\Automation\\cucumber Framework\\Trainingsession\\picture"+newDate+ "pix.png"));
	System.out.println(screen);
}

}