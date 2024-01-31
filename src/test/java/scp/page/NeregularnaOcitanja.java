package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class NeregularnaOcitanja extends PocetnaStranica{

	public NeregularnaOcitanja(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	public void verifikujNeregularnaOcitanja()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Neregularna očitanja')]")));
		verifikacijaZajednickihElemenata("OČITANJA", "NEREGULARNA OČITANJA", "Neregularna očitanja", 13, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjeriloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZonaOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIzmijenioKorisnikWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrijemeUnosa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPrethodnogOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrethodnoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNovoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlikaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPostojiRedovnoWE));
	}
	
}
