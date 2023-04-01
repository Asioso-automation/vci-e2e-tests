package scp.page;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.platformX.base.PageBase;

public class LogIn extends PageBase {

	public LogIn(WebDriver driver, String URL) throws FileNotFoundException, IOException {
		super(driver);
		URL = platformx_properties.getValue("URL.SCP");
		driver.get(URL);
	}
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	@FindBy(xpath = "//div[3]/button")
	private WebElement prijaviSeBtnWE;

	@FindBy(xpath = "//div[2]/div/div[1]/div/input")
	private WebElement korisnickoImeWE;

	@FindBy(xpath = "//div[3]/div/div[1]/div/input")
	private WebElement lozinkaWE;
	
	@FindBy(xpath = "//form/div/div[2]/div[1]/div/div[1]")
	private WebElement organizacijaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-list__tile__title') and contains(text(), 'Vodovod')]")
	private WebElement vodovodWE;
	
	@FindBy(xpath = "//div[2]/div/div/div")
	private WebElement porukaUpozorenjaWE;
	
	public void verifikujLogIn() {
		wait.until(ExpectedConditions.elementToBeClickable(korisnickoImeWE));
		wait.until(ExpectedConditions.elementToBeClickable(lozinkaWE));
		wait.until(ExpectedConditions.visibilityOf(prijaviSeBtnWE));
	}

	public void logIn() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(korisnickoImeWE));
		wait.until(ExpectedConditions.visibilityOf(lozinkaWE));
		wait.until(ExpectedConditions.elementToBeClickable(organizacijaWE));
		wait.until(ExpectedConditions.elementToBeClickable(korisnickoImeWE));
		wait.until(ExpectedConditions.elementToBeClickable(organizacijaWE));
		organizacijaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vodovodWE));
		vodovodWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(korisnickoImeWE));
		korisnickoImeWE.sendKeys(platformx_distribution_properties.getValue("DIST.USER.NAME"));
		wait.until(ExpectedConditions.elementToBeClickable(lozinkaWE));
		lozinkaWE.sendKeys(platformx_distribution_properties.getValue("DIST.PASSWORD"));
		wait.until(ExpectedConditions.elementToBeClickable(prijaviSeBtnWE));
		prijaviSeBtnWE.click();
	}
	
	public void provjeraValidacija(String korisnickoIme, String lozinka) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(korisnickoImeWE));
		wait.until(ExpectedConditions.visibilityOf(lozinkaWE));
		korisnickoImeWE.sendKeys(korisnickoIme);
		lozinkaWE.sendKeys(lozinka);
		wait.until(ExpectedConditions.elementToBeClickable(prijaviSeBtnWE));
		prijaviSeBtnWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(porukaUpozorenjaWE));
		assertTrue(porukaUpozorenjaWE.getText().equals("Pogrešno korisničko ime i/ili lozinka!"), "LogIn: Poruka upozorenja nije dobra!");
	}
	
}