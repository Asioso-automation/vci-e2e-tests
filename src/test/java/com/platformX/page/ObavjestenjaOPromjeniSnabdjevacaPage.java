package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ObavjestenjaOPromjeniSnabdjevacaPage extends PocetnaStranica {

	public ObavjestenjaOPromjeniSnabdjevacaPage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujObavjestenjaOPromjeniSnabdjevaca() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("KUPCI"), "OdbaceniUgovori: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("OBAVJEŠTENJA O PROMJENI SNABDJEVAČA"),
				"ObavjestenjaOPromjeniSnabdjevaca: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("OBAVJEŠTENJA O PROMJENI SNABDJEVAČA"),
				"ObavjestenjaOPromjeniSnabdjevaca: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 10, "ObavjestenjaOPromjeniSnabdjevaca: Broj kolona nije dobar! ");
	}

}