package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class KorekcijeOcitanja extends PocetnaStranica {
	
	public KorekcijeOcitanja (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujKorekcijeOcitanja()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Korekcije očitanja')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKorigovanogOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStariNoviAvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStariNoviAmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStariNoviRvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStariNoviRmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStaraNovaSnagaWE));
		wait.until(ExpectedConditions.visibilityOf(dodajBtnWE));
		wait.until(ExpectedConditions.visibilityOf(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.visibilityOf(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.visibilityOf(osvjeziBtnWE));
		wait.until(ExpectedConditions.visibilityOf(infoBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OČITANJA"), "KorekcijeOcitanja: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("KOREKCIJE OČITANJA"), "KorekcijeOcitanja: Naziv stranice nije dobar!");
		assertTrue(naslovStranice1WE.getText().trim().equals("KOREKCIJE OČITANJA"), "KorekcijeOcitanja: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 14, "KorekcijeOcitanja: Broj kolona nije dobar! ");
	}
	
}