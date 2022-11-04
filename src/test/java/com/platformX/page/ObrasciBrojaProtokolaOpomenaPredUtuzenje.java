package com.platformX.page;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class ObrasciBrojaProtokolaOpomenaPredUtuzenje extends PocetnaStranica {

	public ObrasciBrojaProtokolaOpomenaPredUtuzenje(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujObrasciBrojaProtokolaOpomenaPredUtuzenje() throws FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Obrasci broja protokola opomena pred utuženje')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaObrazacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumDoWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("PRAVNI ODNOSI"), "ObrasciBrojaProtokolaOpomenaPredUtuzenje: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("OBRASCI BROJA PROTOKOLA OPOMENA PRED UTUŽENJE"), "ObrasciBrojaProtokolaOpomenaPredUtuzenje: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("OBRASCI BROJA PROTOKOLA OPOMENA PRED UTUŽENJE"), "ObrasciBrojaProtokolaOpomenaPredUtuzenje: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 5, "ObrasciBrojaProtokolaOpomenaPredUtuzenje: Broj kolona nije dopomenePredUtubar!");
	}

}
