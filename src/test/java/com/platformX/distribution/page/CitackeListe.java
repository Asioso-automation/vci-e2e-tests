package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class CitackeListe  extends PocetnaStranica{

	public CitackeListe (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
//	@FindBy(xpath = "/html/body/div/div[3]/div/div")
//	private WebElement obradaUTokuBtnWE;
	
	public void verifikujCitackeListe()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Čitačke liste')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCitacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrafostanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCitackiHodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUkupanBrojStavkiWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojOcitanihStavkiWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNeocitaniSaPorukomWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNeocitaniWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdRedgnoBrojaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDoRednogBrojaWE));
		wait.until(ExpectedConditions.visibilityOf(dodajSveBtnWE));
		wait.until(ExpectedConditions.visibilityOf(dodajBtnWE));
		wait.until(ExpectedConditions.visibilityOf(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.visibilityOf(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.visibilityOf(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OČITANJA"), "CitackeListe: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("ČITAČKE LISTE"), "CitackeListe: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("ČITAČKE LISTE"), "CitackeListe: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 12, "CitackeListe: Broj kolona nije dobar! ");
	}

}