package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ObracunskiUgovori extends PocetnaStranica {
	
	public ObracunskiUgovori(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujObracunskiUgovori() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Obračunski ugovori')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjMjestoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivMjMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaMjMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrenutniSnabdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipUgovoraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrenutnaTGWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrenutnoBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrenutnaKonstWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivanWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("UGOVORI"), "ObracunskiUgovori: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("OBRAČUNSKI UGOVORI"), "ObracunskiUgovori: Naziv stranice nije dobar!");
		assertTrue(naslovStranice1WE.getText().trim().equals("OBRAČUNSKI UGOVORI"), "ObracunskiUgovori: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 12, "ObracunskiUgovori: Broj kolona nije dobar! ");
	}
	
}
