package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Poruke extends PocetnaStranica{

	public Poruke(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujPoruke()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Poruke')]")));
		verifikacijaZajednickihElemenata("ADMINISTRACIJA", "PORUKE", "Poruke", 10, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaslov1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrikaziOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrikaziDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOrganizacija1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKorisnik1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrioritet1WE));
	}
}
