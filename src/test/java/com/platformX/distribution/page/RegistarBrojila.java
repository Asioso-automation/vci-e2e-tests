package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class RegistarBrojila extends PocetnaStranica {

	public RegistarBrojila (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujRegistarBrojila()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Registar brojila')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRedniBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSerijskiBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojDrzavnePlombeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGodinaIstekaZigaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGodinaProizvodnjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAmmIntegrisanoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDlmsIntegrisanoWE));
		wait.until(ExpectedConditions.visibilityOf(importujBtnWE));
		wait.until(ExpectedConditions.visibilityOf(dodajBtnWE));
		wait.until(ExpectedConditions.visibilityOf(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.visibilityOf(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.visibilityOf(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("BROJILA"), "RegistarBrojila: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("REGISTAR BROJILA"), "RegistarBrojila: Naziv stranice nije dobar!");
		assertTrue(naslovStranice1WE.getText().trim().equals("REGISTAR BROJILA"), "RegistarBrojila: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 9, "TipoviBrojila: Broj kolona nije dobar! ");
	}
}
