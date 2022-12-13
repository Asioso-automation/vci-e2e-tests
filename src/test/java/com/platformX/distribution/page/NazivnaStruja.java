package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class NazivnaStruja extends PocetnaStranica {

	public NazivnaStruja(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujNazivnaStruja() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Nazivna struja')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrijednostWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("�IFARNICI"), "NazivnaStruja: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("NAZIVNA STRUJA"), "NazivnaStruja: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("NAZIVNA STRUJA"), "NazivnaStruja: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 3, "NazivnaStruja: Broj kolona nije dobar! ");
	}

}