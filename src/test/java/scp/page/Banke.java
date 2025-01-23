package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Banke extends PocetnaStranica{

	public Banke(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujBanke()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Banke')]")));
		verifikacijaZajednickihElemenata2("Finansije", "Banke", "Banke", 6, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEmailTrajnogNalogaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivna1WE));
	}

}
