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

public class TarifneGrupe extends PocetnaStranica {
	
	public TarifneGrupe(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	// Elementi sa forme za dodavanje tarifne grupe
	
	@FindBy(xpath = "//div[1]/div[1]/div[1]/div/div/div[1]/div/input")
	private WebElement nazivTarifneGrupeWE;
	
	@FindBy(xpath = "//div[1]/div[2]/div/div/div[1]/div/input")
	private WebElement ebixSifraWE;
	
	@FindBy(xpath = "//div[1]/div[3]/div/div/div[1]/div[1]/div[1]")
	private WebElement grupaObrazacaWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__content') and starts-with(., '1 - Grupa obrasca 1')]")
	private WebElement grupa1WE;
	
	@FindBy(xpath = "//div[1]/div[2]/div[1]/div/div/div[1]/div[1]/div[1]")
	private WebElement nadgrupaWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__content') and starts-with(., '1 - Tarifna nadgrupa 1')]")
	private WebElement nadgrupa1WE;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div[1]/div[1]")
	private WebElement kategorijaWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__content') and starts-with(., '1 - Tarifna kategorija 1')]")
	private WebElement kategorija1WE;
	
	@FindBy(xpath = "//div[2]/div[3]/div/div/div[1]/div[1]/div[1]")
	private WebElement vrstaBrojilaWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__content') and starts-with(., '4 - T1')]")
	private WebElement odaberiBrojiloWE;

	public void verifikujTarifneGrupe() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Tarifne grupe')]")));
		verifikacijaZajednickihElemenata("Tarifni Sistem", "Tarifne Grupe", "Tarifne grupe", 9, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGrupaObrascaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNadgrupaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKategorijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMaxigrafWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaReaktivnaWE));
	}
	
	public String dodajTarifnuGrupu() {
		String tarifnaGrupa = "TG " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivTarifneGrupeWE));
		nazivTarifneGrupeWE.sendKeys(tarifnaGrupa);
		ebixSifraWE.sendKeys(Helper.getRandomString(5));
		grupaObrazacaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(grupa1WE));
		grupa1WE.click();
		nadgrupaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nadgrupa1WE));
		nadgrupa1WE.click();
		kategorijaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kategorija1WE));
		kategorija1WE.click();
		vrstaBrojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(odaberiBrojiloWE));
		odaberiBrojiloWE.click();
		submitBtnWE.click();
		return tarifnaGrupa;
	}
	
	public void verifikujTarifnuGrupu(String tarifnaGrupa) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona2WE));
		filterKolona2WE.click();
		filterKolona2WE.clear();
		filterKolona2WE.sendKeys(tarifnaGrupa);
		filterKolona2WE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(jedinstvenElementWE));
		wait.until(ExpectedConditions.visibilityOf(podatak2Tabela2WE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(podatak2Tabela2WE.getText().equals(tarifnaGrupa), "TarifneGrupe: Ime grupe nije dobro!");
	}
	
	public String urediTarifnuGrupu() {
		String tarifnaGrupa = "TG " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivTarifneGrupeWE));
		nazivTarifneGrupeWE.click();
		nazivTarifneGrupeWE.clear();
		nazivTarifneGrupeWE.sendKeys(tarifnaGrupa);
		submitBtnWE.click();
		return tarifnaGrupa;
	}
	
	public void verifikujBrisanjeTarifneGrupe(String tarifnaGrupa) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona2WE));
		filterKolona2WE.click();
		filterKolona2WE.clear();
		filterKolona2WE.sendKeys(tarifnaGrupa);
		filterKolona2WE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(podatak2TabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(podatak2TabelaWE.getText().equals("Nema podataka"), "TarifneGrupe: Poruka prazne tabele nije dobra!");
	}

}