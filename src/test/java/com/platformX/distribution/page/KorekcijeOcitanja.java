package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class KorekcijeOcitanja extends PocetnaStranicaPXD {
	
	public KorekcijeOcitanja (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaMjernoMjestoEicWE, kolone.kolonaNazivMjernogMjestaWE, kolone.kolonaBrojiloWE, kolone.kolonaKupacWE, 
			kolone.kolonaKorisnikWE, kolone.kolonaFizickaLokacijaWE, kolone.kolonaDatumWE, kolone.kolonaDatumKorigovanogOcitanjaWE, kolone.kolonaStariNoviAvtWE, kolone.kolonaStariNoviAmtWE, 
			kolone.kolonaStariNoviRvtWE, kolone.kolonaStariNoviRmtWE, kolone.kolonaStaraNovaSnagaWE, kolone.kolonaStariNoviAvtMinusWE, kolone.kolonaStariNoviAmtMinusWE, 
			kolone.kolonaStariNoviRvtMinusWE, kolone.kolonaStariNoviRmtMinusWE, kolone.kolonaStaraNovaSnagaMinusWE};
	
	public WebElement[] buttons = {dodajBtnWE, brisanjeBtnWE, ukloniFiltereBtnWE, preuzmiExcelBtnWE, osvjeziBtnWE, infoBtnWE};

	public void navigirajVerifikujKorekcijeOcitanja()throws Exception {
		navigateOnPage(KorekcijeOcitanja.class, "Očitanja", "Korekcije očitanja");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Korekcije očitanja')]")));
		verifikacijaStranice("Očitanja", "Korekcije Očitanja", "Korekcije očitanja", 1, columns, buttons);
	}
	
}