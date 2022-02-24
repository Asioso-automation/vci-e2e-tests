package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class TrafoStanice extends PocetnaStranica {

	public TrafoStanice(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujTrafoStanice() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Trafo stanice')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSifraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVlasnikWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrenosniOdnosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOmjerPrenosaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSnaga1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivnaWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("ŠIFARNICI"), "TrafoStanice: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("TRAFO STANICE"), "TrafoStanice: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("TRAFO STANICE"), "TrafoStanice: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 12, "TrafoStanice: Broj kolona nije dobar! ");
	}

}