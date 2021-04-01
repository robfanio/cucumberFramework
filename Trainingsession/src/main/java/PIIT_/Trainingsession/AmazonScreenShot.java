package PIIT_.Trainingsession;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AmazonScreenShot {
	

	private static final TakesScreenshot driver = null;

	public static void main(String[] args) throws IOException  {
	System.setProperty("webdriver.chrome.driver", "C:\\Automation\\cucumber Framework\\Trainingsession\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.amazon.com/";
	driver.get(url);
	driver.manage().window().maximize();
	takePic();
	}

	public static  void takePic() throws IOException {
		
		Date currentDate = new Date();
		
		String screenShot = currentDate.toString().replace(" ", "-").replace(":","-");
		
		File pics = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(pics, new File("C:\\Users\\robfa\\Desktop\\cucumber Framework\\Trainingsession\\picture\\"+screenShot+".png"));

		System.out.println("Test Complete");
	}


}
