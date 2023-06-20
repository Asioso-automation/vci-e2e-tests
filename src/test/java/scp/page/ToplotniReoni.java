package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class ToplotniReoni extends PocetnaStranica{

	public ToplotniReoni(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujToplotneReone()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and starts-with(., ' Toplotni reoni')]")));
		verifikacijaZajednickihElemenata("ŠIFARNICI", "TOPLOTNI REONI", "Toplotni reoni", 4, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
	}
}
