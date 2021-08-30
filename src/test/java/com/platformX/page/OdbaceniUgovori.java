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

public class OdbaceniUgovori extends PocetnaStranica {

	public OdbaceniUgovori(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//td[4]/div/div/div/div/input")
	private WebElement pretraziMjernaMjestaWE;
	
	@FindBy(xpath = "//tr[2]/td[4]/a")
	private WebElement mjernoMjestoTabelaWE;

	public void verifikujOdbaceniUgovori() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Odbačeni ugovori')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaDostaveWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTGWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKategorijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVaziOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVaziDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdbacenWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNapomenaWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("KUPCI"), "OdbaceniUgovori: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("ODBAČENI UGOVORI"), "OdbaceniUgovori: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("ODBAČENI UGOVORI"), "OdbaceniUgovori: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 11, "OdbaceniUgovori: Broj kolona nije dobar! ");
	}
	
	public void verifikujOdbaceniUgovor(String mjernoMjesto) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(pretraziMjernaMjestaWE));
		Thread.sleep(1000);
		pretraziMjernaMjestaWE.click();
		pretraziMjernaMjestaWE.clear();
		pretraziMjernaMjestaWE.sendKeys(mjernoMjesto);
		pretraziMjernaMjestaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(mjernoMjestoTabelaWE));
		assertTrue(mjernoMjestoTabelaWE.getText().contains(mjernoMjesto), "Ugovori: Naziv mjernog mjesta nije dobar!");
	}

}