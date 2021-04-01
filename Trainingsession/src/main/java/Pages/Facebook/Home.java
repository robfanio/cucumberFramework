package Pages.Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	public WebDriver driver;
	@FindBy(name ="email")
	WebElement emailsFieldKeys;
	@FindBy(xpath = "//input[@id='pass']")
	WebElement passwordFieldKeys;
	@FindBy(name = "login")
	WebElement signin;
	
	public  Home(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void emailOfInput() {
		emailsFieldKeys.sendKeys("robt381@yahoo.com");
	}
	
	public void passwordInput() {
		passwordFieldKeys.sendKeys("Sciontc1981");
	}
	public void signinButton() {
		signin.click();
	}
	public void close() {
		driver.close();
	}
}
