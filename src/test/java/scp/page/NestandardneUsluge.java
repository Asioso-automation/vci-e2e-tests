package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class NestandardneUsluge extends PocetnaStranica{

	public NestandardneUsluge(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujNestandardneUsluge()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Nestandardne usluge')]")));
		verifikacijaZajednickihElemenata("TARIFNI SISTEM", "NESTANDARDNE USLUGE", "Nestandardne usluge", 10, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaziv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaStavkeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaJedinicaMjereWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPredlozenaCijenaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdvStopa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUlaziUKifWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUlaziUOpomeneWE));
	}

}
