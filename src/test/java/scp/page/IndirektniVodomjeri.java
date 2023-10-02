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
	
	public void verifikujIndirektneVodomjeri()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Indirektna potrošnja')]")));
		verifikacijaZajednickihElemenata("ŠIFARNICI", "INDIREKTNA POTROŠNJA", "Indirektna potrošnja", 9, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIndirektniVodomjerWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPotrosnjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVodomjerWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPotrosnjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodOd1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodDo1WE));
	}

}
