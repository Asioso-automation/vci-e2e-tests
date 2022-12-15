package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class VrsteZastitnihUredjaja extends PocetnaStranica{

	public VrsteZastitnihUredjaja(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujVrsteZastitnihUredjaja() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Vrste zaštitnih uređaja')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("ŠIFARNICI"), "VrsteZastitnihUredjaja: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("VRSTE ZAŠTITNIH UREĐAJA"), "VrsteZastitnihUredjaja: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("VRSTE ZAŠTITNIH UREĐAJA"), "VrsteZastitnihUredjaja: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 3, "VrsteZastitnihUredjaja: Broj kolona nije dobar! ");
	}

}
