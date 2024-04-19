package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class DaniISatiGrijanja extends PocetnaStranica{

	public DaniISatiGrijanja(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujDaneISateGrijanja()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Dani i sati grijanja')]")));
		verifikacijaZajednickihElemenata("Tarifni Sistem", "Dani I Sati Grijanja", "Dani i sati grijanja", 8, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGrejnaSezonaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGodinaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjesecWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojDanaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSatiWE));
	}
}
