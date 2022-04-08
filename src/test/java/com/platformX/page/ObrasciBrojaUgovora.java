package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ObrasciBrojaUgovora extends PocetnaStranica {

	public ObrasciBrojaUgovora(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujObrasciBrojaUgovora() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Obrasci broja ugovora')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGrupaObrascaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdsWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaObrazacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumDoWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("KUPCI"), "ObrasciBrojaUgovora: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("OBRASCI BROJA UGOVORA"), "ObrasciBrojaUgovora: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("OBRASCI BROJA UGOVORA"), "ObrasciBrojaUgovora: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 7, "ObrasciBrojaUgovora: Broj kolona nije dobar! ");
	}

}