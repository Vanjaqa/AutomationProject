package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import logic.Browser;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterAsMemberPage;

public class LoginTest extends Browser {
	
	HomePage homePage;
	RegisterAsMemberPage ramPage;
	LoginPage loginPage;
	
	String email = "testing03021991@gmail.com";
	String password = "1234";
	
	
	@BeforeClass
	public void beforeClass() {
		Browser.initializeDriver();
		Browser.openUrl("http://limocloud.dev.newtec-solutions.com/");
		homePage = new HomePage(Browser.driver, Browser.wait);
		ramPage = new RegisterAsMemberPage(Browser.driver, Browser.wait);
		loginPage = new LoginPage(Browser.driver, Browser.wait);
		
	}
	
	
	
	
	@Test
	public void register() {
		homePage.clickOnLanguageDropDown()
		.clickOnBtnEnglish()
		.clickRegisterAsMember()
		.enterCompanyName("blabla")
		.enterFristName("Vanja")
		.enterLastName("Gvozdenovic")
		.enterAddress("adresa")
		.enterPostCode("011")
		.enterPlace("Ulica")
		.enterTelephone("1234567")
		.enterRegistrationEmail(email)
		.enterPassword(password)
		.enterPasswordCheck(password)
		.clickBtnCheckBox()
		.clickBtnRegister();
		}
	
	@Test
	public void login() {
		loginPage
		.enterEmail(email)
		.enterPassword(password)
		.submitLogin();
		
	}
		
	
	

	
	
	@AfterClass
	public void afterClass() {
		Browser.closeBrowser();
		
		
	}

}
