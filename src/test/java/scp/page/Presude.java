package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Presude extends PocetnaStranica{

	public Presude(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
		
	}
	
	public void verifikujPresude()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Presude')]")));
		verifikacijaZajednickihElemenata("TUŽBE", "PRESUDE", "Presude", 11, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojPresudeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStatusPresudeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTuzbaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPresude1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRokPlacanja1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosPresudeWE));
	}

}
