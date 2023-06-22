package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Bonifikacije extends PocetnaStranica{

	public Bonifikacije(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujBonifikacije()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), ' Bonifikacije')]")));
		verifikacijaZajednickihElemenata("KUPCI", "BONIFIKACIJE", "Bonifikacije", 12, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriod1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKreiranja1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUlicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaObjekatWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNapomena1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProcenatWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznos1WE));
	}
}
