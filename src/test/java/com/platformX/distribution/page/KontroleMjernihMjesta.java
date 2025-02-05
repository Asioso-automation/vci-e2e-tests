package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class KontroleMjernihMjesta extends PocetnaStranicaPXD {
	
	public KontroleMjernihMjesta(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaBrojProtokolaWE, kolone.kolonaPoRadnomNaloguWE, kolone.kolonaTipMjerenjaWE, 
			kolone.kolonaMjernoMjestoEicWE, kolone.kolonaNazivMjernogMjestaWE, kolone.kolonaBrojiloWE, kolone.kolonaFizickaLokacijaWE, 
			kolone.kolonaRazlogKontroleWE, kolone.kolonaStatusWE, kolone.kolonaKreiraoKorisnikWE, kolone.kolonaZavrsioKorisnikWE, kolone.kolonaDatumKreiranjaWE, 
			kolone.kolonaDatumRealizacijeWE, kolone.kolonaDatumZavrsavanjaWE, kolone.kolonaNedostupnoMjmWE, kolone.kolonaKontrolaOcitanjaWE, 
			kolone.kolonaZKMjernoMjestoWE, kolone.kolonaZavrsenaWE};
	
	public WebElement[] buttons = {dodajSveBtnWE, dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};
	
	public void navigirajVerifikujKontroleMjernihMjesta() throws Exception {
		navigateOnPage(KontroleMjernihMjesta.class, "Mjerna mjesta", "Kontrole mjernih mjesta");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Kontrole mjernih mjesta')]")));
		verifikacijaStranice("Mjerna mjesta", "Kontrole Mjernih Mjesta", "Kontrole mjernih mjesta", 1, columns, buttons);
	}

}