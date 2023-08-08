package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class TefObrasci extends PocetnaStranica{

	public TefObrasci(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujRacune()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'TEF obrasci')]")));
		verifikacijaZajednickihElemenata("OBRAČUN", "TEF OBRASCI", "TEF obrasci", 6, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUgovor1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriod1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBroj1WE));
	}
}
