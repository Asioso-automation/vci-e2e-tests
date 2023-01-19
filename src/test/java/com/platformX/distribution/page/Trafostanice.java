package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
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

public class Trafostanice extends PocetnaStranica {

	public Trafostanice(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div[2]/div[1]/div/div/div[1]/div/input")
	private WebElement sifraWE;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div/input")
	private WebElement nazivWE;
	
	@FindBy(xpath = "//div[2]/div[4]/div/div/div[1]/div[1]/input[1]")
	private WebElement fizickaLokacijaWE;
	
	@FindBy(xpath = "//div[2]/div[5]/div/div/div[1]/div/input")
	private WebElement tipWE;
	
	@FindBy(xpath = "//div[3]/div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement mjestoWE;
	
	@FindBy(xpath = "//div[3]/div[2]/div/div/div[1]/div[1]/input[1]")
	private WebElement ulicaWE;
	
	@FindBy(xpath = "//div[3]/div[4]/div/div/div[1]/div[1]/input[1]")
	private WebElement postaWE;
	
	@FindBy(xpath = "//td[3]/div/div/div/div[1]/input")
	private WebElement filterNazivWE;
	
	@FindBy(xpath = "//tr[2]/td[3]")
	private WebElement nazivTabelaWE;

	public void verifikujTrafostanice() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Trafostanice')]")));
		verifyCommonElements("ŠIFARNICI", "TRAFOSTANICE", "TRAFOSTANICE", 12, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSifraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVlasnikWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrenosniOdnosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOmjerPrenosaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSnaga1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivnaWE));
	}
	
	public String dodajTrafostanicu() throws Exception{
		String naziv = "Trafostanica" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(sifraWE));
		sifraWE.click();
		sifraWE.sendKeys(Helper.getRandomNumber(4));
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.click();
		nazivWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(fizickaLokacijaWE));
		fizickaLokacijaWE.click();
		fizickaLokacijaWE.sendKeys(Helper.getRandomNumber(1));
		Thread.sleep(1000);
		fizickaLokacijaWE.sendKeys(Keys.ARROW_DOWN);
		fizickaLokacijaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(tipWE));
		tipWE.click();
		tipWE.sendKeys(Helper.getRandomString(4));
		wait.until(ExpectedConditions.elementToBeClickable(mjestoWE));
		mjestoWE.click();
		mjestoWE.sendKeys(Helper.getRandomNumber(1));
		Thread.sleep(1000);
		mjestoWE.sendKeys(Keys.ARROW_DOWN);
		mjestoWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(ulicaWE));
		ulicaWE.click();
		ulicaWE.sendKeys(Helper.getRandomNumber(1));
		Thread.sleep(1000);
		ulicaWE.sendKeys(Keys.ARROW_DOWN);
		ulicaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(postaWE));
		postaWE.click();
		postaWE.sendKeys(Helper.getRandomNumber(1));
		Thread.sleep(1000);
		postaWE.sendKeys(Keys.ARROW_DOWN);
		postaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return naziv;
	}
	
	public void verifikujTrafostanicu(String naziv) throws Exception{
		wait.until(ExpectedConditions.elementToBeClickable(filterNazivWE));
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		filterNazivWE.click();
		filterNazivWE.clear();
		filterNazivWE.sendKeys(naziv);
		filterNazivWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOf(nazivTabelaWE));
		assertTrue(nazivTabelaWE.getText().equals(naziv), "TrafoStanice: Trafostanica nije pronadjena!");
	}
	
	public String urediTrafostanicu(String naziv) throws InterruptedException{
		String trafostanica = "Trafostanica" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(filterNazivWE));
		filterNazivWE.click();
		filterNazivWE.clear();
		filterNazivWE.sendKeys(naziv);
		filterNazivWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.click();
		nazivWE.clear();
		nazivWE.sendKeys(trafostanica);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return trafostanica;
	}

}