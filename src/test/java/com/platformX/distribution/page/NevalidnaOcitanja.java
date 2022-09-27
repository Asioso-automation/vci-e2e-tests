package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class NevalidnaOcitanja extends PocetnaStranica{

	public NevalidnaOcitanja (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujNevalidnaOcitanja()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Nevalidna očitanja')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrafoStanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCitacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlogWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSnaga1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPorukaCitacaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZbirnoKontrolnoOcitanjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRijesenoWE));
		//wait.until(ExpectedConditions.visibilityOf(preuzmiExcelBtnWE));
		//wait.until(ExpectedConditions.visibilityOf(ukloniFiltereBtnWE));
		//wait.until(ExpectedConditions.visibilityOf(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OČITANJA"), "NevalidnaOcitanja: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("NEVALIDNA OČITANJA"), "NevalidnaOcitanja: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("NEVALIDNA OČITANJA"), "NevalidnaOcitanja: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 15, "NevalidnaOcitanja: Broj kolona nije dobar! ");
		
		// PITATI ZA BTNS 
	}
}
