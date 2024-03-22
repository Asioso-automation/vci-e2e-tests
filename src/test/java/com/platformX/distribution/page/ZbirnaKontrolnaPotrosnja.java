package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ZbirnaKontrolnaPotrosnja extends PocetnaStranicaPXD {
	
	public ZbirnaKontrolnaPotrosnja (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujZbirnaKontrolnaPotrosnja()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Zbirna/kontrolna potrošnja')]")));
		verifikacijaZajednickihElemenata("Očitanja", "Zbirna/kontrolna Potrošnja", "Zbirna/kontrolna potrošnja", 16, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZbirnoKontrolnoMjernoMjestoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrafostanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivnaPreuzetaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaReaktivnaPreuzetaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSnagaPreuzetaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivnaObracunZaPeriodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaReaktivnaObracunZaPeriodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlikaAktivnaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlikaAktivna1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlikaReaktivnaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivnaKorekcijeZaPeriodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaReaktivnaKorekcijeZaPeriodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivnaSaKorekcijamaZaPeriodWE));
//		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNeovlastenaAktivnaObracunZaPeriodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPrvogOcitanjaZaPeriodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPosljednjegOcitanjaZaPeriodWE));
	}

}