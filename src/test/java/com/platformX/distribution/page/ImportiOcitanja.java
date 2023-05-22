package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ImportiOcitanja extends PocetnaStranicaPXD {
	
	public ImportiOcitanja (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujImportiOcitanja()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Importi očitanja')]")));
		verifikacijaZajednickihElemenata("Očitanja", "Importi Očitanja", "IMPORTI OČITANJA", 15, true, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKorisnikWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCitacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrafostanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPrvogOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumZadnjegOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIzvorOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUspjesnoImportovanoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojPogresnihUnosaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojUnosaBezVrijednostiSaNapomenomWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojUnosaBezVrijednostBezNapomeneWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNevalidnaOcitanjaWE));
	}

}