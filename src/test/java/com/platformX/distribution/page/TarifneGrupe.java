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

public class TarifneGrupe extends PocetnaStranica {

	public TarifneGrupe(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//div[1]/div[1]/div/div/div[1]/div/input") 
	private WebElement nazivTarifneGrupeWE;
	
	@FindBy(xpath = "//div[1]/div[2]/div/div/div[1]/div/input") 
	private WebElement ebixSifraWE;
	
	@FindBy(xpath = "//div[2]/div[1]/div/div/div[1]/div[1]/input[1]") 
	private WebElement nadgrupaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'menuable__content__active')]//*[text() = '4 - Domaćinstva']") 
	private WebElement domacinstvaWE;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div[1]/input[1]") 
	private WebElement kategorijaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'menuable__content__active')]//*[text() = '30 - Niski napon 0.4 kV Ostala potrošnja']") 
	private WebElement niskiNaponWE;
	
	@FindBy(xpath = "//div[3]/div/div/div[1]/div[1]/input[1]") 
	private WebElement vrstaBrojilaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'menuable__content__active')]//*[text() = '2 - DT']") 
	private WebElement dtWE;
	
	@FindBy(xpath = "//div[4]/div/div/div[1]/div/div") 
	private WebElement maxigrafWE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input") 
	private WebElement filterPoNazivuWE;
	
	@FindBy(xpath = "//tbody/tr[2]/td[2]") 
	private WebElement nazivTarfineGrupeTabelaWE;

	public void verifikujTarifneGrupe() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Tarifne grupe')]")));
		verifikacijaZajednickihElemenata("TARIFNI SISTEM", "TARIFNE GRUPE", "TARIFNE GRUPE", 9, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEbixSifraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNadgrupaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKategorijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMaxigrafWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaReaktivnaWE));
	}
	
	public String dodajTarifnuGrupu() throws InterruptedException {
		String naziv = "TarifnaGrupa" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivTarifneGrupeWE));
		nazivTarifneGrupeWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(ebixSifraWE));
		ebixSifraWE.sendKeys(Helper.getRandomNumber(4));
		wait.until(ExpectedConditions.elementToBeClickable(nadgrupaWE));
		nadgrupaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(domacinstvaWE));
		domacinstvaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kategorijaWE));
		kategorijaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(niskiNaponWE));
		niskiNaponWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vrstaBrojilaWE));
		vrstaBrojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(dtWE));
		dtWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(maxigrafWE));
		maxigrafWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return naziv;
	}

	public void verifikujTarifnuGrupu(String naziv) throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(filterPoNazivuWE));
		filterPoNazivuWE.click();
		filterPoNazivuWE.clear();
		filterPoNazivuWE.sendKeys(naziv);
		filterPoNazivuWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
	    wait.until(ExpectedConditions.elementToBeClickable(nazivTarfineGrupeTabelaWE));
	    assertTrue(nazivTarfineGrupeTabelaWE.getText().equals(naziv), "TarifnaGrupa: Tarfina grupa nije pronadjena!");
	}
	
	public String urediTarifnuGrupu()throws Exception {
		String tarifnaGrupa = "TarfinaGrupa" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivTarifneGrupeWE));
		nazivTarifneGrupeWE.click();
		nazivTarifneGrupeWE.clear();
		nazivTarifneGrupeWE.sendKeys(tarifnaGrupa);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return tarifnaGrupa;
	}

}