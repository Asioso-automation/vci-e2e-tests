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

public class KategorijePotrosnje extends PocetnaStranica {

	public KategorijePotrosnje(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	// Dodaj kategoriju potrosnje elementi 
	
	@FindBy(xpath = "//input") 
	private WebElement nazivKategorijePotrosnjeWE;
	
	@FindBy(xpath = "//div[2]/button[1]") 
	private WebElement dodajBtn1WE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	private WebElement filterPoNazivuWE;
	
	@FindBy(xpath = "//tr[2]/td[2]")
	private WebElement nazivKategorijePotrosnjeTabelaWE;

	public void verifikujKategorijePotrosnje() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Kategorije potro')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("TARIFNI SISTEM"), "KategorijePotrosnje: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("KATEGORIJE POTROŠNJE"), "KategorijePotrosnje: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("KATEGORIJE POTROŠNJE"), "KategorijePotrosnje: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 3, "KategorijePotrosnje: Broj kolona nije dobar! ");
	}

	public String dodajKategorijuPotrosnje() throws InterruptedException {
		String naziv = "KategorijaPotrosnje" + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		Thread.sleep(1000);
		dodajBtnWE.click();
		wait.until(ExpectedConditions.visibilityOf(nazivKategorijePotrosnjeWE));
		nazivKategorijePotrosnjeWE.sendKeys(naziv);
		wait.until(ExpectedConditions.visibilityOf(dodajBtn1WE));
		dodajBtn1WE.click();
		return naziv;	
	}
	
	public void verifikujKategorijuPotrosnje(String naziv) throws Exception {
       wait.until(ExpectedConditions.elementToBeClickable(filterPoNazivuWE));
       filterPoNazivuWE.click();
       filterPoNazivuWE.clear();
       filterPoNazivuWE.sendKeys(naziv);
       filterPoNazivuWE.sendKeys(Keys.ENTER);
       Thread.sleep(1000);
       wait.until(ExpectedConditions.visibilityOf(nazivKategorijePotrosnjeTabelaWE));
       assertTrue(nazivKategorijePotrosnjeTabelaWE.getText().equals(naziv), "KategorijaPotrosnje: KategorijaPotrosnje nije pronadjena!");
	}
	
	public String urediKategorijuPotrosnje() throws InterruptedException {
		String kategorijaPotrosnje = "KategorijaPotrosnje" + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(nazivKategorijePotrosnjeWE));
		nazivKategorijePotrosnjeWE.click();
		nazivKategorijePotrosnjeWE.clear();
		nazivKategorijePotrosnjeWE.sendKeys(kategorijaPotrosnje);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtn1WE));
		dodajBtn1WE.click();
		return kategorijaPotrosnje;
	}
	
	public void obrisiKategorijuPotrosnje() throws InterruptedException { 
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obrisiWE));
		obrisiWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeBtnWE));
		potvrdiBrisanjeBtnWE.click();
	}
	
	public void verifikujBrisanjeKategorijePotrosnje (String kategorijaPotrosnje) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(filterPoNazivuWE));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(filterPoNazivuWE));
		filterPoNazivuWE.click();
		filterPoNazivuWE.clear();
		filterPoNazivuWE.sendKeys(kategorijaPotrosnje);
		filterPoNazivuWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(praznaTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "KategorijePotrosnje: Poruka prazne tabele nije dobra!");
	}

}