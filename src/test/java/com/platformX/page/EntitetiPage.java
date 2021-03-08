package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EntitetiPage extends PocetnaStranica {

	public EntitetiPage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujEntiteti() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("ŠIFARNICI"), "Entiteti: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("ENTITETI"), "Entiteti: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("ENTITETI"), "Entiteti: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 3, "Entiteti: Broj kolona nije dobar! ");
	}

}