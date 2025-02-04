package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ZahtjeviZaObracunskeUgovore extends PocetnaStranicaPXD {
	
	public ZahtjeviZaObracunskeUgovore(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaBrojProtokolaWE, kolone.kolonaObracunskiUgovorWE, kolone.kolonaNazivKupcaWE, kolone.kolonaMjernoMjestoEicWE, 
			kolone.kolonaTarifnaGrupaWE, kolone.kolonaNoviSnabdjevacWE, kolone.kolonaOcekivaniDatumPocetkaUgovoraWE, kolone.kolonaPreregWE, kolone.kolonaPrijavaPoOdjaviWE, 
			kolone.kolonaDopunaWE, kolone.kolonaOdbWE, kolone.kolonaOtkWE, kolone.kolonaPotvrWE, kolone.kolonaPotpWE, kolone.kolonaRealizWE, kolone.kolonaPromSnabdWE, 
			kolone.kolonaPrethSnabObavWE, kolone.kolonaPrethSnabPotvrWE, kolone.kolonaPrethSnabOdbioWE, kolone.kolonaPromTarifneGrupeWE};
	
	public WebElement[] buttons = {preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE, filterBtnWE, infoBtnWE};

	public void navigirajVerifikujZahtjeviZaObracunskeUgovore() throws Exception {
		navigateOnPage(ZahtjeviZaObracunskeUgovore.class, "Obračunski ugovori", "Zahtjevi za obračunske ugovore");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Zahtjevi za obračunske ugovore')]")));
		verifikacijaStranice("Ugovori", "Zahtjevi Za Obračunske Ugovore", "Zahtjevi za obračunske ugovore (proces 1)", 1, columns, buttons);
	}
	
}