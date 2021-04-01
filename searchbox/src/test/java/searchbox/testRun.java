package searchbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class testRun {
	WebDriver driver;

	@BeforeClass
	public void classSetup() {
		System.out.println("Begin execute the test");
	}

	@AfterClass
	public void classtestDone() {
		System.out.println("Test run complete");
	}

// before execute first before the the Test method
	@BeforeMethod
	public void setUp() {
		String pathDirectory = System.getProperty("user.dir");
		System.out.println(pathDirectory);
		System.setProperty("webdriver.chrome.driver", pathDirectory + "\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	// After method execute after the test method
	@AfterMethod

	public void closeTest() {
		driver.close();
	}

	@Test
	public void ebaySearchbox() {

		driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
		String url = "https://www.ebay.com/";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.id("gh-btn"));
		searchBox.click();

		String expectedUrl = "https://www.ebay.com/n/all-categories";
		String expectedTitle = "Shop by Category | eBay";
		String newUrl = driver.getCurrentUrl();
		String newTitle = driver.getTitle();

		Assert.assertEquals(newUrl, expectedUrl, "Verify URL of the Page");
		Assert.assertEquals(newTitle, expectedTitle, "Verify URL of the Page");
		Assert.assertTrue(driver.findElement(By.id("gh-btn")).isEnabled(), "Verified searhbox enabled");

		System.out.println(newUrl);
		System.out.println(newTitle);

		/*
		 * TYPE OF ASSERTS 1. Assert.assertEquals(actual, expected); 2.
		 * Assert.assertNotEquals(actual, expected); 3. Assert.assertTrue(condition); 4.
		 * Assert.assertFalse(condition, message); 5. Assert.assertNotNull(object,
		 * message); 6. Assert.assertNull(object, message);
		 * 
		 * When the 1st assertion fails the next assertion will not run or aborted this
		 * happened on the Hard Assertion
		 */

	}

	@Test
	public void SoftSearchBox() {

		/*
		 * Soft Assert is continue to test application even if there is a failed module
		 * and will passed the test result even if there is a fail module.
		 */

		SoftAssert sa = new SoftAssert();
		driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
		String url = "https://www.ebay.com/";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.id("gh-btn"));
		searchBox.click();
		String expectedUrl = "https://www.ebay.com/n/all-categories";
		String expectedTitle = "Shop by Category | eBays";
		String newUrl = driver.getCurrentUrl();
		String newTitle = driver.getTitle();

		sa.assertEquals(newUrl, expectedUrl, "Verify URL of the Page");
		sa.assertEquals(newTitle, expectedTitle, "Verify URL of the Page");
		sa.assertTrue(driver.findElement(By.id("gh-btn")).isEnabled(), "Verified searhbox enabled");

		System.out.println(newUrl);
		System.out.println(newTitle);

		// if you do not use assertAll the test will never fail
		sa.assertAll();
	}

}
