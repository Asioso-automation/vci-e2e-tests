package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class OperatoriDistributivnihSistema extends PocetnaStranica {

	public OperatoriDistributivnihSistema(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujOperatoriDistributivnihSistema() throws FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Operatori distributivnih sistema')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEic2WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEmailWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSapMjestoTroskaWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(stranicaBtnWE.getText().trim().equals("OPERATORI DISTRIBUTIVNIH SISTEMA"),
				"OperatoriSistema: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("OPERATORI DISTRIBUTIVNIH SISTEMA"),
				"OperatoriSistema: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 8, "OperatoriSistema: Broj kolona nije dobar! ");
	}

}