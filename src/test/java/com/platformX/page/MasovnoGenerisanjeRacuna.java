package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class MasovnoGenerisanjeRacuna extends PocetnaStranica{

	public MasovnoGenerisanjeRacuna(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujMasovnoGenerisanjeRacuna() throws InterruptedException, FileNotFoundException, IOException{
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Masovno generisanje računa')]")));
		verifikacijaZajednickihElemenata("Obračun", "Masovno Generisanje", "Masovno generisanje računa", 15, false, false, true, true, true, true, false);
		// TODO dodati verifikacije novih kolona
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdsWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipUgovoraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNacinSlanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKreiraoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStatusWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZakljucenWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOtkazanWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaObrisanWE));
	}
}
