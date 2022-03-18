package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class StecajeviLikvidacije extends PocetnaStranica {

	public StecajeviLikvidacije(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujStecajeviLikvidacije() throws FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Stečajevi')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrProtokolaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumZahtjevaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZakljucenWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("PRAVNI ODNOSI"), "StecajeviLikvidacije: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("STEČAJEVI/LIKVIDACIJE"), "StecajeviLikvidacije: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("STEČAJEVI/LIKVIDACIJE"), "StecajeviLikvidacije: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 7, "StecajeviLikvidacije: Broj kolona nije dobar! ");
	}

}