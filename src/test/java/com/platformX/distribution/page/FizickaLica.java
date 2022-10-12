package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class FizickaLica extends PocetnaStranica {
	
	public FizickaLica(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
		
	}
	
	
	 @FindBy(xpath = "//div[2]/div[1]/div/div/div[1]/div/input")  
	 private WebElement poljeImeIPrezimeWE;
	 
	 @FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div/input")
	 private WebElement poljeStampaniNazivNaDokumentimaWE;
	 
	 @FindBy(xpath = "//div[3]/div[1]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljeMjestoWE;
	 
	 @FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '6 - Banja Luka')]")
	 private WebElement odaberiMjestoWE;
	 
	 @FindBy(xpath = "//div[3]/div[2]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljeUlicaWE;
	 
	 @FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '10950 - Svetog Save')]")
	 private WebElement odaberiUlicuWE;
	 
	 @FindBy(xpath = "//div[3]/div[4]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljePostaWE;
	 
	 @FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '78000 - Banja Luka')]")
	 private WebElement odaberiPostuWE;
	 
	 @FindBy(xpath = "//div[2]/button[1]/span")
	 private WebElement dodajFizickoLiceBtnWE;
	 
	 @FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	 private WebElement filterPoImeIPrezimeWE;
	 
	 @FindBy(xpath = "//tr[2]/td[2]")
	 private WebElement imeIPrezimeTabelaWE;
	 
	 @FindBy(xpath = "//tr[2]/td[1]")
	 private WebElement idTabelaWE;
	 
	
	 
	 

	public void verifikujFizickaLica() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Fizička lica')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaImeIprezimeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojLicneKarteWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEmailWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojTelefonaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivanWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("KUPCI"), "FizickaLica: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("FIZIČKA LICA"), "FizickaLica: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("FIZIČKA LICA"), "FizickaLica: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 8, "FizickaLica: Broj kolona nije dobar! ");
	}
	
	public String dodajFizickoLice() throws InterruptedException, FileNotFoundException, IOException {
		String nazivFizickogLica = "Fizicko lice " + Helper.getRandomString(5);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeImeIPrezimeWE));
		poljeImeIPrezimeWE.sendKeys(nazivFizickogLica);
		wait.until(ExpectedConditions.elementToBeClickable(poljeStampaniNazivNaDokumentimaWE));
		poljeStampaniNazivNaDokumentimaWE.sendKeys(Helper.getRandomString(10));
		wait.until(ExpectedConditions.elementToBeClickable(poljeMjestoWE));
		poljeMjestoWE.sendKeys("6 - Banja Luka");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(odaberiMjestoWE));
		odaberiMjestoWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeUlicaWE));
		poljeUlicaWE.sendKeys("10950 - Svetog Save");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(odaberiUlicuWE));
		odaberiUlicuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljePostaWE));
		poljePostaWE.sendKeys("78000 - Banja Luka");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(odaberiPostuWE));
		odaberiPostuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(dodajFizickoLiceBtnWE));
		dodajFizickoLiceBtnWE.click();
		Thread.sleep(1000);
		return nazivFizickogLica;

	}
	
	public void verifikujFizickoLice(String nazivFizickogLica) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(filterPoImeIPrezimeWE));
		filterPoImeIPrezimeWE.click();
		filterPoImeIPrezimeWE.clear();
		filterPoImeIPrezimeWE.sendKeys(nazivFizickogLica);
		filterPoImeIPrezimeWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(imeIPrezimeTabelaWE));
		assertTrue(imeIPrezimeTabelaWE.getText().contains(nazivFizickogLica),"Fizicka Lica: Naziv fizickog lica nije dobar!");
    }
	
	 public String kreirajPravnoLice() {
		 String kupac = idTabelaWE.getText() + " - " + imeIPrezimeTabelaWE.getText();
			return kupac;
	 }
	 
}


