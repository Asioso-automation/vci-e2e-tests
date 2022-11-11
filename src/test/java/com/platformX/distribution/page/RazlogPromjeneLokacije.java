package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class RazlogPromjeneLokacije extends PocetnaStranica{
	
	public RazlogPromjeneLokacije (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujRazlogPromjeneLokacije() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Razlog promjene lokacije')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOpisWE));
		wait.until(ExpectedConditions.visibilityOf(dodajBtnWE));
		wait.until(ExpectedConditions.visibilityOf(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.visibilityOf(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.visibilityOf(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("BROJILA"), "RazlogPromjeneLokacije: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("RAZLOG PROMJENE LOKACIJE"), "RazlogPromjeneLokacije: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("RAZLOG PROMJENE LOKACIJE"), "RazlogPromjeneLokacije: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 3, "RazlogPromjeneLokacije: Broj kolona nije dobar! ");
	}

}