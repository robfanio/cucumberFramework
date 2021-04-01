package PIIT_.Trainingsession;


import java.io.IOException;


import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertPopups2 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Automation\\cucumber Framework\\Trainingsession\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.qatarairways.com/en-us/homepage.html?CID=SXUS982880&account=Google-AMER-US-EN-2&campaign=US-Brand-Hero-EN_exact&adgroup=qatar+airways&term=qatar+airways&gclid=CjwKCAiAtK79BRAIEiwA4OskBrM-qd0klC2u65wba21oJ7bTSE7SaUnSeBuDmq5M3xMr5G22QtdELhoCMNkQAvD_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("cookie-close")).click();
		WebElement dts = driver.findElement(By.id("T7-departure_1"));
		dts.click();
		
		Thread.sleep(3000);
		WebElement chooseDate = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		chooseDate.click();
		
		
		
		
		
		
		
		
		
//		WebElement x =driver.findElement(By.linkText("x"));
//		Thread.sleep(10000);
//		x.click();
		
//		driver.findElement(By.id("close-sc closeStyle1-sc")).click();
//		Picture();
//		
//		driver.findElement(By.xpath("//*[text()='26'])[2]")).click();
		
		System.out.println("Test Complete");
			}
	
//	public static void Picture() throws IOException {
//		//Date dt = new Date();
//		//String si = dt.toString().replace(" ", "_").replace(" ","_");
//		File shot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(shot,
//				new File("C:\\Users\\robfa\\Desktop\\cucumber Framework\\Trainingsession\\picture\\screenshot.png"));
//		
	
//	}
	

}
