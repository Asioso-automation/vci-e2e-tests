package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Vodomjeri extends PocetnaStranica{

	public Vodomjeri(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujVodomjere()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), ' Vodomjeri')]")));
		verifikacijaZajednickihElemenata("KUPCI", "MJERILA", "Mjerila", 13, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZonaOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrUZoniOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSrBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOznakaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipVodomjeraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProizvodjacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProfilVodomjeraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivan1WE));
	}
}
