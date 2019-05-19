import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PrvaTestKlasa {
	
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Test
	public void test01() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 30);
		
		driver.get("http://limocloud.dev.newtec-solutions.com/");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/members/login']")));
		
		WebElement btnLogin = driver.findElement(By.xpath("//a[@href='/members/login']"));
		
//		btnLogin.click();
//		
//		
//		
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='logInEmail']")));
//		
//		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='logInEmail']"));
//		
//		txtEmail.sendKeys("Vanja");
//		
//		
//		
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='passwort']")));
//		
//		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='passwort']"));
//		
//		txtPassword.sendKeys("sifra");
//		
//		
//		
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='caption profile']")));
//		
//		WebElement btnLogin2 = driver.findElement(By.xpath("//button[@class='caption profile']"));
//		
//		btnLogin2.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='nav navbar-nav navbar-left']")));
		
		WebElement neuredjenaLista = driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-left']"));
		
		WebElement[] niz = new WebElement[4];
		
		
		
		
		
		
		
		
		
		
		
	
	}
	
	

}
