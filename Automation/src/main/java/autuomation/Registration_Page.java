package autuomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registration_Page {
	WebDriver driver;

	// Constructor
	public Registration_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locators
	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	public WebElement signIn;
	@FindBy(id = "SubmitCreate")
	public WebElement createAccount;
	@FindBy(id = "email_create")
	public WebElement email;
	@FindBy(id = "uniform-id_gender1")
	public WebElement MrRadiobutton;
	@FindBy(id = "customer_firstname")
	public WebElement firstName;
	@FindBy(id = "customer_lastname")
	public WebElement lastName;
	@FindBy(xpath = "//input[@data-validate='isEmail']")
	public WebElement emailInput;
	@FindBy(id = "passwd")
	public WebElement password;
	@FindBy(id = "uniform-newsletter")
	public WebElement Newsletter;
	@FindBy(id = "optin")
	public WebElement offers;
	@FindBy(id = "company")
	public WebElement company;
	@FindBy(id = "address1")
	public WebElement StreetAddress;
	@FindBy(id = "city")
	public WebElement city;
	@FindBy(id = "postcode")
	public WebElement zipcode;
	@FindBy(id = "phone")
	public WebElement homePhone;
	@FindBy(id = "phone_mobile")
	WebElement mobile;
	@FindBy(name = "alias")
	WebElement alias;
	@FindBy(id= "submitAccount")
	WebElement button;
	@FindBy(id = "other")
	WebElement addInfo;
	// Methods
	public void clickSignIn() {
		signIn.click();
	}

	public void ClickAccount() {
		createAccount.click();
	}

	public void emailInput(String email) {
		this.email.sendKeys(email);
	}

	public void clickkMr() {
		MrRadiobutton.click();
	}

	public void firstNameInput(String firstname) {
		firstName.sendKeys(firstname);
	}

	public void lastNameInput(String lastname) {
		lastName.sendKeys(lastname);
	}

	public void emailInput2(String email) {
		emailInput.sendKeys(email);
	}

	public void passwordInput(String password) {
		this.password.sendKeys(password);
	}

	// Select drop-down
	public void selectDay(String day) {
		Select Birthday = new Select(driver.findElement(By.id("days")));
		Birthday.selectByValue(day);
	}

	// Select drop-down
	public void selectMonth(String monthNumber) {
		Select BrithMonth = new Select(driver.findElement(By.id("months")));
		BrithMonth.selectByValue(monthNumber);
	}

	// Select drop-down
	public void selectYear(String year) {
		Select BirthMonth = new Select(driver.findElement(By.id("years")));
		BirthMonth.selectByValue(year);
	}

	public void checkNewsletter() {
		Newsletter.click();
	}

	public void checkOffers() {
		offers.click();
	}

	public void companyInput(String text) {
		company.sendKeys(text);
	}

	public void StreetInput(String text) {
		StreetAddress.sendKeys(text);
	}

	public void cityInput(String text) {
		city.sendKeys(text);
	}

	// Select drop-down
	public void SelectStates(String text) {
		Select States = new Select(driver.findElement(By.id("id_state")));
		States.selectByVisibleText(text);
	}

	public void postcode(String zipcode) {
		this.zipcode.sendKeys(zipcode);
	}
	public void addInfoInput(String text) {
		addInfo.sendKeys(text);
	}
	public void phoneInput(String phone) {
		homePhone.sendKeys(phone);
	}

	public void mobileInput(String mobile) {
		this.mobile.sendKeys(mobile);
	}

	public void aliasInput(String text) {
		alias.sendKeys(text);
	}
	
	public void clickButton() {
		button.click();
	}
}
