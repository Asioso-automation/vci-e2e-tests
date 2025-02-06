package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class OcitanjaBrojila extends PocetnaStranicaPXD {
	
	public OcitanjaBrojila (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaPeriodWE, kolone.kolonaDatumWE, kolone.kolonaVrstaOcitanjaWE, kolone.kolonaCitacWE, kolone.kolonaKorisnikWE, 
			kolone.kolonaEicWE, kolone.kolonaNazivMjernogMjestaWE, kolone.kolonaBrojiloWE, kolone.kolonaVrijemeUnosaWE, kolone.kolonaAvtWE, kolone.kolonaAmtWE, kolone.kolonaRvtWE, 
			kolone.kolonaRmtWE, kolone.kolonaSnaga1WE, kolone.kolonaAmmOcitanjeWE, kolone.kolonaProcijenjenoWE, kolone.kolonaKorigovanoWE};
	
	public WebElement[] buttons = {dodajBtnWE, ukloniFiltereBtnWE, preuzmiExcelBtnWE, osvjeziBtnWE, infoBtnWE};

	public void navigirajVerifikujOcitanjaBrojila()throws Exception {
		navigateOnPage(OcitanjaBrojila.class, "Očitanja", "Očitanja brojila");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Očitanja brojila')]")));
		verifikacijaStranice("Očitanja", "Očitanja Brojila", "Očitanja brojila", 2, columns, buttons);
	}
	
}