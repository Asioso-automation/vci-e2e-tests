package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class CitaciPoCitackimHodovima extends PocetnaStranicaPXD {

	public CitaciPoCitackimHodovima (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaKvalifikovaniCitacWE, kolone.kolonaCitacWE, kolone.kolonaFizickaLokacijaWE, kolone.kolonaCitackiHodWE, 
			kolone.kolonaOdRedgnoBrojaWE, kolone.kolonaDoRednogBrojaWE, kolone.kolonaPeriodOdWE, kolone.kolonaPeriodDoWE, kolone.kolonaAktivanWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};

	public void navigirajVerifikujCitaciPoCitackimHodovima()throws Exception {
		navigateOnPage(CitaciPoCitackimHodovima.class, "Očitanja", "Čitači po čitačkim hodovima");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Čitači po čitačkim hodovima')]")));
		verifikacijaStranice("Očitanja", "Čitači Po Čitačkim Hodovima", "Čitači po čitačkim hodovima", 1, columns, buttons);
	}

}