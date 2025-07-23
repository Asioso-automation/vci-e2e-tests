package com.application.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.app.base.PageBase;

public class Homepage extends PageBase {

	public Homepage(WebDriver driver, String URL) throws FileNotFoundException, IOException {
//		konstruktor prima dva paramerta, web driver i url (String)
//		u testovima se prvo kreira objekat klase Homepage, time navigiramo na Homepage (putem url-a)
		super(driver);
		URL = vci_properties.getValue("URL.VCI");
		driver.get(URL);
	}
	
	protected WebDriverWait wait = new WebDriverWait(driver, 20);
	
	@FindBy(xpath = "//nav/div[1]/div[2]/div/div/ul/li[4]/a")
	private WebElement loginLinkWE;
	
	@FindBy(xpath = "//*[@class='logo-big']")
	private WebElement logoTopWE;
	
//	@FindBy(xpath = "//div[2]/div/div/ul/li[5]/a[1]/span")
//	private WebElement logoutLinkWE;
	
	@FindBy(xpath = "//*[@class='c-meta-navigation__logout-data']//*[contains(text(), 'Mein VCI')]")
	private WebElement logoutLinkWE;
	
	@FindBy(xpath = "//div[@class='c-header__logo']")
	private WebElement navLogoWE;
	
	@FindBy(className = "c-header")
	private WebElement navHeaderTopWE;
	
	@FindBy(xpath = "//div[1]/div/div[3]/button[1]")
	private WebElement cookieBannerButtonWE;

	@FindBy(xpath = "//nav/div[1]/div[2]/div/ul")
	private WebElement mainNaviWE;
	
	@FindBy(xpath = "//main/div[3]/div")
	private WebElement gridRowWE;
	
	@FindBy(xpath = "//nav/div[1]/div[2]/div/div/ul/li[5]/a[2]")
	private WebElement loginLinkListWE;
	
	@FindBy(xpath = "//nav/div[1]/div[2]/div/div/ul/li[5]/ul/li[4]/a")
	private WebElement newsletterLinkWE;
	
	public void verifikujPocetnuStranicu(boolean loggedIn) throws InterruptedException {
//		metoda prima parametar loggedIn, tako da se verifikuje homepage ukoliko je korisnik ulogovan (true) ili odlogovan (false)
		WebDriverWait wait = new WebDriverWait(driver, 30);
//		Thread.sleep(1000);
		try {
			wait.until(ExpectedConditions.visibilityOf(cookieBannerButtonWE));
			wait.until(ExpectedConditions.elementToBeClickable(cookieBannerButtonWE)).click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(mainNaviWE));
		}
		wait.until(ExpectedConditions.visibilityOf(mainNaviWE));
		wait.until(ExpectedConditions.visibilityOf(navLogoWE));
		if (loggedIn==false) {
		    assertTrue(loginLinkWE.getText().equals("Log-in"),  "Login link doesn't exist");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", gridRowWE);
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOf(gridRowWE));
			Thread.sleep(1000);
			js.executeScript("arguments[0].scrollIntoView(true);", navHeaderTopWE);
			wait.until(ExpectedConditions.visibilityOf(navHeaderTopWE));
			wait.until(ExpectedConditions.visibilityOf(navLogoWE));
		} else if (loggedIn==true) {
		    assertTrue(logoutLinkWE.getText().equals("Mein VCI"),  "Please log in!");
		}
	}

	public LogIn navigateToLoginPage() throws FileNotFoundException, IOException {
//		metoda navigira na login formu
		try {
			wait.until(ExpectedConditions.elementToBeClickable(loginLinkWE)).click();
		} catch(Exception e) {
			driver.get(vci_properties.getValue("URL.VCI") + vci_properties.getValue("VCI.LOGIN"));
		}
		return new LogIn(driver); // metoda vraca klasu LogIn, u testu kreiramo objekat klase LogIn ovom metodom
	}
	
	public void navigateToHomepage() {
//		metoda navigira na homepage putem url-a
		driver.get(vci_properties.getValue("URL.VCI") + vci_properties.getValue("VCI.HOMEPAGE"));
	}

	public Newsletter navigateToNewsletterPage() throws FileNotFoundException, IOException {
		wait.until(ExpectedConditions.elementToBeClickable(loginLinkListWE)).click();
		wait.until(ExpectedConditions.elementToBeClickable(newsletterLinkWE)).click();
		return new Newsletter(driver);
	}
	
}

// dodati navigaciju na newsletter po uzoru na navigate to login page