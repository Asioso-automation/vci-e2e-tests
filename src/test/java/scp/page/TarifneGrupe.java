package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class TarifneGrupe extends PocetnaStranica{

	public TarifneGrupe(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujTarifneGrupe()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), ' Tarifne grupe')]")));
		verifikacijaZajednickihElemenata("TARIFNI SISTEM", "TARIFNE GRUPE", "Tarifne grupe", 8, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGrupaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNadgrupa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPodgrupaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOsnovZaPlacanjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPravnoFizickoWE));
	}
	
}
