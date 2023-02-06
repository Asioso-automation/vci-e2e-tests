package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class UgovoreniPopusti extends PocetnaStranica {

	public UgovoreniPopusti(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujUgovoreniPopusti() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Ugovoreni popusti')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProcenat2WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNapomenaWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("KUPCI"), "UgovoreniPopusti: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("UGOVORENI POPUSTI"), "UgovoreniPopusti: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("UGOVORENI POPUSTI"), "UgovoreniPopusti: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 8, "UgovoreniPopusti: Broj kolona nije dobar! ");
	}

}