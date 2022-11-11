package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
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

public class MjernaMjesta extends PocetnaStranica {

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
	 
	 @FindBy(xpath = "//div[2]/button[1]/span")
	 private WebElement dodajMjernoMjestoBtnWE;
	 
	 @FindBy(xpath = "//td[3]/div/div/div/div[1]/input")
	 private WebElement filterPoSifriTabelaWE;
	 
	 @FindBy(xpath = "//tr[2]/td[3]")
	 private WebElement sifraTabelaWE;
	 
	 @FindBy(xpath = "//tr[2]/td[2]")
	 private WebElement eicTabelaWE;

	public void verifikujMjernaMjesta() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Mjerna mjesta')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEic2WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSifraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUgovoreniNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivniUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTerenskaJedinicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrafoStanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCitackiHodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaImaNapomenuWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPodNaponomWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivanUgovorWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("MJERNA MJESTA"), "MjernaMjesta: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("MJERNA MJESTA"), "MjernaMjesta: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("MJERNA MJESTA"), "MjernaMjesta: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 14, "MjernaMjesta: Broj kolona nije dobar! ");
	}
	
	public String dodajMjernoMjesto() throws InterruptedException, FileNotFoundException, IOException {
		String sifraMjernogMjesta = Helper.getRandomNumber(6);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeSifraWE));
		poljeSifraWE.sendKeys(sifraMjernogMjesta);
		wait.until(ExpectedConditions.elementToBeClickable(poljeTerenskaJedinicaWE));
		poljeTerenskaJedinicaWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(odaberiTerenskuJedinicuWE));
		odaberiTerenskuJedinicuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeFizickaLokacijaWE));
		poljeFizickaLokacijaWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(odaberiFizickuLokacijuWE));
		odaberiFizickuLokacijuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeTrafoStanicaWE));
		poljeTrafoStanicaWE.sendKeys("11120 - 120-Didas");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(odaberiTrafoStanicuWE));
		odaberiTrafoStanicuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeBrojCitackogHodaWE));
		poljeBrojCitackogHodaWE.sendKeys(Helper.getRandomNumber(4));
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
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", dodajMjernoMjestoBtnWE);
		wait.until(ExpectedConditions.elementToBeClickable(dodajMjernoMjestoBtnWE));
		dodajMjernoMjestoBtnWE.click();
		Thread.sleep(1000);
		return sifraMjernogMjesta;
		
	 }
	
	public void verifikujMjernoMjesto(String sifraMjernogMjesta) throws InterruptedException, FileNotFoundException, IOException {
		wait.until(ExpectedConditions.elementToBeClickable(filterPoSifriTabelaWE));
		filterPoSifriTabelaWE.click();
		filterPoSifriTabelaWE.clear();
		filterPoSifriTabelaWE.sendKeys(sifraMjernogMjesta);
		filterPoSifriTabelaWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(sifraTabelaWE));
		assertTrue(sifraTabelaWE.getText().contains(sifraMjernogMjesta),"Mjerna mjesta: Sifra mjernog mjesta nije dobra!");
		
	 }
	
	public String kreirajMjernoMjesto() {
	   String mjernoMjesto = eicTabelaWE.getText();
	   return mjernoMjesto;
	}

}