package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class TarifniModeli extends PocetnaStranica{

	public TarifniModeli(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujTarifneModele()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), ' Tarifni modeli')]")));
		verifikacijaZajednickihElemenata("TARIFNI SISTEM", "TARIFNI MODELI", "Tarifni modeli", 5, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOznakaModelaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOsnovaZaObracunWE));
	}
	
}
