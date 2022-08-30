package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class AktivnaIskljucenjaMjernihMjesta extends PocetnaStranica {
	
	public AktivnaIskljucenjaMjernihMjesta(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujAktivnaIskljucenjaMjernihMjesta() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Aktivna iskljuèenja mjernih mjesta')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumIskljucenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlogIskljucenjaWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("MJERNA MJESTA"), "AktivnaIskljucenjaMjernihMjesta: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("AKTIVNA ISKLJUÈENJA MJERNIH MJESTA"), "AktivnaIskljucenjaMjernihMjesta: Naziv stranice nije dobar!");
		assertTrue(naslovStranice1WE.getText().trim().equals("AKTIVNA ISKLJUÈENJA MJERNIH MJESTA"), "AktivnaIskljucenjaMjernihMjesta: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 4, "AktivnaIskljucenjaMjernihMjesta: Broj kolona nije dobar! ");
	}
	
}
