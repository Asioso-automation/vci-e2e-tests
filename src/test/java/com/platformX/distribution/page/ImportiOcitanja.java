package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ImportiOcitanja extends PocetnaStranicaPXD {
	
	public ImportiOcitanja (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaKorisnikWE, kolone.kolonaCitacWE, kolone.kolonaDatumWE, kolone.kolonaCitackiHodWE, kolone.kolonaTrafostanicaWE, 
			kolone.kolonaFizickaLokacijaWE, kolone.kolonaDatumPrvogOcitanjaWE, kolone.kolonaDatumZadnjegOcitanjaWE, kolone.kolonaIzvorOcitanjaWE, kolone.kolonaUspjesnoImportovanoWE, 
			kolone.kolonaBrojNeuspjesnihUnosaWE, kolone.kolonaBrojUnosaBezVrijednostiSaNapomenomWE, kolone.kolonaBrojUnosaBezVrijednostBezNapomeneWE, kolone.kolonaNevalidnaOcitanjaWE};
	
	public WebElement[] buttons = {importujBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};

	public void navigirajVerifikujImportiOcitanja()throws Exception {
		navigateOnPage(ImportiOcitanja.class, "Očitanja", "Importi očitanja");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Importi očitanja')]")));
		verifikacijaStranice("Očitanja", "Importi Očitanja", "Importi očitanja", 1, columns, buttons);
	}

}