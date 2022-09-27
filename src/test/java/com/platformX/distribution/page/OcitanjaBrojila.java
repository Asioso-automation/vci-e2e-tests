package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class OcitanjaBrojila extends PocetnaStranica {
	
	public OcitanjaBrojila (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujOcitanjaBrojila()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Očitanja brojila')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCitacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKorisnikWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEic2WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSnaga1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProcijenjenoWE));
		wait.until(ExpectedConditions.visibilityOf(dodajBtnWE));
		wait.until(ExpectedConditions.visibilityOf(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.visibilityOf(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.visibilityOf(osvjeziBtnWE));
		wait.until(ExpectedConditions.visibilityOf(infoBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OČITANJA"), "OcitanjaBrojila: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("OČITANJA BROJILA"), "OcitanjaBrojila: Naziv stranice nije dobar!");
		assertTrue(naslovStranice1WE.getText().trim().equals("OČITANJA BROJILA"), "OcitanjaBrojila: Naziv stranice nije dobar!");
		//assertTrue(brojKolona().size() == 15, "OcitanjaBrojila: Broj kolona nije dobar! ");
	}
	
	// Pitati za lookupe Period, MM, Brojilo, Fizicka lokacija
}
