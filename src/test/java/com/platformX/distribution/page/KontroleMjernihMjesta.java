package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class KontroleMjernihMjesta extends PocetnaStranicaPXD {
	
	public KontroleMjernihMjesta(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujKontroleMjernihMjesta() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Kontrole mjernih mjesta')]")));
		verifikacijaZajednickihElemenata("Mjerna Mjesta", "Kontrole Mjernih Mjesta", "Kontrole mjernih mjesta", 18, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojProtokolaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPoRadnomNaloguWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipMjerenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlogKontroleWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKreiraoKorisnikWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZavrsioKorisnikWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKreiranjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumZavrsavanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNedostupnoMjmWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKontrolaOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZKMjernoMjestoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZavrsenaWE));
	}

}