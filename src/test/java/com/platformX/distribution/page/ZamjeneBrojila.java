package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ZamjeneBrojila extends PocetnaStranicaPXD {

	public ZamjeneBrojila(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujZamjeneBrojila() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Zamjene brojila')]")));
		verifikacijaZajednickihElemenata("Brojila", "Zamjene Brojila", "Zamjene brojila", 20, false, true, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojZapisnikaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojRadnogNalogaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));		
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivMjernogMjestaWE));		
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaMjernogMjestaWE));		
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrafostanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojTipSkinutogBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojTipPostavljenogBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipKonekcijePostavljenogBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlogZamjeneBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStatusWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKreiraoKorisnikWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZavrsioKorisnikWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKreiranjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumRealizacijeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZbirnoMjernoMjestoWE));
	}
	
}