package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class IzmijenjenaOcitanja extends PocetnaStranicaPXD {
	
	public IzmijenjenaOcitanja (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaBrojiloWE, kolone.kolonaMjernoMjestoEicWE, kolone.kolonaNazivMjernogMjestaWE, kolone.kolonaFizickaLokacijaWE, 
			kolone.kolonaInicijalniUnosWE, kolone.kolonaIzmjenaWE, kolone.kolonaDatumWE, kolone.kolonaStariNoviAvtWE, kolone.kolonaStariNoviAmtWE, kolone.kolonaStariNoviRvtWE, 
			kolone.kolonaStariNoviRmtWE, kolone.kolonaStaraNovaSnagaWE, kolone.kolonaStariNoviAvtMinusWE, kolone.kolonaStariNoviAmtMinusWE, 
			kolone.kolonaStariNoviRvtMinusWE, kolone.kolonaStariNoviRmtMinusWE, kolone.kolonaStaraNovaSnagaMinusWE, kolone.kolonaIskljuceniSaPotrosnjomWE};
	
	public WebElement[] buttons = {ukloniFiltereBtnWE, preuzmiExcelBtnWE, osvjeziBtnWE, infoBtnWE};

	public void verifikujIzmijenjenaOcitanja()throws Exception {
		navigateOnPage(IzmijenjenaOcitanja.class, "Očitanja", "Izmijenjena očitanja");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Izmijenjena očitanja')]")));
		verifikacijaStranice("Očitanja", "Izmijenjena Očitanja", "Izmijenjena očitanja", 0, columns, buttons);
	}

}