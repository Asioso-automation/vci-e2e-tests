package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class Prijave extends PocetnaStranica {

	public Prijave(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujPrijave()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Prijave')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumApliciranjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSnagaPretvaracaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUsluzniCentarWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStatusWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGodisnjaPotrosnjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPoeniWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("KUPCI-PROIZVOĐAČI"), "Prijave: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("PRIJAVE"), "Prijave: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("PRIJAVE"), "Prijave: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 10, "Prijave: Broj kolona nije dobar! ");
	}
	
}
