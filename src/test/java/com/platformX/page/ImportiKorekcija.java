package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class ImportiKorekcija extends PocetnaStranica{

	public ImportiKorekcija(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	public void verifikujImporteKorekcija() throws InterruptedException, FileNotFoundException, IOException{
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Importi korekcija')]")));
		verifikacijaZajednickihElemenata2("Obračun", "Importi Korekcija", "Importi korekcija", 11, false, false, false, false, true, true, false);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//header/div/button[1]/span")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdsWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumImportaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivFajlaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUkupanBrojRedovaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRedovaSaGreskomWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFajlGresakaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFajlNeproknjizenihKorekcijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaObradjenaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPostojeKorekcijeSaNepoznatimRacunomWE));
	}
}
