package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class NevalidnaOcitanja extends PocetnaStranicaPXD {

	public NevalidnaOcitanja (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaBrojiloWE, kolone.kolonaMjernoMjestoEicWE, kolone.kolonaNazivMjernogMjestaWE, 
			kolone.kolonaTrafostanicaWE, kolone.kolonaCitacWE, kolone.kolonaRazlogWE, kolone.kolonaAvtWE, kolone.kolonaAmtWE, kolone.kolonaRvtWE, 
			kolone.kolonaRmtWE, kolone.kolonaSnaga1WE, kolone.kolonaAvt1WE, kolone.kolonaAmt1WE, kolone.kolonaRvt1WE, kolone.kolonaRmt1WE, 
			kolone.kolonaSnagaMinusWE, kolone.kolonaPorukaCitacaWE, kolone.kolonaDatumWE, kolone.kolonaZbirnoKontrolnoOcitanjeWE, kolone.kolonaRijesenoWE};
	
	public WebElement[] buttons = {preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};

	public void verifikujNevalidnaOcitanja()throws Exception {
		navigateOnPage(NevalidnaOcitanja.class, "Očitanja", "Nevalidna očitanja");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Nevalidna očitanja')]")));
		verifikacijaStranice("Očitanja", "Nevalidna Očitanja", "Nevalidna očitanja", 2, columns, buttons);
	}

}