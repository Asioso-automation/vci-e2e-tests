package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class Trafostanice extends PocetnaStranicaPXD {

	public Trafostanice(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//div[2]/div[1]/div/div/div[1]/div/input")
	private WebElement nazivWE;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div/input")
	private WebElement nazivNaStampanimDokWE;
	
	@FindBy(xpath = "//div[2]/div[3]/div/div/div[1]/div/input")
	private WebElement sifraWE;
	
	@FindBy(xpath = "//div[5]/div/div/div[1]/div[1]/input[1]")
	private WebElement fizickaLokacijaWE;
	
	@FindBy(xpath = "//div[7]/div/div/div[1]/div/input")
	private WebElement tipWE;
	
	@FindBy(xpath = "//div[3]/div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement mjestoWE;
	
	@FindBy(xpath = "//div[3]/div[2]/div/div/div[1]/div[1]/input[1]")
	private WebElement ulicaWE;
	
	@FindBy(xpath = "//div[3]/div[4]/div/div/div[1]/div[1]/input[1]")
	private WebElement postaWE;
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaSifraWE, kolone.kolonaNazivWE, kolone.kolonaVlasnikWE, kolone.kolonaFizickaLokacijaWE, 
			kolone.kolonaAdresaWE, kolone.kolonaGodinaIzgradnjeWE, kolone.kolonaTipWE, kolone.kolonaBrojTransformatoraWE, kolone.kolonaBrojMjernihMjestaWE, 
			kolone.kolonaPrenosniOdnosWE, kolone.kolonaSnaga1WE, kolone.kolonaAktivnaWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};
	
	public void navigirajVerifikujTrafostanice() throws Exception {
		navigateOnPage(Trafostanice.class, "Šifarnici", "Trafostanice");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Trafostanice')]")));
		verifikacijaStranice("Šifarnici", "Trafostanice", "Trafostanice", 1, columns, buttons);
	}
	
	public String dodajTrafostanicu(String naziv) throws Exception{
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.click();
		nazivWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(nazivNaStampanimDokWE));
		nazivNaStampanimDokWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(sifraWE));
		sifraWE.click();
		sifraWE.sendKeys(Helper.getRandomNumber(4));
		wait.until(ExpectedConditions.elementToBeClickable(fizickaLokacijaWE));
		fizickaLokacijaWE.click();
		fizickaLokacijaWE.sendKeys(Helper.getRandomNumberInRange(1, 6));
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		fizickaLokacijaWE.sendKeys(Keys.ARROW_DOWN);
		fizickaLokacijaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(tipWE));
		tipWE.click();
		tipWE.sendKeys(Helper.getRandomNumberInRange(1, 12));
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		tipWE.sendKeys(Keys.ARROW_DOWN);
		tipWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(mjestoWE));
		mjestoWE.click();
		mjestoWE.sendKeys(Helper.getRandomNumber(1));
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		mjestoWE.sendKeys(Keys.ARROW_DOWN);
		mjestoWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(ulicaWE));
		ulicaWE.click();
		ulicaWE.sendKeys(Helper.getRandomNumber(1));
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		ulicaWE.sendKeys(Keys.ARROW_DOWN);
		ulicaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(postaWE));
		postaWE.click();
		postaWE.sendKeys(Helper.getRandomNumber(1));
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		postaWE.sendKeys(Keys.ARROW_DOWN);
		postaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return naziv;
	}
	
	public String urediTrafostanicu(String naziv) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		changeInput(nazivWE, naziv);
//		nazivWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return naziv;
	}
	
	public String kreirajTrafostanicu() throws InterruptedException {
		String trafostanicaId = podatak2Tabela2WE.getText() + " - " + podatak2Tabela3WE.getText();
		return trafostanicaId;
	}

}