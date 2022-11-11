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

public class ElektroenergetskeSaglasnosti extends PocetnaStranica {
	
	public ElektroenergetskeSaglasnosti(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div[2]/div[1]/div/div/div[1]/div/input")  
	 private WebElement brojProtokolaWE;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement razlogEESWE;
	
	@FindBy(xpath = "//div[3]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement kupacWE;
	
	@FindBy(xpath = "//div[3]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement fizickaLokacijaWE;
	
	@FindBy(xpath = "//div[3]/div[3]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement mjestoWE;
	
	@FindBy(xpath = "//div[4]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement postaWE;
	
	@FindBy(xpath = "//div/div[1]/div[4]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement ulicaWE;

	@FindBy(xpath = "//div[4]/div[3]/div/div/div[1]/div/input")  
	 private WebElement brojUuliciWE;
	
	@FindBy(xpath = "//div[5]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement vrstaObjektaWE;
	
	@FindBy(xpath = "//div[5]/div[2]/div[1]/div/div[1]/div[1]/div/button")  
	 private WebElement datumBtnWE;
	
	@FindBy(xpath = "(//*[contains(@class, 'v-date-picker-table__current')])[1]")  
	 private WebElement datum1WE;
	
	@FindBy(xpath = "//div[7]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement odobrenaPrikljucnaSnagaWE;
	
	@FindBy(xpath = "//div[10]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement naponskiNivoWE;
	
	@FindBy(xpath = "//div[10]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement mjestoPrikljucenjaWE;
	
	@FindBy(xpath = "//div[10]/div[3]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement vrstaPrikljuckaWE;
	
	@FindBy(xpath = "//div[11]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement tipPrikljucnogVodaWE;
	
	@FindBy(xpath = "//div[11]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement presjekMm2WE;
	
	@FindBy(xpath = "//div[12]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement napojnaTransformatorskaStanicaWE;
	
	@FindBy(xpath = "//div[12]/div[4]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement lokacijaMjernogMjestaWE;
	
	@FindBy(xpath = "//div[14]/div[2]/div/div/div/div[1]/div/div/div[1]/div/input")  
	 private WebElement brojUgradjenihBrojilaWE;
	
	@FindBy(xpath = "//div[14]/div[2]/div/div/div/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement nazivnaStrujaGlavnogOsiguracaWE;
	
	@FindBy(xpath = "//div[18]/div[2]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement rokVazenjaWE;
	
	@FindBy(xpath = "//div[18]/div[3]/div[1]/div/div[1]/div[1]/div/button")  
	 private WebElement datumBtn1WE;
	
	@FindBy(xpath = "(//*[contains(@class, 'v-date-picker-table__current')])[2]")
	 private WebElement datum2WE;
	
	@FindBy(xpath = "//div[2]/button[1]/span")  
	 private WebElement dodajElSaglasnostWE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")  
	 private WebElement filterBrojProtokolaWE;
	
	@FindBy(xpath = "//tr[2]/td[2]")
	private WebElement nazivTabelaWE;
	
	@FindBy(xpath = "//tr[2]/td[10]/button/span/i")
	private WebElement burgerBarWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Uspješno završeno.')]")
	private WebElement porukaWE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	private WebElement filterPoNazivuWE;
	
	public void verifikujElektroenergetskeSaglasnosti() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Elektroenergetske saglasnosti')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojProtokolaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaObjektaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipEesWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlogEesWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("MJERNA MJESTA"), "ElektroenergetskeSaglasnosti: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("ELEKTROENERGETSKE SAGLASNOSTI"), "ElektroenergetskeSaglasnosti: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("ELEKTROENERGETSKE SAGLASNOSTI"), "ElektroenergetskeSaglasnosti: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 10, "ElektroenergetskeSaglasnosti: Broj kolona nije dobar! ");
	}
	
	public String dodajElektronergetskuSaglasnost() throws Exception {
		String naziv = "ElSaglasnost" + Helper.getRandomNumber(3);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(brojProtokolaWE));
		brojProtokolaWE.click();
		brojProtokolaWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(razlogEESWE));
		razlogEESWE.click();
		razlogEESWE.sendKeys(Helper.getRandomNumber(1));
		Thread.sleep(1000);
		razlogEESWE.sendKeys(Keys.ARROW_DOWN);
		razlogEESWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(kupacWE));
		kupacWE.click();
		kupacWE.sendKeys(Helper.getRandomNumber(3));
		Thread.sleep(1000);
		kupacWE.sendKeys(Keys.ARROW_DOWN);
		kupacWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(fizickaLokacijaWE));
		fizickaLokacijaWE.click();
		fizickaLokacijaWE.sendKeys(Helper.getRandomNumber(1));
		Thread.sleep(1000);
		fizickaLokacijaWE.sendKeys(Keys.ARROW_DOWN);
		fizickaLokacijaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(mjestoWE));
		mjestoWE.click();
		mjestoWE.sendKeys(Helper.getRandomNumber(1));
		Thread.sleep(1000);
		mjestoWE.sendKeys(Keys.ARROW_DOWN);
		mjestoWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(postaWE));
		postaWE.click();
		postaWE.sendKeys(Helper.getRandomNumber(1));
		Thread.sleep(1000);
		postaWE.sendKeys(Keys.ARROW_DOWN);
		postaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(ulicaWE));
		ulicaWE.click();
		ulicaWE.sendKeys(Helper.getRandomNumber(1));
		Thread.sleep(1000);
		ulicaWE.sendKeys(Keys.ARROW_DOWN);
		ulicaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(brojUuliciWE));
		brojUuliciWE.click();
		brojUuliciWE.sendKeys(Helper.getRandomNumber(2));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(vrstaObjektaWE));
		vrstaObjektaWE.click();
		vrstaObjektaWE.sendKeys("1");
		Thread.sleep(1000);
		vrstaObjektaWE.sendKeys(Keys.ARROW_DOWN);
		vrstaObjektaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(datumBtnWE));
		datumBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(datum1WE));
		datum1WE.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", odobrenaPrikljucnaSnagaWE);
		wait.until(ExpectedConditions.elementToBeClickable(odobrenaPrikljucnaSnagaWE));
		odobrenaPrikljucnaSnagaWE.sendKeys(Helper.getRandomNumber(1));
		Thread.sleep(1000);
		odobrenaPrikljucnaSnagaWE.sendKeys(Keys.ARROW_DOWN);
		odobrenaPrikljucnaSnagaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(naponskiNivoWE));
		naponskiNivoWE.click();
		naponskiNivoWE.sendKeys(Helper.getRandomNumber(1));
		Thread.sleep(1000);
		naponskiNivoWE.sendKeys(Keys.ARROW_DOWN);
		naponskiNivoWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(mjestoPrikljucenjaWE));
		mjestoPrikljucenjaWE.click();
		mjestoPrikljucenjaWE.sendKeys("1");
		Thread.sleep(1000);
		mjestoPrikljucenjaWE.sendKeys(Keys.ARROW_DOWN);
		mjestoPrikljucenjaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(vrstaPrikljuckaWE));
		vrstaPrikljuckaWE.click();
		vrstaPrikljuckaWE.sendKeys("1");
		Thread.sleep(1000);
		vrstaPrikljuckaWE.sendKeys(Keys.ARROW_DOWN);
		vrstaPrikljuckaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(tipPrikljucnogVodaWE));
		tipPrikljucnogVodaWE.click();
		tipPrikljucnogVodaWE.sendKeys(Helper.getRandomNumber(1));
		Thread.sleep(1000);
		tipPrikljucnogVodaWE.sendKeys(Keys.ARROW_DOWN);
		tipPrikljucnogVodaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(presjekMm2WE));
		presjekMm2WE.click();
		presjekMm2WE.sendKeys(Helper.getRandomNumber(1));
		Thread.sleep(1000);
		presjekMm2WE.sendKeys(Keys.ARROW_DOWN);
		presjekMm2WE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(napojnaTransformatorskaStanicaWE));
		napojnaTransformatorskaStanicaWE.click();
		napojnaTransformatorskaStanicaWE.sendKeys(Helper.getRandomNumber(1));
		Thread.sleep(1000);
		napojnaTransformatorskaStanicaWE.sendKeys(Keys.ARROW_DOWN);
		napojnaTransformatorskaStanicaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(lokacijaMjernogMjestaWE));
		lokacijaMjernogMjestaWE.click();
		lokacijaMjernogMjestaWE.sendKeys("1");
		Thread.sleep(1000);
		lokacijaMjernogMjestaWE.sendKeys(Keys.ARROW_DOWN);
		lokacijaMjernogMjestaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(brojUgradjenihBrojilaWE));
		brojUgradjenihBrojilaWE.click();
		brojUgradjenihBrojilaWE.sendKeys(Helper.getRandomNumber(1));
		wait.until(ExpectedConditions.elementToBeClickable(nazivnaStrujaGlavnogOsiguracaWE));
		nazivnaStrujaGlavnogOsiguracaWE.click();
		nazivnaStrujaGlavnogOsiguracaWE.sendKeys("1");
		Thread.sleep(1000);
		nazivnaStrujaGlavnogOsiguracaWE.sendKeys(Keys.ARROW_DOWN);
		nazivnaStrujaGlavnogOsiguracaWE.sendKeys(Keys.ENTER);
		js.executeScript("arguments[0].scrollIntoView(true);", rokVazenjaWE);
		wait.until(ExpectedConditions.elementToBeClickable(rokVazenjaWE));
		rokVazenjaWE.click();
		rokVazenjaWE.sendKeys("1");
		Thread.sleep(1000);
		rokVazenjaWE.sendKeys(Keys.ARROW_DOWN);
		rokVazenjaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn1WE));
		datumBtn1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(datum2WE));
		datum2WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(dodajElSaglasnostWE));
		dodajElSaglasnostWE.click();
		return naziv;
	}
	
	public void verifikujElektroenergetskuSaglasnost(String naziv)throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(filterBrojProtokolaWE));
		filterBrojProtokolaWE.click();
		filterBrojProtokolaWE.clear();
		filterBrojProtokolaWE.sendKeys(naziv);
		filterBrojProtokolaWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(nazivTabelaWE));
		assertTrue(nazivTabelaWE.getText().equals(naziv), "ElektroenergetskaSaglasnost: Broj protokola nije pronadjen!");
	}
	
	public void urediElektroenergetskuSaglasnost() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(odobrenaPrikljucnaSnagaWE));
		odobrenaPrikljucnaSnagaWE.click();
		odobrenaPrikljucnaSnagaWE.clear();
		odobrenaPrikljucnaSnagaWE.sendKeys(Helper.getRandomNumber(1));
		odobrenaPrikljucnaSnagaWE.sendKeys(Keys.ARROW_DOWN);
		odobrenaPrikljucnaSnagaWE.sendKeys(Keys.ENTER);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", dodajElSaglasnostWE);
		dodajElSaglasnostWE.click();
		Thread.sleep(1000);
		assertTrue(porukaWE.getText().equals("Uspješno završeno."), "ElektroenergetskaSaglasnost: Uređivanje nije uspešno!");
	}
	
	public void obrisiElektroenergetskuSaglasnost() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBar1stWE));
		burgerBar1stWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(brisiBurgerBarWE));
		brisiBurgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeWE));
		potvrdiBrisanjeWE.click();
	}

	public void verifikujBrisanjeElektroenergetskeSaglasnosti(String naziv) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(filterPoNazivuWE));
		Thread.sleep(1000);
		filterPoNazivuWE.click();
		filterPoNazivuWE.clear();
		filterPoNazivuWE.sendKeys(naziv);
		filterPoNazivuWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(praznaTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "ElektroenergetskaSaglasnost: Poruka prazne tabele nije dobra!");
	}
	
}