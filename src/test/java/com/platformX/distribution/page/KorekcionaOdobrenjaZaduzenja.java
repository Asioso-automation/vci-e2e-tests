package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class KorekcionaOdobrenjaZaduzenja extends PocetnaStranicaPXD {

	public KorekcionaOdobrenjaZaduzenja(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaEnergetskiObracunWE, kolone.kolonaKupacWE, kolone.kolonaKorisnikWE, 
			kolone.kolonaMjernoMjestoEicWE, kolone.kolonaDatumWE, kolone.kolonaAvtWE, kolone.kolonaAmtWE, kolone.kolonaRvtWE, kolone.kolonaRmtWE, 
			kolone.kolonaSnaga1WE};
	
	public WebElement[] buttons = {preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};

	public void navigirajVerifikujKorekcionaOdobrenjaZaduzenja()throws Exception {
		navigateOnPage(KorekcionaOdobrenjaZaduzenja.class, "Obračun", "Korekciona odobrenja/zaduženja");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Korekciona odobrenja/zaduženja')]")));
		verifikacijaStranice("Obračun", "Korekciona Odobrenja/zaduženja", "Korekciona odobrenja/zaduženja", 1, columns, buttons);
	}

}