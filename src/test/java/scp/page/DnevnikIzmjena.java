package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class DnevnikIzmjena extends PocetnaStranica{

	public DnevnikIzmjena(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujDnevnikIzmjena()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Dnevnik izmjena')]")));
		verifikacijaZajednickihElemenata2("Administracija", "Dnevnik Izmjena", "Dnevnik izmjena", 7, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTabela1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatum1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdEntiteta1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIzmijenio1WE));
	}
}
