package com.platformX.page;

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

public class VrsteZahtjeva extends PocetnaStranica {
	
	@FindBy(xpath = "//textarea")
	private WebElement opisWE;
	
	@FindBy(xpath = "//div[2]/button[1]")
	private WebElement dodajVrstuWE;
	
	@FindBy(xpath = "//tr[2]/td[2]")
	private WebElement opisTabelaWE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	private WebElement opisFilterWE;
	
	@FindBy(xpath = "//td[3]/button")
	private WebElement burgerBarWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Uredi')]")
	private WebElement urediBtnWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Briši')]")
	private WebElement obrisiWE;
	
	@FindBy(xpath = "//div[7]/div/div/div[3]/button[2]")
	private WebElement potvrdiBrisanjeWE;
	
	@FindBy(xpath = "//tr[2]/td")
	private WebElement praznaTabelaWE;

	public VrsteZahtjeva(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujVrsteZahtjeva() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Vrste zahtjeva')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOpisWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("KUPCI"), "VrsteZahtjeva: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("VRSTE ZAHTJEVA"), "VrsteZahtjeva: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("VRSTE ZAHTJEVA"), "VrsteZahtjeva: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 3, "VrsteZahtjeva: Broj kolona nije dobar! ");
	}
	
	public String dodajVrstuZahtjeva() {
		String opis = "Opis " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(opisWE));
		opisWE.sendKeys(opis);
		wait.until(ExpectedConditions.elementToBeClickable(dodajVrstuWE));
		dodajVrstuWE.click();
		return opis;
	}
	
	public void verifikujVrstuZahtjeva(String opis) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(opisFilterWE));
		opisFilterWE.click();
		opisFilterWE.clear();
		opisFilterWE.sendKeys(opis);
		opisFilterWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(jedinstvenElementWE));
		wait.until(ExpectedConditions.visibilityOf(opisTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(opisTabelaWE.getText().equals(opis), "VrsteZahtjeva: Opis nije dobar!");
	}
	
	public String urediVrstuZahtjeva() {
		String opis = Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediBtnWE));
		urediBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(opisWE));
		opisWE.click();
		opisWE.clear();
		opisWE.sendKeys(opis);
		dodajVrstuWE.click();
		return opis;
	}
	
	public void obrisiVrstuZahtjeva() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obrisiWE));
		obrisiWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeWE));
		potvrdiBrisanjeWE.click();
		Thread.sleep(1000);
	}
	
	public void verifikujBrisanjeVrsteZahtjeva(String opis) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(opisFilterWE));
		opisFilterWE.click();
		opisFilterWE.clear();
		opisFilterWE.sendKeys(opis);
		opisFilterWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(praznaTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "TarifneGrupe: Poruka prazne tabele nije dobra!");
	}

}