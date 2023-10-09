package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class GrejneSezone extends PocetnaStranica {

	public GrejneSezone(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujGrejneSezone()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Grejne sezone')]")));
		verifikacijaZajednickihElemenata("OČITANJA", "GREJNE SEZONE", "Grejne sezone", 7, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPocetakGrijanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKrajGrijanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGrejnaSezonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStatus1WE));
	}
	
}
