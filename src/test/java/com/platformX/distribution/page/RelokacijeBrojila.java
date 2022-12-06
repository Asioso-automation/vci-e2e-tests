package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class RelokacijeBrojila extends PocetnaStranica{
	
	public RelokacijeBrojila (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujRelokacijeBrojila() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Relokacije brojila')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlogPromjeneLokacijeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaValidnostWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumDoWE));
		wait.until(ExpectedConditions.visibilityOf(dodajBtnWE));
		wait.until(ExpectedConditions.visibilityOf(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.visibilityOf(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.visibilityOf(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("BROJILA"), "RelokacijeBrojila: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("RELOKACIJE BROJILA"), "RelokacijeBrojila: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("RELOKACIJE BROJILA"), "RelokacijeBrojila: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 9, "RelokacijeBrojila: Broj kolona nije dobar! ");
	}

}