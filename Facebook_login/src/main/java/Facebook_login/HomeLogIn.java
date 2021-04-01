package Facebook_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeLogIn {
	WebDriver driver;
	@FindBy(name= "email") WebElement emailInputs;
	@FindBy(id ="pass") WebElement passwordInputs; 
	@FindBy(xpath = "//button[@name ='login']") WebElement login;
	
	
	
public HomeLogIn( WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void email(String email) {
	emailInputs.sendKeys(email);
}

public void password(String password) {
	passwordInputs.sendKeys(password);
}

public void btn() {
	login.click();
}
}
