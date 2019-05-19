package pageObjects;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import logic.BasePage;

public class RegisterAsMemberPage extends BasePage {

	
	
	//Elementi
	@FindBy(xpath = "//input[@id='user-firma']")
	private WebElement txtCompanyName;
	@FindBy(xpath = "//input[@id='user-vorname']")
	private WebElement txtFirstName;
	@FindBy(xpath = "//input[@id='user-nachname']")
	private WebElement txtLastName;
	@FindBy(xpath = "//input[@id='user-adresse']")
	private WebElement txtAddress;
	@FindBy(xpath = "//input[@id='user-plz']")
	private WebElement txtPostCode;
	@FindBy(xpath = "//input[@id='user-ort']")
	private WebElement txtPlace;
	@FindBy(xpath = "//input[@id='user-telefon']")
	private WebElement txtTelephone;
	@FindBy(xpath = "//input[@id='registration-email']")
	private WebElement txtRegistrationEmail;
	@FindBy(xpath = "//input[@id='passwort']")
	private WebElement txtPassword;
	@FindBy(xpath = "//input[@id='passwort']")
	private WebElement txtPasswordCheck;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement btnCheckBox;
	@FindBy(xpath = "//button[@id='register-button']")
	private WebElement btnRegister;
	
	
	
	
	
	
	//Konstruktor
	public RegisterAsMemberPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		
	}
	
	
	
	
	
	//Metode
	
	public RegisterAsMemberPage enterCompanyName(String text) {
		enterText(txtCompanyName, text);
		return this;
	}
	
	public RegisterAsMemberPage enterFristName(String name) {
		enterText(txtFirstName, name);
		return this;
	}
	
	public RegisterAsMemberPage enterLastName(String lastName) {
		enterText(txtLastName, lastName);
		return this;
	}
	
	public RegisterAsMemberPage enterAddress(String address) {
		enterText(txtAddress, address);
		return this;
	}
	
	public RegisterAsMemberPage enterPostCode(String postCode) {
		enterText(txtPostCode, postCode);
		return this;
	}
	
	public RegisterAsMemberPage enterPlace(String place) {
		enterText(txtPlace, place);
		return this;
	}
	
	public RegisterAsMemberPage enterTelephone(String telephone) {
		enterText(txtTelephone, telephone);
		return this;
	}
	
	public RegisterAsMemberPage enterRegistrationEmail(String email) {
		enterText(txtRegistrationEmail, email);
		return this;
	}
	
	public RegisterAsMemberPage enterPassword(String password) {
		enterText(txtPassword, password);
		return this;
	}
	
	public RegisterAsMemberPage enterPasswordCheck(String password) {
		enterText(txtPasswordCheck, password);
		return this;
	}
	
	public RegisterAsMemberPage clickBtnCheckBox() {
		clickOnElement(btnCheckBox);
		return this;
	}
	
	public LoginPage clickBtnRegister() {
		clickOnElement(btnRegister);
		return new LoginPage(driver, wait);  
	}
	
	
	
	
	
	
	
}
