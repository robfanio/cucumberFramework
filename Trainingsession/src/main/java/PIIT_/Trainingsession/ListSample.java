package PIIT_.Trainingsession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListSample {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//--------------List -------------------//
//		
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Automation\\cucumber Framework\\Trainingsession\\driver\\chromedriverv88.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://jqueryui.com/demos/");
//		List<WebElement> menu=	driver.findElements(By.xpath("//aside[@class='widget'][1]"));
//	
//	
//	for(WebElement menus:menu) {
//		String text = menus.getText();
//		System.out.println(text);
//		System.out.println("----------");
//		}
	
	
	//-----------Retrieve titles of images---------///
	
//	System.setProperty("webdriver.chrome.driver",
//			"C:\\Automation\\cucumber Framework\\Trainingsession\\driver\\chromedriverv88.exe");
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.get("https://www.goodreads.com/");
//	
//	List <WebElement> book = driver.findElements(By.xpath("//img[contains(@src,'.jpg' )]"));
//	System.out.println(book.size());
//	for(WebElement books:book) {
//	if(books.isDisplayed()){
//		//this to print the presence element in the webpage only
//		System.out.println(books.isDisplayed());
//		System.out.println(books.getAttribute("alt"));
//		System.out.println("------------");
//	}
	
	
	//---------Retrieve all the links----------------------------//
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Automation\\cucumber Framework\\Trainingsession\\driver\\chromedriverv88.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.com/?gws_rd=ssl");
	
	List <WebElement> link = driver.findElements(By.xpath("//a"));
	
	for(WebElement links :link) {
		
		if(links.isDisplayed()) {
			System.out.println(links.isDisplayed());
			System.out.println(links.getText());
		}
		
		
	}
	
	
	driver.close();
		
	}


	
	

}

	


