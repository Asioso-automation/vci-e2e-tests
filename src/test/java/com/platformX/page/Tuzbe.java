package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class Tuzbe extends PocetnaStranica {

	public Tuzbe(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujTuzbe() throws FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Tužbe')]")));
		verifikacijaZajednickihElemenata("Pravni Odnosi", "Tužbe", "Tužbe", 14, false, false, true, true, true, true, false);
		// TODO dodati verifikacije novih kolona
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrProtokolaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaReferentWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPrijaveWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPotvrdeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPresudeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPravosnaznostiWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosTuzbenogZahtjevaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPresudbeniIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOstaloNeutuzenoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFinasijskeIzmjeneWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStatusWE));
	}

}