package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class IzmijenjenaOcitanja extends PocetnaStranica{
	
	public IzmijenjenaOcitanja (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujIzmijenjenaOcitanja()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Izmijenjena očitanja')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCitacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKorisnikWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStariNoviAvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStariNoviAmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStariNoviRvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStariNoviRmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStaraNovaSnagaWE));
		wait.until(ExpectedConditions.visibilityOf(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.visibilityOf(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.visibilityOf(osvjeziBtnWE));
		wait.until(ExpectedConditions.visibilityOf(infoBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OČITANJA"), "IzmijenjenaOcitanja: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("IZMIJENJENA OČITANJA"), "IzmijenjenaOcitanja: Naziv stranice nije dobar!");
		assertTrue(naslovStranice1WE.getText().trim().equals("IZMIJENJENA OČITANJA"), "IzmijenjenaOcitanja: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 13, "IzmijenjenaOcitanja: Broj kolona nije dobar! ");
	}

}
