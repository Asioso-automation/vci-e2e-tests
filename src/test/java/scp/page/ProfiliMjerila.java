package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class ProfiliMjerila extends PocetnaStranica{

	public ProfiliMjerila(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujProfileMjerila()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Profili mjerila')]")));
		verifikacijaZajednickihElemenata("ŠIFARNICI", "PROFILI MJERILA", "Profili mjerila", 7, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaknadaZaObracunWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaknadaZaOdvodjenjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivan1WE));
	}

}
