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
	
	@FindBy(xpath = "//tr[2]/td[2]")
	private WebElement opisTabelaWE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	private WebElement opisFilterWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Uredi')]")
	private WebElement urediBtnWE;

	public VrsteZahtjeva(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujVrsteZahtjeva() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Vrste zahtjeva')]")));
		verifikacijaZajednickihElemenata("Kupci", "Vrste Zahtjeva", "Vrste zahtjeva", 3, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOpisWE));
	}
	
	public String dodajVrstuZahtjeva() {
		String opis = "Opis " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(opisWE));
		opisWE.sendKeys(opis);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
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
		submitBtnWE.click();
		return opis;
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