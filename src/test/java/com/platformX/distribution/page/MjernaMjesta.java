package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class MjernaMjesta extends PocetnaStranicaPXD {

	public MjernaMjesta(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//div[3]/div[1]/div/div/div[1]/div/input")
	private WebElement poljeSifraWE;
	
	@FindBy(xpath = "//div[4]/div[1]/div/div/div[1]/div/input")
	private WebElement poljeNazivMjernogMjestaWE;
	
	@FindBy(xpath = "//div[4]/div[2]/div/div/div[1]/div/input")
	private WebElement poljeNazivMjmNaStampanimDokWE;
	
	@FindBy(xpath = "//div[5]/div[5]/div/div/div[1]/div[1]/input[1]")
	private WebElement poljeVlasnikWE;
	
	@FindBy(xpath = "//div[5]/div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement poljeTipPotrosacaWE;
	
	@FindBy(xpath = "//div[5]/div[4]/div/div/div[1]/div[1]/input[1]")
	private WebElement poljeLokacijaMjernogMjestaWE;	

	@FindBy(xpath = "//div[5]/div[6]/div/div/div[1]/div[1]/input[1]")
	private WebElement poljeTerenskaJedinicaWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '41 - TJ Bijeljina')]")		// 1 - Istočno Novo Sarajevo > 41 - TJ Bijeljina
	private WebElement odaberiTerenskuJedinicuWE;
	
	@FindBy(xpath = "//div[5]/div[7]/div/div/div[1]/div[1]/input[1]")
	private WebElement poljeFizickaLokacijaWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '4101 - 01 - BIJELJINA')]")		// 301 - 01 - Istočno Novo Sarajevo > 4101 - 01 - BIJELJINA
	private WebElement odaberiFizickuLokacijuWE;
	
	@FindBy(xpath = "//div[5]/div[8]/div/div/div[1]/div[1]/input[1]")
	private WebElement poljeTrafoStanicaWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '410112 - NOVA BANKA')]")			// 11120 - 120-Didas > 410112 - NOVA BANKA
	private WebElement odaberiTrafoStanicuWE;
	
	@FindBy(xpath = "//div[5]/div[11]/div/div/div[1]/div/input")
	private WebElement poljeBrojCitackogHodaWE;
	
	@FindBy(xpath = "//div[7]/div[2]/div/div/div[1]/div[1]/input[1]")
	private WebElement poljeUlicaWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '1001 - JASENICA III')]")			// 10950 - Svetog Save > 1001 - JASENICA III
	private WebElement odaberiUlicuWE;
	
	@FindBy(xpath = "//div[7]/div[4]/div/div/div[1]/div[1]/input[1]")
	private WebElement poljePostaWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '76300 - Bijeljina')]")			// 78000 - Banja Luka > 76300 - Bijeljina
	private WebElement odaberiPostuWE;
	
	public void verifikujMjernaMjesta() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Mjerna mjesta')]")));
		verifikacijaZajednickihElemenata("Mjerna Mjesta", "Mjerna Mjesta", "Mjerna mjesta", 18, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaElektroenergetskaSaglasnostWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSifraEdBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTerenskaJedinicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrafostanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCitackiHodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
//		kolonaLokacijaMjernogMjestaWE
//		kolonaOdobrenaPrikljucnaSnagaWE
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPostojiNapomenaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPodNaponomWE));
//		TODO kolonaUgovorUPripremiWE
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivanUgovorWE));
	}
	
	public String dodajMjernoMjesto(String sifraMjernogMjesta) throws InterruptedException, FileNotFoundException, IOException {
		String nazivMjernogMjesta = "Naziv mjernog mjesta " + sifraMjernogMjesta;
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeSifraWE));
		poljeSifraWE.sendKeys(sifraMjernogMjesta);
		wait.until(ExpectedConditions.elementToBeClickable(poljeNazivMjernogMjestaWE));
		poljeNazivMjernogMjestaWE.sendKeys(nazivMjernogMjesta);
		wait.until(ExpectedConditions.elementToBeClickable(poljeNazivMjmNaStampanimDokWE));
		poljeNazivMjmNaStampanimDokWE.sendKeys(nazivMjernogMjesta);
		wait.until(ExpectedConditions.elementToBeClickable(poljeVlasnikWE));
		poljeVlasnikWE.sendKeys(Helper.getRandomNumber(3));
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		poljeVlasnikWE.sendKeys(Keys.ARROW_DOWN);
		poljeVlasnikWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(poljeTipPotrosacaWE));
		poljeTipPotrosacaWE.click();
		poljeTipPotrosacaWE.sendKeys(Keys.ARROW_DOWN);
		poljeTipPotrosacaWE.sendKeys(Keys.ENTER);		
		wait.until(ExpectedConditions.elementToBeClickable(poljeLokacijaMjernogMjestaWE));
		poljeLokacijaMjernogMjestaWE.click();
		poljeLokacijaMjernogMjestaWE.sendKeys(Keys.ARROW_DOWN);
		poljeLokacijaMjernogMjestaWE.sendKeys(Keys.ENTER);		
		wait.until(ExpectedConditions.elementToBeClickable(poljeTerenskaJedinicaWE));
		poljeTerenskaJedinicaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiTerenskuJedinicuWE));
		odaberiTerenskuJedinicuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeFizickaLokacijaWE));
		poljeFizickaLokacijaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiFizickuLokacijuWE));
		odaberiFizickuLokacijuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeTrafoStanicaWE));
		poljeTrafoStanicaWE.sendKeys("410112 - NOVA BANKA");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiTrafoStanicuWE));
		odaberiTrafoStanicuWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(poljeBrojCitackogHodaWE));
		Thread.sleep(500);
		poljeBrojCitackogHodaWE.click();
		poljeBrojCitackogHodaWE.sendKeys(Helper.getRandomNumber(4));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", poljeUlicaWE);
		wait.until(ExpectedConditions.elementToBeClickable(poljeUlicaWE));
		poljeUlicaWE.sendKeys("1001 - JASENICA III");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiUlicuWE));
		odaberiUlicuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljePostaWE));
		poljePostaWE.sendKeys("76300 - Bijeljina");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiPostuWE));
		odaberiPostuWE.click();
//		js.executeScript("arguments[0].scrollIntoView(true);", submitBtnWE);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return sifraMjernogMjesta;
		
	 }
	
	public String kreirajMjernoMjesto() {
	   String mjernoMjesto = podatak2Tabela3WE.getText();
	   return mjernoMjesto;
	}
	
	 public String urediMjernoMjesto(String sifraMjernogMjesta) throws InterruptedException {
		 wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		 Thread.sleep(800);																// ne radi burgerBarWE.click() bez Thread.sleep
		 burgerBarWE.click();
		 wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		 urediWE.click();
		 try {
			 wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		 } catch (Exception e) {
			 wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		 }
		 wait.until(ExpectedConditions.elementToBeClickable(poljeSifraWE));
		 Thread.sleep(500);
		 poljeSifraWE.click();
		 poljeSifraWE.clear();
		 poljeSifraWE.sendKeys(sifraMjernogMjesta);
		 wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		 submitBtnWE.click();
		 wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		 return sifraMjernogMjesta; 
	 }

}