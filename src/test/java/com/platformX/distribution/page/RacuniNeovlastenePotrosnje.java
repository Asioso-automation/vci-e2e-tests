package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class RacuniNeovlastenePotrosnje extends PocetnaStranicaPXD {

	public RacuniNeovlastenePotrosnje(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujRacuniNeovlastenePotrosnje() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Računi neovlaštene potrošnje')]")));
		verifikacijaZajednickihElemenata2("Neovlaštena Potrošnja", "Računi Neovlaštene Potrošnje", "Računi neovlaštene potrošnje", 17, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNeovlastenaPotrosnjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSerijskiBrojWE));		
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPozivNaBrojWE));		
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosEnergijeBezPdvWE));		
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosSnageBezPdvWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosPdvaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosSaPdvomWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumRacunaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPlacanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRacunZakljucioWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZakljucenWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPostojiOdobrenjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStorniranWE));
	}	
	
}