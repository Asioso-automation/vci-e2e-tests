package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ZbirnaKontrolnaPotrosnja extends PocetnaStranicaPXD {
	
	public ZbirnaKontrolnaPotrosnja (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaZbirnoKontrolnoMjernoMjestoWE, kolone.kolonaTrafostanicaWE, kolone.kolonaFizickaLokacijaWE, 
			kolone.kolonaAktivnaPreuzetaWE, kolone.kolonaReaktivnaPreuzetaWE, kolone.kolonaSnagaPreuzetaWE, kolone.kolonaAktivnaObracunataWE, 
			kolone.kolonaReaktivnaObracunataWE, kolone.kolonaAktivnaRazlikaWE, kolone.kolonaAktivna1RazlikaWE, kolone.kolonaReaktivnaRazlikaWE, 
			kolone.kolonaAktivnaKorekcijeWE, kolone.kolonaReaktivnaKorekcijeWE, kolone.kolonaAktivnaSaKorekcijamaWE, kolone.kolonaObracunataNeovlastenaWE, 
			kolone.kolonaDatumPrvogOcitanjaWE, kolone.kolonaDatumPosljednjegOcitanjaWE};
	
	public WebElement[] buttons = {preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};

	public void navigirajVerifikujZbirnaKontrolnaPotrosnja()throws Exception {
		navigateOnPage(ZbirnaKontrolnaPotrosnja.class, "Očitanja", "Zbirna/kontrolna potrošnja");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Zbirna/kontrolna potrošnja')]")));
		verifikacijaStranice("Očitanja", "Zbirna/kontrolna Potrošnja", "Zbirna/kontrolna potrošnja", 0, columns, buttons);
	}

}