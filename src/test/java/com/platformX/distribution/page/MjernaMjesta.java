package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class MjernaMjesta extends PocetnaStranica {

	public MjernaMjesta(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujMjernaMjesta() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Mjerna mjesta')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEic2WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSifraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUgovoreniNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivniUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTerenskaJedinicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrafoStanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCitackiHodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPodNaponomWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivanUgovorWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("MJERNA MJESTA"), "MjernaMjesta: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("MJERNA MJESTA"), "MjernaMjesta: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("MJERNA MJESTA"), "MjernaMjesta: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 13, "MjernaMjesta: Broj kolona nije dobar! ");
	}
	
}