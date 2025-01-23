package scp.page;

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

public class Ugovori extends PocetnaStranica{

	public Ugovori(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//*[contains(@class, 'v-select__slot')]//*[@aria-label = 'Kupac']")
	private WebElement kupacWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-select__slot')]//*[@aria-label = 'Tarifna grupa']")
	private WebElement tarifnaGrupaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-select__slot')]//*[@aria-label = 'Mjerilo']")
	private WebElement mjeriloWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-select__slot')]//*[@aria-label = 'Zona']")
	private WebElement zonaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-select__slot')]//*[@aria-label = 'Način obračuna korekcije']")
	private WebElement nacinObracunaKorekcijeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-text-field__slot')]//*[@aria-label = 'Broj Ugovora']") 
	private WebElement brojUgovoraWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-text-field__slot')]//*[@aria-label = 'Bodovi (zona)']") 
	private WebElement bodoviZonaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-text-field__slot')]//*[@aria-label = 'Bodovi (opremljenost)']") 
	private WebElement bodoviOpremljenostWE;
	
	@FindBy(xpath = "//div/div[1]/div[8]/div[1]/div/div/div[1]/div/input")
	private WebElement brojUgovoraVodovodWE;
	
	@FindBy(xpath = "//div/div[1]/div[9]/div[2]/div/div/div[1]/div[1]/input")
	private WebElement zonaDmaWE;
	
	@FindBy(xpath = "//div/div[1]/div[2]/div/div[3]/div/div[1]/div/div")
	private WebElement pausalWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-select__slot')]//*[@aria-label = 'Tip potrošača']")
	private WebElement tipPotrosacaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-text-field__slot')]//*[@aria-label = 'Površina']") 
	private WebElement povrsinaWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-text-field__slot')]//*[@aria-label = 'Površina za grijanje']") 
	private WebElement povrsinaGrijanjeWE;
	

	public void verifikujUgovoreVodovod()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Ugovori')]")));
		verifikacijaZajednickihElemenata2("Kupci", "Ugovori", "Ugovori", 18, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBroj1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTip1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTarifnaGrupa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrClanovaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjeriloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZonaOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPocetkaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPrestankaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivan1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrinudnoOdjavljenWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIskljucen1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPausalWE));
	}
	
	public void verifikujUgovoreToplana()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Ugovori')]")));
		verifikacijaZajednickihElemenata2("Kupci", "Ugovori", "Ugovori", 17, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBroj1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTip1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTarifnaGrupa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjeriloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZonaOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPocetkaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPrestankaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivan1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrinudnoOdjavljenWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIskljucen1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPausalWE));
	}
	
	public void verifikujUgovoreCistoca()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Ugovori')]")));
		verifikacijaZajednickihElemenata2("Kupci", "Ugovori", "Ugovori", 15, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBroj1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTip1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTarifnaGrupa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPocetkaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPrestankaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumIzdavanjaDokumentaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivan1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrinudnoOdjavljenWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIskljucen1WE));
	}
	
	public void verifikujUgovoreOpstina()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Ugovori')]")));
		verifikacijaZajednickihElemenata2("Kupci", "Ugovori", "Ugovori", 15, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBroj1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTip1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTarifnaGrupa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPocetkaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPrestankaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumRjesenja1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivan1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrinudnoOdjavljenWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIskljucen1WE));
	}
	
	public void verifikujUgovoreSon()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Ugovori')]")));
		verifikacijaZajednickihElemenata2("Kupci", "Ugovori", "Ugovori", 13, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOrganizacija1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjeriloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTarifnaGrupa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNapomena1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivan1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIskljucen1WE));
	}
	
	public void verifikujUgovoreGas()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Ugovori')]")));
		verifikacijaZajednickihElemenata2("Kupci", "Ugovori", "Ugovori", 17, false, false, true, true, true, true, true);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBroj1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTip1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTarifnaGrupa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjeriloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZonaOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPocetkaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPrestankaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivan1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrinudnoOdjavljenWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIskljucen1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPausalWE));
	}
	
	public String dodajUgovorGas(String kupac, String mjerilo)throws InterruptedException{
		String brojUgovora = "UG" + Helper.getRandomNumber(4);
		wait.until(ExpectedConditions.elementToBeClickable(kupacWE));
		kupacWE.sendKeys(kupac);
		Thread.sleep(1200);
		kupacWE.sendKeys(Keys.ARROW_DOWN);
		kupacWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(tarifnaGrupaWE));
		tarifnaGrupaWE.sendKeys("1");
		tarifnaGrupaWE.sendKeys(Keys.ARROW_DOWN);
		tarifnaGrupaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(mjeriloWE));
		mjeriloWE.sendKeys(mjerilo);
		Thread.sleep(1200);
		mjeriloWE.sendKeys(Keys.ARROW_DOWN);
		mjeriloWE.sendKeys(Keys.ENTER);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,350)");
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn1WE));
		datumBtn1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		trenutniDatum1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nacinObracunaKorekcijeWE));
		nacinObracunaKorekcijeWE.sendKeys("bez");
		Thread.sleep(500);
		nacinObracunaKorekcijeWE.sendKeys(Keys.ARROW_DOWN);
		nacinObracunaKorekcijeWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(brojUgovoraWE));
		brojUgovoraWE.sendKeys(brojUgovora);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return brojUgovora;
	}
	
	public String dodajUgovorVodovod(String kupac, String mjerilo) throws InterruptedException{
		String brojUgovora = "UG" + Helper.getRandomNumber(4);
		wait.until(ExpectedConditions.elementToBeClickable(kupacWE));
		kupacWE.sendKeys(kupac);
		Thread.sleep(1200);
		kupacWE.sendKeys(Keys.ARROW_DOWN);
		kupacWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(tarifnaGrupaWE));
		tarifnaGrupaWE.sendKeys(Helper.getRandomNubmer1to4(1));
		tarifnaGrupaWE.sendKeys(Keys.ARROW_DOWN);
		tarifnaGrupaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(mjeriloWE));
		mjeriloWE.sendKeys(mjerilo);
		Thread.sleep(1200);
		mjeriloWE.sendKeys(Keys.ARROW_DOWN);
		mjeriloWE.sendKeys(Keys.ENTER);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,350)");
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn1WE));
		datumBtn1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		trenutniDatum1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(brojUgovoraVodovodWE));
		brojUgovoraVodovodWE.sendKeys(brojUgovora);
		wait.until(ExpectedConditions.elementToBeClickable(zonaDmaWE));
		zonaDmaWE.sendKeys(Helper.getRandomNubmer1to4(1));
		Thread.sleep(500);
		zonaDmaWE.sendKeys(Keys.ARROW_DOWN);
		zonaDmaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return brojUgovora;
	}
	
	public String dodajUgovorPausal (String kupac) throws InterruptedException{
		String brojUgovora = "UG" + Helper.getRandomNumber(4);
		wait.until(ExpectedConditions.elementToBeClickable(pausalWE));
		pausalWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kupacWE));
		kupacWE.sendKeys(kupac);
		Thread.sleep(1000);
		kupacWE.sendKeys(Keys.ARROW_DOWN);
		kupacWE.sendKeys(Keys.ENTER);
		trenutniDatum1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tarifnaGrupaWE));
		tarifnaGrupaWE.sendKeys(Helper.getRandomNubmer1to4(1));
		tarifnaGrupaWE.sendKeys(Keys.ARROW_DOWN);
		tarifnaGrupaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(tipPotrosacaWE));
		tipPotrosacaWE.sendKeys("1");
		Thread.sleep(500);
		tipPotrosacaWE.sendKeys(Keys.ARROW_DOWN);
		tipPotrosacaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn1WE));
		datumBtn1WE.click();
		wait.until(ExpectedConditions.invisibilityOf(datumKalendar1WE));
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		wait.until(ExpectedConditions.elementToBeClickable(brojUgovoraWE));
		brojUgovoraWE.sendKeys(brojUgovora);
		wait.until(ExpectedConditions.elementToBeClickable(zonaDmaWE));
		zonaDmaWE.sendKeys("a");
		Thread.sleep(500);
		zonaDmaWE.sendKeys(Keys.ARROW_DOWN);
		zonaDmaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return brojUgovora;
	}
	
	public String dodajUgovorToplana(String kupac)throws InterruptedException{
		String brojUgovora = "UG" + Helper.getRandomNumber(4);
		wait.until(ExpectedConditions.elementToBeClickable(kupacWE));
		kupacWE.sendKeys(kupac);
		Thread.sleep(1000);
		kupacWE.sendKeys(Keys.ARROW_DOWN);
		kupacWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn1WE));
		datumBtn1WE.click();
		wait.until(ExpectedConditions.invisibilityOf(datumKalendar1WE));
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		trenutniDatum1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tarifnaGrupaWE));
		tarifnaGrupaWE.sendKeys("test");
		tarifnaGrupaWE.sendKeys(Keys.ARROW_DOWN);
		tarifnaGrupaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(povrsinaWE));
		povrsinaWE.sendKeys(Helper.getRandomNumber(2));
		wait.until(ExpectedConditions.elementToBeClickable(povrsinaGrijanjeWE));
		povrsinaGrijanjeWE.sendKeys(Helper.getRandomNumber(2));
		wait.until(ExpectedConditions.elementToBeClickable(brojUgovoraWE));
		brojUgovoraWE.sendKeys(brojUgovora);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return brojUgovora;
	}
	
	public String dodajUgovorCistoca(String kupac)throws InterruptedException{
		String brojUgovora = "UG" + Helper.getRandomNumber(4);
		wait.until(ExpectedConditions.elementToBeClickable(kupacWE));
		kupacWE.sendKeys(kupac);
		Thread.sleep(1500);
		kupacWE.sendKeys(Keys.ARROW_DOWN);
		kupacWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(povrsinaWE));
		povrsinaWE.sendKeys(Helper.getRandomNumber(2));
		wait.until(ExpectedConditions.elementToBeClickable(tarifnaGrupaWE));
		tarifnaGrupaWE.sendKeys(Helper.getRandomNubmer1to4(1));
		tarifnaGrupaWE.sendKeys(Keys.ARROW_DOWN);
		tarifnaGrupaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn1WE));
		datumBtn1WE.click();
		wait.until(ExpectedConditions.invisibilityOf(datumKalendar1WE));
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		trenutniDatum1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(brojUgovoraWE));
		brojUgovoraWE.sendKeys(brojUgovora);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return brojUgovora;	
	}
	
	public String dodajUgovorOpstina(String kupac)throws InterruptedException{
		String brojUgovora = "UG" + Helper.getRandomNumber(4);
		wait.until(ExpectedConditions.elementToBeClickable(kupacWE));
		kupacWE.sendKeys(kupac);
		Thread.sleep(1500);
		kupacWE.sendKeys(Keys.ARROW_DOWN);
		kupacWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(povrsinaWE));
		povrsinaWE.sendKeys(Helper.getRandomNumber(2));
		wait.until(ExpectedConditions.elementToBeClickable(zonaWE));
		zonaWE.sendKeys(Helper.getRandomNubmer1to8(1));
		zonaWE.sendKeys(Keys.ARROW_DOWN);
		zonaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(bodoviZonaWE));
		bodoviZonaWE.sendKeys(Helper.getRandomNubmer1to8(2));
		wait.until(ExpectedConditions.elementToBeClickable(bodoviOpremljenostWE));
		bodoviOpremljenostWE.sendKeys(Helper.getRandomNubmer1to8(2));
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn1WE));
		datumBtn1WE.click();
		wait.until(ExpectedConditions.invisibilityOf(datumKalendar1WE));
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		trenutniDatum1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tarifnaGrupaWE));
		tarifnaGrupaWE.sendKeys(Helper.getRandomNubmer1to4(1));
		tarifnaGrupaWE.sendKeys(Keys.ARROW_DOWN);
		tarifnaGrupaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(brojUgovoraWE));
		brojUgovoraWE.sendKeys(brojUgovora);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return brojUgovora;	
	}
	
}
