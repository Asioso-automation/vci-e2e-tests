package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class RegistarPlombi extends PocetnaStranicaPXD {

	public RegistarPlombi(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaOznaka1WE, kolone.kolonaBrojPlombeWE, kolone.kolonaFizickaLokacijaWE, kolone.kolonaStatusWE, 
			kolone.kolonaMonterWE, kolone.kolonaZaduzenjeNapravioWE, kolone.kolonaDatumZaduzenjaWE, kolone.kolonaDatumRazduzenjaWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};
	
	public void navigirajVerifikujRegistarPlombi() throws Exception {
		navigateOnPage(RegistarPlombi.class, "Mjerna mjesta", "Registar plombi");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Registar plombi')]")));
		verifikacijaStranice("Mjerna mjesta", "Registar Plombi", "Registar plombi", 1, columns, buttons);
	}

}