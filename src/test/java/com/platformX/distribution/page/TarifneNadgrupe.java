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

public class TarifneNadgrupe extends PocetnaStranica {

	public TarifneNadgrupe(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//input") 
	private WebElement nazivTarifneNadrupeWE;
	
	@FindBy(xpath = "//div[2]/button[1]") 
	private WebElement dodajBtn1WE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	private WebElement filterPoNazivuWE;
	
	@FindBy(xpath = "//tr[2]/td[2]")
	private WebElement nazivTarifneNadgrupeTabelaWE;
	
	@FindBy(xpath = "//td[3]/button/span/i")
	private WebElement burgerBarWE;

	public void verifikujTarifneNadgrupe() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Tarifne nadgrupe')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("TARIFNI SISTEM"), "TarifneNadgrupe: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("TARIFNE NADGRUPE"), "TarifneNadgrupe: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("TARIFNE NADGRUPE"), "TarifneNadgrupe: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 3, "TarifneNadgrupe: Broj kolona nije dobar! ");
	}

	public String dodajTarifnuNadrgupu() throws InterruptedException{
		String naziv = "Tarifna nadgrupa" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivTarifneNadrupeWE));
		nazivTarifneNadrupeWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtn1WE));
		dodajBtn1WE.click();
		return naziv;
	}
	
	public void verifikujTarifnuNadgrupu(String naziv) throws Exception {
		wait.until(ExpectedConditions.visibilityOf(filterPoNazivuWE));
		filterPoNazivuWE.click();
		filterPoNazivuWE.clear();
		filterPoNazivuWE.sendKeys(naziv);
		filterPoNazivuWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(nazivTarifneNadgrupeTabelaWE));
		assertTrue(nazivTarifneNadgrupeTabelaWE.getText().equals(naziv), "TarfinaNadgrupa: Tarifna nadgrupa nije pronadjena!");
	}
	
	public String urediTarifnuNadgrupu()throws InterruptedException {
		String tarifnaNadrgupa = "Tarifna nadrgupa" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivTarifneNadrupeWE));
		nazivTarifneNadrupeWE.click();
		nazivTarifneNadrupeWE.clear();
		nazivTarifneNadrupeWE.sendKeys(tarifnaNadrgupa);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtn1WE));
		dodajBtn1WE.click();
		return tarifnaNadrgupa;
	}
	
	public void obrisiTarifnuNadgrupu()throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obrisiWE));
		obrisiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeBtnWE));
		potvrdiBrisanjeBtnWE.click();
	}
	
	public void verifikujBrisanjeTarifneNadrgupe(String tarifnaNadgrupa)throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(filterPoNazivuWE));
		filterPoNazivuWE.click();
		filterPoNazivuWE.clear();
		filterPoNazivuWE.sendKeys(tarifnaNadgrupa);
		filterPoNazivuWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(praznaTabelaWE));
		assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "TarifnaNadgrupa: Poruka prazne tabele nije dobra!");
	}
	
}