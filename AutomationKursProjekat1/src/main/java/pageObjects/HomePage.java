package pageObjects;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import logic.BasePage;

public class HomePage extends BasePage{

	//Elementi
	
	@FindBy(xpath = "//a[@class='dropdown-toggle']")
	private WebElement btnLanguageDropDown;
	
	@FindBy(xpath = "//a[@href='/en']")
	private WebElement btnEnglish;
	
	@FindBy(xpath = "//a[@href='/members/login']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//li//a[@href='/members/user_profile']")
	private WebElement btnRegisterAsMember;
	
	@FindBy(xpath = "//button[@title='Farbe']")
	private WebElement btnColorDropDown;
	
	@FindAll(@FindBy(xpath = "//ul[@data-filter='color']/li"))
	private List<WebElement> listColorDropDownOption;
	
	@FindBy(xpath = "//button[@title='Personen']")
	private WebElement btnNumberOfPersonsDropDown;
	
	@FindAll(@FindBy(xpath = "//ul[@data-filter='persons']/li"))
	private List<WebElement> listNumberOfPersonsDropDown;
	
	@FindBy(xpath = "//button[@title='Fahrzeug Art']")
	private WebElement btnVehicleType;
	
	@FindAll(@FindBy(xpath = "//ul[@data-filter='type']"))
	private List<WebElement> listVehicleTypeDropDown;
	
	@FindBy(xpath = "//button[@title='Marken']")
	private WebElement btnVehicleBrandsDropDown;
	
	@FindAll(@FindBy(xpath = "//ul[@data-filter='mark']/li"))
	private List<WebElement> listVehicleBrandDropDown;
	
	@FindBy(xpath = "//div[@class='row submit-car-filter']")
	private WebElement btnSearch;
	
	@FindAll(@FindBy(xpath ="//img[@class='thumbnail img-responsive limo']"))
	private List<WebElement> imgCarsList;
	
	@FindBy(xpath = "//span[@class='active']")
	private WebElement btnLeft;
	
	@FindBy(xpath = "//span[@class='next']")
	private WebElement btnRight;
	
	@FindAll(@FindBy(xpath = "//ul[@class='pagination']/li/a"))
	private List<WebElement> PageNumberList;
	
	
	
	
	
	
	
	
	
	
	
	//Konstruktor
	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		}
	
	
	
	
	//Metode
	
	
	
	
	
	public LoginPage clickLogin() {
		clickOnElement(btnLogin);
		return new LoginPage(driver, wait);
	}
	
	public RegisterAsMemberPage clickRegisterAsMember() {
		clickOnElement(btnRegisterAsMember);
		return new RegisterAsMemberPage(driver, wait);
	}
	
	public HomePage choseColor(String colorName) {
		Actions builder = new Actions(driver);
		clickOnElement(btnColorDropDown);
		for(WebElement w : listColorDropDownOption) {
			if(w.getText().equalsIgnoreCase(colorName)) {
				builder.moveToElement(w).build().perform();
				clickOnElement(w);
				break;
			}
			
		}
			return this;
	}
	
	public HomePage choseNumberOfPersons(String numberOfPersons) {
		Actions builder = new Actions(driver);
		clickOnElement(btnNumberOfPersonsDropDown);
		for(WebElement w : listNumberOfPersonsDropDown) {
			if(w.getText().equalsIgnoreCase(numberOfPersons)) {
				builder.moveToElement(w).build().perform();
				clickOnElement(w);
				break;
			}
		}
		return this;
	}
	
	public HomePage choseVehicleType(String vehicleType) {
		Actions builder = new Actions(driver);
		clickOnElement(btnVehicleType);
		for(WebElement w : listVehicleTypeDropDown) {
			if(w.getText().equalsIgnoreCase(vehicleType)) {
				builder.moveToElement(w).build().perform();
				clickOnElement(w);
				break;
				}
		}
		return this;
	}
	
	public HomePage choseVehicleBrand(String vehicleBrand) {
		Actions builder = new Actions(driver);
		clickOnElement(btnVehicleBrandsDropDown);
		for(WebElement w : listVehicleBrandDropDown) {
			if(w.getText().equalsIgnoreCase(vehicleBrand)) {
				builder.moveToElement(w).build().perform();
				clickOnElement(w);
				break;
			}
		}
		return this;
	}

	
	public HomePage clickSearch() {
		clickOnElement(btnSearch);
		return this;
	}
	
	
	public HomePage clickOnLanguageDropDown() {
		clickOnElement(btnLanguageDropDown);
		return this;
	}
	
	public HomePage clickOnBtnEnglish() {
		clickOnElement(btnEnglish);
		return this;
		
	}
	
	public void chooseCar(String url) {
		for(WebElement w : imgCarsList) {
			if(w.getAttribute("src").contains(url)) {
				clickOnElement(w);
				break;
			}
		}
	}
	
	public HomePage clickLeft() {
		clickOnElement(btnLeft);
		return this;
	}
	
	public HomePage clickRight() {
		clickOnElement(btnRight);
		return this;
	}
	
	public HomePage clickOnPageNumber(String url) {
		for(WebElement w : PageNumberList) {
			if(w.getAttribute("href").contains(url)) {
				clickOnElement(w);
				break;
			}
		}
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
