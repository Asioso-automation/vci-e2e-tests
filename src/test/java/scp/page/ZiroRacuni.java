package scp.page;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;


public class ZiroRacuni extends PocetnaStranica{

	public ZiroRacuni(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujZiroRacune()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Žiro računi')]")));
		verifikacijaZajednickihElemenata("FINANSIJE", "ŽIRO RAČUNI", "Žiro računi", 9, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBroj1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBanka1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaZiroRacunaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOpis1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEmailPosiljaocaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivan1WE));
	}
}
