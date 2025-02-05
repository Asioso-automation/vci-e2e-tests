package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ZahtjeviZaIskljucenja extends PocetnaStranicaPXD {

	public ZahtjeviZaIskljucenja(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaBrojProtokolaWE, kolone.kolonaKupacWE, kolone.kolonaMjernoMjestoEicWE, kolone.kolonaSnabdjevacWE, 
			kolone.kolonaTipUgovoraWE, kolone.kolonaFizickaLokacijaWE, kolone.kolonaPlaniraniDatumIskljucenjaOdWE, kolone.kolonaPlaniraniDatumIskljucenjaDoWE, 
			kolone.kolonaIniciraoSnabdjWE, kolone.kolonaOtkWE, kolone.kolonaOdbWE, kolone.kolonaPotvrWE, kolone.kolonaObavjKupacWE, kolone.kolonaNezavrsenNalogZaZamjenuBrojila, 
			kolone.kolonaZavrWE, kolone.kolonaIskljRealizWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE, filterBtnWE, infoBtnWE};
	
	public void navigirajVerifikujZahtjeviZaIskljucenja() throws Exception {
		navigateOnPage(ZahtjeviZaIskljucenja.class, "Mjerna mjesta", "Zahtjevi za isključenja");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Zahtjevi za isključenja')]")));
		verifikacijaStranice("Mjerna mjesta", "Zahtjevi Za Isključenja", "Zahtjevi za isključenja (proces 16)", 1, columns, buttons);
	}

}