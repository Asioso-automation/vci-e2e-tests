package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class AktivnaIskljucenja extends PocetnaStranica {

	public AktivnaIskljucenja(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujAktivnaIskljucenja() throws FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Aktivna')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdsWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIskljucenWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlogIskljucenjaWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("PRAVNI ODNOSI"), "AktivnaIskljucenja: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("AKTIVNA ISKLJUČENJA"), "AktivnaIskljucenja: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("AKTIVNA ISKLJUČENJA"), "AktivnaIskljucenja: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 8, "AktivnaIskljucenja: Broj kolona nije dobar! ");
	}

}