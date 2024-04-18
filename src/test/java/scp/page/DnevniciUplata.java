package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class DnevniciUplata extends PocetnaStranica{

	public DnevniciUplata(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujDnevnikeUplata()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Dnevnici uplata')]")));
		verifikacijaZajednickihElemenata("Finansije", "Dnevnici Uplata", "Dnevnici uplata", 13, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBanka1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaKnjizenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIzvodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumIzvoda1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKnjizenja1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrNeprepoznatihUplataWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosNeprepoznatihUplataWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrUplataWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUkupanIznosUplataWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZakljucen1WE));
	}
}
