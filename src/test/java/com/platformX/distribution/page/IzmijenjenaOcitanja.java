package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class IzmijenjenaOcitanja extends PocetnaStranicaPXD {
	
	public IzmijenjenaOcitanja (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujIzmijenjenaOcitanja()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Izmijenjena očitanja')]")));
		verifikacijaZajednickihElemenata("Očitanja", "Izmijenjena Očitanja", "IZMIJENJENA OČITANJA", 13, false, false, false, true, true, true, true);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaInicijalniUnosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIzmjenaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStariNoviAvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStariNoviAmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStariNoviRvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStariNoviRmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStaraNovaSnagaWE));
	}

}