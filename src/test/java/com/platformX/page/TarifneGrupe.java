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

public class TarifneGrupe extends PocetnaStranica {
	
	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	private WebElement nazivFilterWE;
	
	@FindBy(xpath = "//tr[2]/td[2]")
	private WebElement nazivTabelaWE;
	
	@FindBy(xpath = "//td[9]/button")
	private WebElement burgerBarWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Uredi')]")
	private WebElement urediBtnWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Briši')]")
	private WebElement obrisiWE;
	
	@FindBy(xpath = "//div[7]/div/div/div[3]/button[2]")
	private WebElement potvrdiBrisanjeWE;
	
	@FindBy(xpath = "//tr[2]/td")
	private WebElement praznaTabelaWE;
	
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
	
	@FindBy(xpath = "//div[2]/button[1]")
	private WebElement dodajTarifnuGrupuWE;

	public TarifneGrupe(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujTarifneGrupe() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Tarifne grupe')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGrupaObrascaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNadgrupaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKategorijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMaxigrafWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaReaktivnaWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("TARIFNI SISTEM"), "TarifneGrupe: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("TARIFNE GRUPE"), "TarifneGrupe: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("TARIFNE GRUPE"), "TarifneGrupe: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 9, "TarifneGrupe: Broj kolona nije dobar! ");
	}
	
	public String dodajTarifnuGrupu() {
		String tarifnaGrupa = "TG " + getRandomName();
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivTarifneGrupeWE));
		nazivTarifneGrupeWE.sendKeys(tarifnaGrupa);
		ebixSifraWE.sendKeys(getRandomName());
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
		dodajTarifnuGrupuWE.click();
		return tarifnaGrupa;
	}
	
	public void verifikujTarifnuGrupu(String tarifnaGrupa) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(nazivFilterWE));
		nazivFilterWE.click();
		nazivFilterWE.clear();
		nazivFilterWE.sendKeys(tarifnaGrupa);
		nazivFilterWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(jedinstvenElementWE));
		wait.until(ExpectedConditions.visibilityOf(nazivTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(nazivTabelaWE.getText().equals(tarifnaGrupa), "TarifneGrupe: Ime grupe nije dobro!");
	}
	
	public String izmjeniTarifnuGrupu() {
		String tarifnaGrupa = "TG " + getRandomName();
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediBtnWE));
		urediBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivTarifneGrupeWE));
		nazivTarifneGrupeWE.click();
		nazivTarifneGrupeWE.clear();
		nazivTarifneGrupeWE.sendKeys(tarifnaGrupa);
		dodajTarifnuGrupuWE.click();
		return tarifnaGrupa;
	}
	
	public void obrisiTarifnuGrupu() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obrisiWE));
		obrisiWE.click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeWE));
		potvrdiBrisanjeWE.click();
		Thread.sleep(1000);
	}
	
	public void verifikujBrisanjeTarifneGrupe(String tarifnaGrupa) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(nazivFilterWE));
		nazivFilterWE.click();
		nazivFilterWE.clear();
		nazivFilterWE.sendKeys(tarifnaGrupa);
		nazivFilterWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(praznaTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "TarifneGrupe: Poruka prazne tabele nije dobra!");
	}

}