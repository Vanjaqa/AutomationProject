package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import logic.BasePage;

public class LoginPage extends BasePage {
	
	
	@FindBy(xpath = "//input[@id='logInEmail']")
	private WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='passwort']")
	private WebElement txtPassword;
	
	@FindBy(xpath = " //button[@class='caption profile']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//div[contains(@class,'alert') and not (contains(@class,'msg'))]")
	private WebElement alertMsg;
	
	
	
	
	

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		
	}
	
	
	
	public LoginPage enterEmail(String email) {
		enterText(txtEmail, email);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		enterText(txtPassword, password);
		return this;
	}
	
	public HomePage submitLogin() {
		clickOnElement(btnLogin);
		return new HomePage(driver, wait);
	}
	
	public LoginPage verifySuccesfulLogin() {
		assertEquals(alertMsg.getText(), "×\nThe member has been saved", "Verifikacija nije uspela.");
		return this;
		
	}
	
	
	
	
	

}
