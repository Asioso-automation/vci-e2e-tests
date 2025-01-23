package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class KupciBezUgovora extends PocetnaStranica{

	public KupciBezUgovora(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujKupceBezUgovora()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Kupci bez ugovora')]")));
		verifikacijaZajednickihElemenata2("Kupci", "Kupci Bez Ugovora", "Kupci bez ugovora", 8, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjesto1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaJibJmbgWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipKupcaWE));
	}
	
	
}
