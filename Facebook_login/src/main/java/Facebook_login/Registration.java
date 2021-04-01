package Facebook_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
	WebDriver driver;
	@FindBy(id ="u_0_2") WebElement createNewAccount;
	@FindBy(xpath = "//input[@name = 'firstname']") WebElement firstName;
	@FindBy(name="lastname") WebElement lastName;
	@FindBy(xpath="//input[@id='u_1_g']") WebElement phoneNumber;
	@FindBy(xpath = "//input[@type='password' and @name = 'reg_passwd__' ]") WebElement password;
	
	public Registration(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void CreateActn() {
		createNewAccount.click();
	}
	
	public void firstName(String name) {
		firstName.sendKeys(name);
	}
	public void lastName(String name) {
		lastName.sendKeys(name);
	}
	public void phoneNumber(String name) {
		lastName.sendKeys(name);
	}
	public void password(String name) {
		password.sendKeys(name);
	}
}
