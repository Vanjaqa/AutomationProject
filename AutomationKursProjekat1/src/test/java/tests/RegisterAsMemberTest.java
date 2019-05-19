package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import logic.Browser;
import pageObjects.HomePage;
import pageObjects.RegisterAsMemberPage;

public class RegisterAsMemberTest extends Browser {
	
	HomePage homePage;
	RegisterAsMemberPage ramPage;
	
	
	
	@BeforeClass
	public void beforeClass() {
		Browser.initializeDriver();
		Browser.openUrl("http://limocloud.dev.newtec-solutions.com/");
		homePage = new HomePage(Browser.driver, Browser.wait);
	
	
	
	}
	
	@Test
	public void test01() {
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
	.enterRegistrationEmail("testing03021991@gmail.com")
	.enterPassword("1234")
	.enterPasswordCheck("1234")
	.clickBtnCheckBox()
	.clickBtnRegister();
	}
	
	
	
	
	@AfterClass
	public void afterClass() {
		Browser.closeBrowser();
	}
}
