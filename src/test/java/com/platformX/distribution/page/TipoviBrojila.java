package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class TipoviBrojila extends PocetnaStranicaPXD {
	
	public TipoviBrojila (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujTipoviBrojila () throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Tipovi brojila')]")));
		verifikacijaZajednickihElemenata("Šifarnici", "Tipovi Brojila", "Tipovi brojila", 16, false, false, true, true, true, true, true);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNivoStrujeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojSkalaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojCifaraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojDecCifaraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojCifaraMaksigrafaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojDecCifaraMaksigrafaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKlasaTacnostiAktivneEnWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKlasaTacnostiReaktivneEnWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKlasaTacnostiSnageWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjeriAktivnuEnWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjeriReaktivnuEnWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjeriSnaguWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaValidanWE));
	}
	
}