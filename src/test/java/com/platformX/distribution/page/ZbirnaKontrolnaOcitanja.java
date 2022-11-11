package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ZbirnaKontrolnaOcitanja extends PocetnaStranica{

	public ZbirnaKontrolnaOcitanja (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujZbirnaKontrolnaOcitanja()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Zbirna/kontrolna očitanja')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIzvorOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZbirnoKontrolnoMjernoMjestoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSnaga1WE));
		wait.until(ExpectedConditions.visibilityOf(dodajBtnWE));
		wait.until(ExpectedConditions.visibilityOf(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.visibilityOf(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.visibilityOf(osvjeziBtnWE));
		wait.until(ExpectedConditions.visibilityOf(infoBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OČITANJA"), "ZbirnaKontrolnaOcitanja: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("ZBIRNA/KONTROLNA OČITANJA"), "ZbirnaKontrolnaOcitanja: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("ZBIRNA/KONTROLNA OČITANJA"), "ZbirnaKontrolnaOcitanja: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 13, "ZbirnaKontrolnaOcitanja: Broj kolona nije dobar! ");
	}

}