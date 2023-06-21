package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class ToplotneStanice extends PocetnaStranica{

	public ToplotneStanice(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujToplotneStanice()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), ' Toplotne stanice')]")));
		verifikacijaZajednickihElemenata("ŠIFARNICI", "TOPLOTNE STANICE", "Toplotne stanice", 9, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaInstalisanaSnagaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaToplotniReonWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaToplovodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaToplotniIzvorWE));
	}

}
