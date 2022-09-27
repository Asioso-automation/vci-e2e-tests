package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class ImportiOcitanja extends PocetnaStranica {
	
	public ImportiOcitanja (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujImportiOcitanja()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Importi očitanja')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKorisnikWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCitacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrafoStanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPrvogOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumZadnjegOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIzvorOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUspjesnoImportovanoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojPogresnihUnosaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojUnosaBezVrijednostiSaNapomenomWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojUnosaBezVrijednostBezNapomeneWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNevalidnaOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(importujBtnWE));
		wait.until(ExpectedConditions.visibilityOf(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.visibilityOf(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.visibilityOf(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OČITANJA"), "ImportiOcitanja: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("IMPORTI OČITANJA"), "ImportiOcitanja: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("IMPORTI OČITANJA"), "ImportiOcitanja: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 15, "ImportiOcitanja: Broj kolona nije dobar! ");
	}
}
