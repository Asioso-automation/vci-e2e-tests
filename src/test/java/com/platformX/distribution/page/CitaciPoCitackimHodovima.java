package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class CitaciPoCitackimHodovima extends PocetnaStranica{

	public CitaciPoCitackimHodovima (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujCitaciPoCitackimHodovima()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Čitači po čitačkim hodovima')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKvalifikovaniCitacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCitacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCitackiHodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdRedgnoBrojaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDoRednogBrojaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivanWE));
		wait.until(ExpectedConditions.visibilityOf(dodajBtnWE));
		wait.until(ExpectedConditions.visibilityOf(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.visibilityOf(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.visibilityOf(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OČITANJA"), "CitaciPoCitackimHodovima: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("ČITAČI PO ČITAČKIM HODOVIMA"), "CitaciPoCitackimHodovima: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("ČITAČI PO ČITAČKIM HODOVIMA"), "CitaciPoCitackimHodovima: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 11, "CitaciPoCitackimHodovima: Broj kolona nije dobar! ");
	}

}