package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class PravnaLica extends PocetnaStranica{

	public PravnaLica(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujPravnaLica()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), ' Pravna lica')]")));
		verifikacijaZajednickihElemenata2("KUPCI", "PRAVNA LICA", "Pravna lica", 14, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMaticniBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjesto1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUlicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBroj1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaJibWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEmail1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKorisnikIzmijenioWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumIzmjeneWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKorisnikPortalaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOslobodjenPdvaWE));
	}
	
}
