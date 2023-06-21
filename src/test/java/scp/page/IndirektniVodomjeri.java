package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class IndirektniVodomjeri extends PocetnaStranica{

	public IndirektniVodomjeri(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujIndirektniVodomjeri()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), ' Indirektni vodomjeri')]")));
		verifikacijaZajednickihElemenata("ŠIFARNICI", "INDIREKTNI VODOMJERI", "Indirektni vodomjeri", 10, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivVodomjeraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVodomjerPotrosnjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIndirektniVodomjerWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIndirektniVodomjerPotrosnjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZonaOcitanjaWE));
	}

}
