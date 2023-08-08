package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class TipoviPotrosaca extends PocetnaStranica{

	public TipoviPotrosaca(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujTipovePotrosaca()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Tipovi potrošača')]")));
		verifikacijaZajednickihElemenata("TARIFNI SISTEM", "TIPOVI POTROŠAČA", "Tipovi potrošača", 8, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKolicinaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOd1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDo1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivno1WE));
	}
}
