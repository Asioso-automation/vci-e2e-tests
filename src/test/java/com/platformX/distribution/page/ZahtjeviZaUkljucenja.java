package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ZahtjeviZaUkljucenja extends PocetnaStranicaPXD {
	
	public ZahtjeviZaUkljucenja(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaBrojProtokolaWE, kolone.kolonaKupacWE, kolone.kolonaMjernoMjestoEicWE, kolone.kolonaSnabdjevacWE, 
			kolone.kolonaTipUgovoraWE, kolone.kolonaFizickaLokacijaWE, kolone.kolonaRazlogIskljucenjaWE, kolone.kolonaDatumKreiranjaWE, kolone.kolonaIniciraoSnabdjevacWE, 
			kolone.kolonaOtkazanWE, kolone.kolonaOdbijenWE, kolone.kolonaPotvrdjenWE, kolone.kolonaNezavrsenNalogZaZamjenuBrojila, kolone.kolonaZahtjevZavrsenWE, 
			kolone.kolonaUkljucenjeRealizovanoWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE, filterBtnWE, infoBtnWE};
	
	public void navigirajVerifikujZahtjeviZaUkljucenja() throws Exception {
		navigateOnPage(ZahtjeviZaUkljucenja.class, "Mjerna mjesta", "Zahtjevi za uključenja");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Zahtjevi za uključenja')]")));
		verifikacijaStranice("Mjerna mjesta", "Zahtjevi Za Uključenja", "Zahtjevi za uključenja (proces 16)", 1, columns, buttons);
	}
	
}