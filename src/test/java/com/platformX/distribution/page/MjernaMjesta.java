package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

	@FindBy(xpath = "//div[2]/div[1]/div/div/div[1]/div/input")
	 private WebElement poljeSifraWE;

	@FindBy(xpath = "//div[2]/div[4]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljeTerenskaJedinicaWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '1 - Istočno Novo Sarajevo')]")
	 private WebElement odaberiTerenskuJedinicuWE;
	
	@FindBy(xpath = "//div[2]/div[5]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljeFizickaLokacijaWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '301 - 01 - Istočno Novo Sarajevo')]")
	 private WebElement odaberiFizickuLokacijuWE;
	
	@FindBy(xpath = "//div[2]/div[6]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljeTrafoStanicaWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '11120 - 120-Didas')]")
	 private WebElement odaberiTrafoStanicuWE;
	
	@FindBy(xpath = "//div[9]/div/div/div[1]/div/input")
	 private WebElement poljeBrojCitackogHodaWE;
	
	@FindBy(xpath = "//div[3]/div[2]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljeUlicaWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '10950 - Svetog Save')]")
	 private WebElement odaberiUlicuWE;
	
	@FindBy(xpath = "//div[3]/div[4]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljePostaWE;
	
	 @FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '78000 - Banja Luka')]")
	 private WebElement odaberiPostuWE;

	public void verifikujMjernaMjesta() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Mjerna mjesta')]")));
		verifikacijaZajednickihElemenata("Mjerna Mjesta", "Mjerna Mjesta", "MJERNA MJESTA", 14, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSifraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUgovoreniNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivniUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTerenskaJedinicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrafostanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCitackiHodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaImaNapomenuWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPodNaponomWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivanUgovorWE));
	}
	
	public String dodajMjernoMjesto() throws InterruptedException, FileNotFoundException, IOException {
		String sifraMjernogMjesta = Helper.getRandomNumber(6);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeSifraWE));
		poljeSifraWE.sendKeys(sifraMjernogMjesta);
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
		poljeTrafoStanicaWE.sendKeys("11120 - 120-Didas");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiTrafoStanicuWE));
		odaberiTrafoStanicuWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(poljeBrojCitackogHodaWE));
		Thread.sleep(500);
		poljeBrojCitackogHodaWE.click();
		poljeBrojCitackogHodaWE.sendKeys(Helper.getRandomNumber(4));
		wait.until(ExpectedConditions.elementToBeClickable(poljeUlicaWE));
		poljeUlicaWE.sendKeys("10950 - Svetog Save");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiUlicuWE));
		odaberiUlicuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljePostaWE));
		poljePostaWE.sendKeys("78000 - Banja Luka");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiPostuWE));
		odaberiPostuWE.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", submitBtnWE);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return sifraMjernogMjesta;
		
	 }
	
	public String kreirajMjernoMjesto() {
	   String mjernoMjesto = podatak2Tabela2WE.getText();
	   return mjernoMjesto;
	}
	
	 public String urediMjernoMjesto() throws InterruptedException {
		 String sifraMjernogMjesta = Helper.getRandomNumber(6);
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