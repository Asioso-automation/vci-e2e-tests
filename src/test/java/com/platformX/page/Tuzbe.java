package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class Tuzbe extends PocetnaStranica {

	public Tuzbe(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujTuzbe() throws FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Tužbe')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrProtokolaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPrijaveWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPotvrdeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPresudeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPocetkaObracunaKamateWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosTuzbenogZahtjevaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPresudbeniIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOstaloNeutuzenoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStatusWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("PRAVNI ODNOSI"), "Tuzbe: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("TUŽBE"), "Tuzbe: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("TUŽBE"), "Tuzbe: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 12, "Tuzbe: Broj kolona nije dobar! ");
	}

}